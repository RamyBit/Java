import java.util.ArrayList; // Import the ArrayList class
import java.util.Collection; // Import the Collections class
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(); // Create an Arraylist object
        ArrayList<Integer> num = new ArrayList<Integer>();
        cars.add("Volvo ");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("VW");
        num.add(123);
        num.add(324);
        num.add(444);
        num.add(556);
        Collections.sort(num); // Sort num

        while (cars.size() -1 > -1){
            System.out.println("Car to remove "+cars.get(cars.size() -1) + " with a number: "+ num.get(cars.size() -1));
            cars.remove(cars.size() -1);
        }
        System.out.println(cars);
    }
}