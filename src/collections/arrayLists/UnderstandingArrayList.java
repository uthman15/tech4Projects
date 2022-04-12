package collections.arrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class UnderstandingArrayList {
    public static void main(String[] args) {

        //1. Declaring an Array vs ArrayList
        String[] namesArray = new String[5];

        ArrayList<String> namesList = new ArrayList<>();

        // 2. How to print the size of Array vs ArrayList
        System.out.println("\n------Printing size of Array vs ArrayList");
        System.out.println("Size of the array = " + namesArray.length); // 5
        System.out.println("Size of the ArrayList = " + namesList.size()); // 0

        // 3. How to add elements to Array vs ArrayList
        namesArray[0] = "Abe";
        namesArray[4] = "Data";
        //namesArray[7] = "John"; //ArrayIndexOutOfBoundsException Runtime error

        namesList.add("Abe"); // add method that takes object
        namesList.add(1, "Data"); // Add object to a specific index [Abe, Data]
        namesList.add(1, "John"); // [Abe, John, Data]
        namesList.add("Alone"); // [Abe, John, Data, Alona]
        namesList.add("Max"); // [Abe, John, Data, Alona, Max]
        namesList.add("James"); //[James, Abe, John, Data, Alona, Max]

        namesList.set(3, "Lionel"); //


        // 4. How to print Array vs ArrayList
        System.out.println(Arrays.toString(namesArray)); // [Abe, null, null, null, null, Lionel]
        System.out.println(namesList); // [James, Abe, John, Lionel, Alona, Max]

        namesList.add("Andrei");
        System.out.println(namesList);// [James, Abe, John, Lionel, Alona, Max, Andrei]

        namesList.add(5, "Taylor"); // [James, Abe, John, Lionel, Alona, Taylor, Max, Andrei]
        System.out.println(namesList);

        namesList.set(3, "Daria");
        System.out.println(namesList); // [James, Abe, John, Daria, Alona, Taylor, Max, Andrei]

        namesList.add("Regina");
        namesList.add("Regina");
        namesList.add("Regina");
        namesList.add(null);
        namesList.add(null);
        namesList.add(null);
        namesList.add("Guluzar");

        System.out.println(namesList);
        System.out.println(namesList.size());

        // namesList.remove(7) this will remove element at index of 7
        // namesList.remove("James") this will remove James
        // namesList.removeAll(collectionOfElementsToBeRemoved) this will remove all the elements from the given collection

        namesList.remove(0); // James
        System.out.println(namesList); //[Abe, John, Daria, Alona, Taylor, Max, Andrei, Regina, Regina, Regina, null, null, null, Guluzar]

        System.out.println(namesList.remove(2)); // Daria
        System.out.println(namesList);//[Abe, John, Alona, Taylor, Max, Andrei, Regina, Regina, Regina, null, null, null, Guluzar]


        namesList.remove("Alona");
        System.out.println(namesList); // [Abe, John, Taylor, Max, Andrei, Regina, Regina, Regina, null, null, null, Guluzar]

        System.out.println(namesList.remove("John")); // true
        System.out.println(namesList);// [Abe, Taylor, Max, Andrei, Regina, Regina, Regina, null, null, null, Guluzar]


        System.out.println(namesList.remove("max"));
        System.out.println(namesList.remove("Melda"));
        System.out.println(namesList); // [Abe, Taylor, Max, Andrei, Regina, Regina, Regina, null, null, null, Guluzar]

        namesList.add(0, "Regina");
        System.out.println(namesList); // [Regina, Abe, Taylor, Max, Andrei, Regina, Regina, Regina, null, null, null, Guluzar]

        System.out.println(namesList.get(3)); // Max
        System.out.println(namesList.get(5)); // Regina
        System.out.println(namesList); //[Regina, Abe, Taylor, Max, Andrei, Regina, Regina, Regina, null, null, null, Guluzar]

        System.out.println(namesList.indexOf("Regina")); // 0
        System.out.println(namesList.lastIndexOf("Regina")); // 7
        System.out.println(namesList.indexOf("Nataliia")); // -1
        System.out.println(namesList.lastIndexOf("Nataliia")); // -1

        System.out.println(namesList.contains("Max")); // true
        System.out.println(namesList.contains("max")); // false
        System.out.println(namesList.contains("Kaly")); // false

        System.out.println(namesList.isEmpty()); // false

        //namesList.removeAll(namesList);
        namesList.clear();
        System.out.println(namesList.size()); // 0
        System.out.println(namesList.isEmpty()); // true
        /*
        ConcurrentModificationException
        for (String name : namesList){ // 12
            if(name.equals("Regina")) namesList.remove(name);
        }
         */
    }
}
