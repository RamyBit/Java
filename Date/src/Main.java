import java.time.LocalDate; // import the LocalDate class
import java.time.LocalTime; // import the LocalTime class
import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // Create a date object
        LocalTime time = LocalTime.now(); // Create a time object
        LocalDateTime dateTime = LocalDateTime.now(); // Create a dateTime object
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String formattedDate = dateTime.format(myFormatter);
        System.out.println(date); // Display the current date
        System.out.println(time); // Display the current time
        System.out.println(dateTime); // Display the current time
        System.out.println(formattedDate);
    }
}
