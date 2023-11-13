import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import bean.StudentDTO;

@WebServlet("/showStudents")
public class ShowStudentsServlet extends HttpServlet {
  public void doPost(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
    StudentDAO2 sdao = new StudentDAO2();
    StudentDTO sdto = sdao.select();
    req.setAttribute("sdto", sdto);
    RequestDispatcher rd = req.getRequestDispatcher("/showstudents.jsp");
    rd.forward(req, res);
  }

  public void doGet(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
    doPost(req, res);
  }
}

