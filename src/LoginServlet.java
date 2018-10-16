import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("user");
        String password = request.getParameter("pass");

        PrintWriter writer = response.getWriter();
        writer.print("<html>");
        if ("admin".equals(username) && "admin".equals(password)) {
            writer.print("<h1>Welcome " + username + ".</h1>");
        } else {
            writer.print("<h1>Error!!!</h1>");
        }
        writer.print("</html>");

        int i = 9;
        i++;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
