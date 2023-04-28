import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[10];
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i <= 10; i++) {
            list.add(new Integer(i));
            intArray[i-1] = i;
        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.println(i);
        }
        List<String> stringList
                = fromArrayToList(intArray, Object::toString);
    }

    public static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction){
        return Arrays.stream(a).map(mapperFunction).collect(Collectors.toList());
    }
}