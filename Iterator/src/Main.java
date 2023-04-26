// Import the ArrayList class and the Iterator class
import java.util.ArrayList;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {

        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("VW");
        cars.add("Tesla");

        // Get the iterator
        Iterator<String> it = cars.iterator();
        while (it.hasNext()){
            String car = it.next();
            if(car == "VW"){
                it.remove();
            }
        }
        System.out.println(cars);
    }
}