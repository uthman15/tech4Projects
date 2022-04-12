package arrays;

public class _07_Practice_Find_The_Longest_String {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "yellow", "brown", "white"};

        /*
        Find the string that has the most characters and print it

        RESULT:
        yellow
         */

        String longest = colors[0];

        for (String color : colors) {
            if (color.length() > longest.length()) longest = color;
        }

        System.out.println(longest);
    }
}
