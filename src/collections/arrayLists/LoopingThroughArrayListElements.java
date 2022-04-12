package collections.arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LoopingThroughArrayListElements {
    public static void main(String[] args) {

        /*
        ArrayList<dataType> VarName = new ArrayList<>();
        List<dataType> varName = new ArrayList<>();
         */

        List<Character> chars = new ArrayList<>();
        chars.add('D');
        chars.add('A');
        chars.add('B');
        chars.add('C');

        System.out.println("My list before sort = " + chars);
        Collections.sort(chars);
        System.out.println("My list after sort = " + chars);

        System.out.println("\n------Print each element with fori loop----\n");
        chars.get(0); // A
        chars.get(1); // B
        chars.get(2); // C
        chars.get(3); // D

        for (int i = 0; i < chars.size(); i++) {
            System.out.println(chars.get(i));
        }

        System.out.println("\n------Print each element with for each loop----\n");
        for (Character element : chars) {
            System.out.println(element);
        }


    }
}
