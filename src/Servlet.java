import com.company.Entities.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "ServletOne")
public class Servlet extends HttpServlet {
    Servlet ns = new Servlet();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User firstUser = new User(request.getParameter("username"),request.getParameter("password"));
        if(firstUser.username.isEmpty() || firstUser.password.isEmpty()){
            if(firstUser.username.isEmpty()) response.sendRedirect("http://localhost:8080/web_war_exploded/");
            response.sendRedirect("/index.jsp"); }
        request.getRequestDispatcher("/welcome.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String message = getServletConfig().getInitParameter("namespace");
        PrintWriter writer = response.getWriter();
        try {
            writer.println("<h2>" + message + "</h2>");
        } finally {
            writer.close();
        }
    }
    @Override
    public String getServletInfo(){
        return ns.getServletInfo();
    }
}
