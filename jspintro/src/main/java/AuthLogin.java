import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/validate")
public class AuthLogin extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Step 1: fetch parameter
        String username = req.getParameter("uname");
        String password = req.getParameter("pass");

        System.out.println("username: " + username);
        System.out.println("password: " + password);

        // Database connection

        Connection con= DBConnection.getConnection();

        String sql = "select * from empuser where username=? and password=? ";

        try {
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, username);
            psmt.setString(2, password);
            ResultSet rs = psmt.executeQuery();

            if (rs.next()) {
                System.out.println("Welcome" +username);
                RequestDispatcher rd = req.getRequestDispatcher("/welcome.jsp");
                rd.forward(req,resp);
            }
            else {
                System.out.println("Invalid username or password");
                resp.sendRedirect(req.getContextPath()+"/index.jsp");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
