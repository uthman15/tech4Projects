package collectionsFramework;

import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        // numbers.add(null); //this line will throw NullPointerException

        // [1, 2, 3, 5]
        System.out.println(numbers);
    }
}
