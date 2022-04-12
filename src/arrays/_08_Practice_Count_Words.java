package arrays;

public class _08_Practice_Count_Words {
    public static void main(String[] args) {
        /*
        Task-1
        Assume you are given a String as below
        Please find how many words you have in the given String

        String s1 = "Today is Tuesday";

        RESULT:
        3
         */
        System.out.println("\n-------Task-1------\n");
        String s1 = "Today is Tuesday";
        String[] sCount = s1.split(" "); // {"Today", "is", "Tuesday"}
        System.out.println(sCount.length);

        /*
        Task-2
        Assume you are given a String as below
        Please find how many words you have in the given String starts with A or a

        String s2 = "Some countries I visited were Argentina, Belgium, abd Malta";

        RESULT:
        2
         */
        System.out.println("\n-------Task-2------\n");

        String s2 = "Some countries I visited were Argentina, , Belgium, and Malta";

        String[] words2 = s2.split(" ");

        int countA = 0;
        for (String word : words2) {
            if (word.toLowerCase().startsWith("a")) countA++;
        }
        System.out.println(countA);







    }
}
