package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/addquote")
public class AddQuote extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    getServletContext().getRequestDispatcher("/addquote.jsp").
            forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String author = req.getParameter("author");
        String quoteText = req.getParameter("quote");
        Quote quote = new Quote(author,quoteText);
        List<Quote> quotes;

        HttpSession session = req.getSession();

        if (session.getAttribute("quotes") != null) {
            quotes = (List<Quote>) session.getAttribute("quotes");
        } else {
            quotes = new ArrayList<>();
        }
        quotes.add(quote);
        session.setAttribute("quotes",quotes);
        doGet(req, resp);
    }
}