import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class Login extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>User Login Page</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<center>");
        out.print("<h3>User Login</h3>");

        out.print("<form action='validate'>");
        out.print("Enter User Name : <input type='text' name='uname'>");
        out.print("</br></br>");
        out.print("Enter Password : <input type='password' name='upass'>");
        out.print("</br></br>");
        out.print("<button type='submit'>Login</button>");
        out.print("</form>");

        out.print("</center>");
        out.print("</body>");
        out.print("</html>");
    }
}
