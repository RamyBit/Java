import java.sql.*;
public class FirstExample {
    static final String DB_URL = "jdbc:postgresql://localhost/test_database";
    static final String USER = "test_user";
    static final String PASS = "333?Post?";
    static final String QUERY = "Select id, first, last, age FROM Employees";
    public static void Run(){
        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(QUERY);) {
            //Extract the data from ResultSet
            while (rs.next()){
                System.out.println("ID: "+ rs.getInt("id"));
                System.out.println("First Name: "+ rs.getString("first"));
                System.out.println("Last Name: "+ rs.getString("last"));
                System.out.println("Age: "+ rs.getInt("age"));
                System.out.println("=".repeat(20));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } ;
    }
}
