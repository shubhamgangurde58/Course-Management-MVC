
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CourseInfoServlet")
public class CourseInfoServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException
    {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        int courseId = Integer.parseInt(request.getParameter("courseId"));
        String courseName = request.getParameter("courseName");
        double courseFees = Double.parseDouble(request.getParameter("courseFees"));

        out.println("<html><body>");
        out.println("<h2>Course Information</h2>");
        out.println("<p>Course ID: " + courseId + "</p>");
        out.println("<p>Course Name: " + courseName + "</p>");
        out.println("<p>Course Fees: $" + courseFees + "</p>");
        out.println("</body></html>");

    }

}