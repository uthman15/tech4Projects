package collections.arrayLists;

import java.util.Iterator;
import java.util.LinkedList;

public class _03_Practice_Remove_Elements {
    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");

        //[Java, JavaScript, C#, Python, C++]

        /*
        Remove Python from the list and print it

        [Java, JavaScript, C#, C++]
         */
        System.out.println("\n----Task-1-----\n");
        languages.remove("Python");
        System.out.println(languages);


        /*
        Remove all elements that start with J

        Result:
        [C#, C++]
         */
        System.out.println("\n-----Task-2-----\n");
        LinkedList<String> startedWithJ = new LinkedList<>();
        for (String language : languages) {
            if (language.charAt(0) == 'J') startedWithJ.add(language);
        }
        languages.removeAll(startedWithJ);
        System.out.println(languages);

        /*

        languages.removeIf(x -> x.startsWith("J"));
        System.out.println(languages);

         */

        //Using Iterator


        Iterator<String> iterator = languages.iterator(); // I put all the elements in a queue

         while (iterator.hasNext()){ // We are asking if there is an element in the queue
             String element = iterator.next(); // this gets an element from the queue
             if (element.startsWith("J")){ // if element came from the queue starts with J
                 iterator.remove(); // remove
             }
         }
        System.out.println(languages);

    }
         }