package stringMethods;

public class PracticeFindMiddle {
    public static void main(String[] args) {
        String name1 = "Taylor";
        char first = name1.charAt(0);
        char last = name1.charAt(name1.length()-1);

        System.out.println("" + name1.charAt(name1.length()/2-1) + name1.charAt(name1.length()/2)); // because even

        // if its odd to find middle
        String name2 = "Alona";
        System.out.println(name2.length()/2);
    }
}
