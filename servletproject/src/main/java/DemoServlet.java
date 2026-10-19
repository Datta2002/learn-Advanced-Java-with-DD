import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/demo")
public class DemoServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html"); // set type of response
        PrintWriter out = res.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Servlet Demo</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Hello from Servlet</h1>");
        out.print("<form action='first-servlet' method='get'>");
        out.print("Enter Name :");
        out.print("<input type='text' name='name'>");
        out.print("Enter id :");
        out.print("<input type='number' name='number'>");
        out.print("<input type='submit' name='submit'>");
        req.setAttribute("atb", 120);
        out.print("</form>");
        out.print("</body>");
        out.print("</html>");

    }
}

