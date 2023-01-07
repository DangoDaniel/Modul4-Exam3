package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/smurfs")
public class smurfs extends HttpServlet {

    SmurfDao smurfDao = new SmurfDao();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("SmurfsList", smurfDao.getList());
        getServletContext().getRequestDispatcher("/WEB-INF/smurfs.jsp").
                forward(req,resp);
    }
}
