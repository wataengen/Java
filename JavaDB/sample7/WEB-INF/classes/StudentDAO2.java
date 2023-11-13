import java.sql.*;
import bean.*;

public class StudentDAO2 {
  private final String URL = "jdbc:mysql://localhost/sampledb";
  private final String USER = "root";
  private final String PASS = "pass";
  private Connection con = null;

  public void connect(){
    try{
      //‡@DB‚ÉÚ‘±
      con = DriverManager.getConnection(URL, USER, PASS);
    } catch(Exception e){
      e.printStackTrace();
    }
  }
  
  public StudentDTO select() {
    Statement stmt = null;
    ResultSet rs = null;
    StudentDTO sdto = new StudentDTO();
    String sql = "SELECT * FROM student";
    try{
      connect();
      //‡AƒXƒe[ƒgƒƒ“ƒg‚ğ¶¬
      stmt = con.createStatement();
      //‡BSQL‚ğÀs
      rs = stmt.executeQuery(sql);
      //‡CŒŸõŒ‹‰Ê‚Ìˆ—
      while(rs.next()){
        StudentBean sb = new StudentBean();
        sb.setNo(rs.getInt("no"));
        sb.setName(rs.getString("name"));
        sb.setScore(rs.getInt("score"));
        sdto.add(sb);
      }
    } catch(Exception e){
      e.printStackTrace();
    } finally {
      try{
        if(rs != null) rs.close();
        if(stmt != null) stmt.close();
      } catch(Exception e){
        e.printStackTrace();
      }
    }
    disconnect();
    return sdto;
  }

  public void disconnect(){
    try{
      //‡DDB‚ğØ’f
      if(con != null) con.close();
    } catch(Exception e){
      e.printStackTrace();
    }
  }
}

