package pl.dominisz;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class TimeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        LocalDate today = LocalDate.now();
        out.println("<h1>Dzisiaj jest " + today + "</h1>");
        out.println("<h1>Godzina " + LocalTime.now() + "</h1>");
        if (today.getDayOfWeek() == DayOfWeek.TUESDAY) {
            out.println("<h1>Hurra!!! Wtorek!!!</h1>");
        }
        out.println("<h1>Zażółć gęślą jaźń</h1>");
    }

}
