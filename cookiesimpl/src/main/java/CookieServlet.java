import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");

        Cookie cookie = new Cookie("username", name);  // cerete cookie with name and value
        cookie.setMaxAge(60 * 60 ); // set cookie to expire in 1 hour
        resp.addCookie(cookie);  // add cookie to response

        PrintWriter out = resp.getWriter();
        out.println("<h1>Cookie Created with Name: " + name + "</h1>");
    }
}
