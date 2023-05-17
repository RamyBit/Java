import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {
    static final String DB_URL = "jdbc:postgresql://localhost/test_database";
    static final String USER = "test_user";
    static final String PASS = "333?Post?";

    static void Run(String dbName){
         String QUERY = String.format("CREATE DATABASE %s",dbName);
         try (Connection conn= DriverManager.getConnection(DB_URL,USER,PASS);
              Statement stmt = conn.createStatement()){
              stmt.executeUpdate(QUERY);
              System.out.println(String.format("Database %s created successfully!", dbName));
         }catch (SQLException e){
             e.printStackTrace();
         }
    }
}
