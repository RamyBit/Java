import java.util.Scanner;  // import the Scanner class

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);


        // Enter username and press Enter
        System.out.println("Enter name, age and salary:");

        // String input
        String name = myScanner.nextLine();

        // Numerical input
        int age = myScanner.nextInt();
        double salary = myScanner.nextDouble();
        // Output input by user
        System.out.println("name is:" + name);
        System.out.println("Age: "+ age);
        System.out.println("Salary: " + salary);
    }
}
