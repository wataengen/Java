import java.sql.*;

public class StudentDAO {
  private final String URL = "jdbc:mysql://localhost/sampledb";
  private final String USER = "root";
  private final String PASS = "pass";
  private Connection con = null;

  public void connect(){
    try{
      //�@DB�ɐڑ�
      con = DriverManager.getConnection(URL, USER, PASS);
    } catch(Exception e){
      e.printStackTrace();
    }
  }
  
  public String select(int stuNo) {
    Statement stmt = null;
    ResultSet rs = null;
    String result = null;
    String sql = "SELECT name FROM student WHERE no = " + stuNo;
    try{
      //�A�X�e�[�g�����g�𐶐�
      stmt = con.createStatement();
      //�BSQL�����s
      rs = stmt.executeQuery(sql);
      //�C�������ʂ̏���
      rs.next();
      result = rs.getString("name");
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
    return result;
  }

  public void disconnect(){
    try{
      //�DDB��ؒf
      if(con != null) con.close();
    } catch(Exception e){
      e.printStackTrace();
    }
  }
}

