import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;

public class InsertStudent2{

  public static void main(String[] args){
  
    final String URL = "jdbc:mysql://localhost/sampledb";
    final String USER = "root";
    final String PASS = "pass";
    String sql = "INSERT INTO student VALUES(?,?,?)";
    String[] names = {"藤原", "草野", "常田", "John"};
    int[] score = {90, 85, 80, 100};
    
    Connection con = null;
    PreparedStatement ps = null;

    try{
      //①DBに接続
      con = DriverManager.getConnection(URL, USER, PASS);
      //②ステートメントを生成
      ps = con.prepareStatement(sql);
      //③SQLを実行
      for(int i =0; i < names.length; i++) {
        ps.setInt(1, i + 8);
        ps.setString(2, names[i]);
        ps.setInt(3, score[i]);
        ps.executeUpdate();
      }
      System.out.println(names.length + "件更新しました");
    } catch(Exception e){
      e.printStackTrace();
    } finally {
      try{
        //④リソースを解放
        if(ps != null) ps.close();
        if(con != null) con.close();
      } catch(Exception e){
        e.printStackTrace();
      }
    }
  }
}
