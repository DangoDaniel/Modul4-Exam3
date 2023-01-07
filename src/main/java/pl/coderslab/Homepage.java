package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/homepage")
public class Homepage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if ("yes".equals(req.getParameter("agree"))){
            Cookie cookie = new Cookie("agree", "yes");
            resp.addCookie(cookie);
        }
        resp.sendRedirect("/homepage.jsp");
    }
}
