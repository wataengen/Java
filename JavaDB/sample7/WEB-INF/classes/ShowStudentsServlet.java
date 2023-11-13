import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import bean.StudentDTO;

@WebServlet("/showStudents")
public class ShowStudentsServlet extends HttpServlet {
  public void doPost(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
    //DAO�I�u�W�F�N�g�𐶐�
    StudentDAO2 sdao = new StudentDAO2();
    //�S�������������ʂ�DTO�I�u�W�F�N�g�Ƃ��Ď擾
    StudentDTO sdto = sdao.select();
    //�������ʂ����N�G�X�g�X�R�[�v�Ɋi�[
    req.setAttribute("sdto", sdto);
    //JSP�Ƀt�H���[�h
    RequestDispatcher rd = req.getRequestDispatcher("/showstudents.jsp");
    rd.forward(req, res);
  }

  public void doGet(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
    doPost(req, res);
  }
}

