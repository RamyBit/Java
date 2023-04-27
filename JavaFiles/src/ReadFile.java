import java.io.File; // Import the file class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner;// Import the Scanner class to read text files

public class ReadFile {
    public static void Read(){
        try {
            File file = new File("test.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNext()){
                String data = reader.nextLine();
                System.out.println(data);
            }
        }catch (FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void GetFileInfo(){
        File file = new File("test.txt");
        if (file.exists()){
            System.out.println("File name: " + file.getName());
            System.out.println("Absolut path: "+ file.getAbsolutePath());
            System.out.println("Writeable: " + file.canWrite());
            System.out.println("Readable " + file.canRead());
            System.out.println("File size in bytes: " + file.length());
        }else {
            System.out.println("The file does not exist.");
        }
    }
}
