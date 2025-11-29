package productdetail;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet({"/saveproduct"})
public class SaveProduct extends HttpServlet {
    PreparedStatement ps = null;

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        boolean result = false;
        String checksql = "select * from tab where lower(tname)='product'";
        System.out.println("Saving Product !!");

        try {
            ps = DBConnection.getConnection().prepareStatement(checksql);
            System.out.println("check req !!");
            ResultSet rs = ps.executeQuery();
            result = rs.next();
            System.out.println("printing result : " + result);
            if (!result) {
                String createsql = "create table product (id number, name varchar(255), price number(20), quantity number)";

                try {
                    ps = DBConnection.getConnection().prepareStatement(createsql);
                    int count = ps.executeUpdate();
                    if (count > 0) {
                        out.print("Table created !");
                    } else {
                        out.print("Table not created");
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        int id = Integer.parseInt(req.getParameter("productId"));
        String name = req.getParameter("productName");
        int price = Integer.parseInt(req.getParameter("productPrice"));
        int quantity = Integer.parseInt(req.getParameter("productQuantity"));
        String sql = "insert into product values(?,?,?,?)";

        try {
            ps = DBConnection.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, price);
            ps.setInt(4, quantity);
            int count = ps.executeUpdate();
            if (count > 0) {
                out.print("Product created successfully !");
            } else {
                out.print("Product creation failed");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
