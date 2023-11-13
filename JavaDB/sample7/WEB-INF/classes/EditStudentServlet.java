import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import bean.StudentDTO;

@WebServlet("/editStudent")
public class EditStudentServlet extends HttpServlet {
  public void doPost(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
    String msg = "���k�S���̏���\�����܂�";
    //���͒l�ibtn�j���擾
    req.setCharacterEncoding("utf-8");
    String btn = req.getParameter("btn");
    //StudentDAO�I�u�W�F�N�g�𐶐�
    StudentDAO3 sdao = new StudentDAO3();
    //�����{�^���ɂ�镪�򏈗�
    if(btn.equals("�ǉ�")){
      int no = Integer.parseInt(req.getParameter("no"));
      String name = req.getParameter("name");
      int score = Integer.parseInt(req.getParameter("score"));
      sdao.insert(no, name, score);
      msg = "�ԍ�" + no + "�̐��k��ǉ����܂���";
    } else if(btn.equals("�C��")) {
      int no = Integer.parseInt(req.getParameter("no"));
      String name = req.getParameter("name");
      int score = Integer.parseInt(req.getParameter("score"));
      sdao.update(no, name, score);
      msg = "�ԍ�" + no + "�̐��k���C�����܂���";
    } else if(btn.equals("�폜")) {
      int no = Integer.parseInt(req.getParameter("no"));
      sdao.delete(no);
      msg = "�ԍ�" + no + "�̐��k���폜���܂���";
    }
    //�S������
    StudentDTO sdto = sdao.select();
    //���N�G�X�g�X�R�[�v��DTO��msg���i�[
    req.setAttribute("sdto", sdto);
    req.setAttribute("msg", msg);
    //JSP�Ƀt�H���[�h
    RequestDispatcher rd = req.getRequestDispatcher("/editstudent.jsp");
    rd.forward(req, res);
  }

  public void doGet(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
    doPost(req, res);
  }
}

