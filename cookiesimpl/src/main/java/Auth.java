import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/auth")
public class Auth extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        HttpSession session = req.getSession();
        session.setAttribute("username", username);

        System.out.println(session.getId());

        if ("admin".equals(username)) {
//            RequestDispatcher rd = req.getRequestDispatcher("/home.jsp");
//            rd.forward(req, resp);
            resp.sendRedirect(req.getContextPath() + "/home.jsp");
        } else {
            resp.sendRedirect("/login.jsp");
        }
    }
}
