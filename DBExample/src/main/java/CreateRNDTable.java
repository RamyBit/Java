import java.sql.*;
import java.util.Random;

public class CreateRNDTable {
    static final String DB_URL = "jdbc:postgresql://localhost/test_database";
    static final String USER = "test_user";
    static final String PASS = "333?Post?";

    public static void Run(){
        try (Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
             Statement statement = connection.createStatement();
             ){
            Random random = new Random();
            String QUERY_CREATE = "CREATE TABLE People(" +
                                    "id INT NOT NULL," +
                                    "name VARCHAR(255)," +
                                    "PRIMARY KEY (id)" +
                    "                );";
            statement.executeUpdate(QUERY_CREATE);
            for (int i=0; i<10 ; i++){
                PreparedStatement pstmt = connection.prepareStatement("INSERT INTO People VALUES(?,?);");
                pstmt.setInt(1,random.nextInt(1000));
                pstmt.setString(2,generateNames());
                System.out.println(pstmt.executeUpdate());
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    private static String generateNames(){
        String[] firstNames = {"John", "Jane", "Mike", "Samantha", "Tom"};
        String[] lastNames = {"Doe", "Smith", "Johnson", "Williams", "Brown"};
        Random rand = new Random();
        String firstName = firstNames[rand.nextInt(firstNames.length)];
        String lastName = lastNames[rand.nextInt(lastNames.length)];
        return firstName+" "+lastName;
    }
}
