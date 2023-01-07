package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(urlPatterns = "/regex")
public class Regex extends HttpServlet {

    public static final String REGEX ="[a-z]+\\.(gif|jpg|png)";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String param = req.getParameter("param1");

        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(param);

        if (matcher.matches()){
            resp.sendRedirect("https://www.google.pl/search?q=" + param);
        }else{
            resp.getWriter().append("Niepoprawna nazwa");
        }


    }
}
