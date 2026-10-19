import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/life-cycle")
public class ServletLife extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("ServletLife init");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ServletLife service");
    }

    @Override
    public void destroy() {
        System.out.println("ServletLife destroy");
    }
}
