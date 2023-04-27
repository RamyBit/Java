import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {
    public static void Write(){
        try {
            FileWriter writer = new FileWriter("test.txt");
            writer.write("Files in Java might be tricky, but it is fun!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        }catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
