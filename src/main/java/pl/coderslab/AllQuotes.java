package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/allquotes")
public class AllQuotes extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Quote> quotes;
        HttpSession session = req.getSession();
        if(session.getAttribute("quotes")!=null){
            quotes = (List<Quote>)session.getAttribute("quotes");
            getServletContext().getRequestDispatcher("/allquotes.jsp").
                    forward(req,resp);
        }else{
            resp.getWriter().write("Brak cytatów");
        }
    }
}
