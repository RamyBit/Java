import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        boolean flag = false;

        Pattern pattern = Pattern.compile("please", Pattern.CASE_INSENSITIVE);


        while (!flag){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your wishes: ");
            String wishes = input.nextLine();
            Matcher matcher = pattern.matcher(wishes);
            if (!matcher.find()){
                System.out.println("What is the magic word?");
            }else {
                System.out.println("Your Wishes are my command!");
                flag = true;
            }
        }
    }
}