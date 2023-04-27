import java.io.File;
public class DeleteFile {
    public static void Delete(){
        try {
            File file = new File("test.txt");
            if (file.delete()){
                System.out.println("Deleted the file: "+ file.getName());
            }else{
                System.out.println("Failed to delete the file: " + file.getName() );
            }
        } catch (Exception e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
