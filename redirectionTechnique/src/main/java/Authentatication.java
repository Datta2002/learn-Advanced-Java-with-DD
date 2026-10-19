import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/validate")
public class Authentatication extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Authenticating User");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Welcome User to Authentatication.</h1>");

        String uname = req.getParameter("uname");
        String pass = req.getParameter("upass");
        System.out.println("Username : " + uname
        + " Password : " + pass);

         if(uname.equals("abc") && pass.equals("123")){
             RequestDispatcher dis = req.getRequestDispatcher("welcome");
//             dis.forward(req,resp);
             dis.include(req,resp);
         }
         else {
//             RequestDispatcher dis = req.getRequestDispatcher("error");
//             dis.forward(req,resp);
//             dis.include(req,resp);

             resp.sendRedirect("error");
         }
    }
}
