import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/error")
public class ErrorPage extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Error");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<h1>Welcome User to Error.</h1>");
        String uname = req.getParameter("uname");
        String passwd = req.getParameter("upass");

        out.print("<h3>User , "+uname+" please check password or username</h3>");
    }
}
