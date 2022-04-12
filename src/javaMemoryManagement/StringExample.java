package javaMemoryManagement;

public class StringExample {
    public static void main(String[] args) {

//one way to create string
        String name = "John";

//second way to create String
        String name2 = new String("Alex");

        String name3 = "Alex";
        String name4 = "John";

//To compare Strings, DONT EVER USE == OPERATOR
        System.out.println(name == name4); //true
        System.out.println(name2 == name3); //false
        System.out.println(name2.equals(name3)); //true
    }
}