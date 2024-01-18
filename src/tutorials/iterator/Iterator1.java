package tutorials.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple..");
        fruits.add("Banana");
        fruits.add("Orange");

        // Using Iterator to iterate over the elements
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}
