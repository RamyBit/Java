import java.util.HashMap; // Import the HashMap class
public class Main {
    public static void main(String[] args) {
        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Jessica", 33);

        for (String name: people.keySet()) {
            System.out.println("Name: "+  name + "  "+ "Age: "+ people.get(name));
        }
    }
}