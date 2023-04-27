import java.util.ArrayList;

interface StringFunction{
    String run(String str);
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(6);
        nums.add(9);
        nums.add(2);
        nums.forEach((x) -> {System.out.println(x);});
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Why",ask);
    }

    public static void printFormatted(String str, StringFunction format){
        System.out.println(format.run(str));
    }
}