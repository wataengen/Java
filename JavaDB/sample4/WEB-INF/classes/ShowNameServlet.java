import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/showname")
public class ShowNameServlet extends HttpServlet {
  public void doPost(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
    final String URL = "jdbc:mysql://localhost/sampledb";
    final String USER = "root";
    final String PASS = "pass";
    String sql = "SELECT name FROM student WHERE no = 1";
    
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    try{
      con = DriverManager.getConnection(URL, USER, PASS);
      stmt = con.createStatement();
      rs = stmt.executeQuery(sql);
      rs.next();
      String name = rs.getString("name");
      req.setAttribute("name", name);
    } catch(Exception e){
      e.printStackTrace();
    } finally {
      try{
        if(rs != null) rs.close();
        if(stmt != null) stmt.close();
        if(con != null) con.close();
      } catch(Exception e){
        e.printStackTrace();
      }
    }
    RequestDispatcher rd = req.getRequestDispatcher("/showname.jsp");
    rd.forward(req, res);
  }

  public void doGet(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
    doPost(req, res);
  }
}





