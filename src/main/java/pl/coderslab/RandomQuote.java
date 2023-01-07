package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@WebServlet(urlPatterns = "/randomquote")
public class RandomQuote extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        List<Quote> quotes;

        if (session.getAttribute("quotes") != null) {
            quotes = (List<Quote>) session.getAttribute("quotes");
            Random random = new Random();
            int randomQuote = random.nextInt(quotes.size());
            Quote quote = quotes.get(randomQuote);
            session.setAttribute("randomQuote",quote );
            getServletContext().getRequestDispatcher("/randomquotes.jsp").
                    forward(req, resp);
        } else {
            resp.getWriter().write("Brak cytatów");
        }
    }
}
