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

@WebServlet({"/showproduct"})
public class ShowProduct extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String sql = "select * from product";

        try {
            PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            out.print("<table border=1> ");
            out.print("<tr><th>Product ID </th> <th>Product Name </th><th>Product Price </th><th>Product Quantity </th></tr>");

            while(rs.next()) {
                int var10001 = rs.getInt(1);
                out.print("<tr><td>" + var10001 + "</td>" +
                        "<td>" + rs.getString(2) + "</td>" +
                        "<td>" + rs.getInt(3) + "</td>" +
                        "<td>" + rs.getInt(4) + "</td></tr>");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
