import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/first-servlet")
public class FirstServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Welcome to the first servlet");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println(req.getParameter("name"));
        out.println(Integer.parseInt(req.getParameter("number")));
//        out.println("Attribute value : "+ req.getAttribute("atb"));
    }
}
