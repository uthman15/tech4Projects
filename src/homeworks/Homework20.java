package homeworks;


import java.util.ArrayList;
import java.util.Arrays;

public class Homework20 {

    // Task-1
    public static boolean hasLowercase(String str){
        boolean isLowercase = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))){
                isLowercase = true;
                break;
            }
        }
        return isLowercase;
    }

    // Task-2
    public static ArrayList<Integer> noZero(ArrayList<Integer> numbers){
    numbers.removeIf(element -> element == 0);
    return numbers;
    }

    //Task-3
    public static int[][] numbersAndSquare(int[] arr){
        int[][] numbersGroup = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            numbersGroup[i][0] = arr[i];
            numbersGroup[i][1] = arr[i] * arr[i];
        }
        return numbersGroup;
    }

    //Task-4
    public static boolean containsValue(String[] arr, String s){
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, s) >= 0;
    }

    //Task-5
    public static String reverseSentence(String s){
        String[] words = s.split(" ");
        if (words.length < 2) return "There is not enough words";
        else{
            words[0] = (words[0].charAt(0) + "").toLowerCase() + words[0].substring(1);
            words[words.length - 1] = (words[words.length - 1].charAt(0) + "").toUpperCase() + words[words.length - 1].substring(1);
            String reverse = "";
            for (int i = words.length - 1; i >= 0 ; i--) {
                reverse += words[i] + " ";
            }
            return reverse;
        }
    }

    //Task-6
    public static String removeStringSpecialsDigits(String s){
        s = s.replaceAll("[^a-zA-Z ]", "");
        return s;
    }
    //Task-7
    public static String[] removeArraySpecialsDigits(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replaceAll("[^a-zA-Z]", "");
        }
        return arr;
    }

    //TASK-8
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> s1, ArrayList<String>s2){
        ArrayList<String> commonWords = new ArrayList<>();
        for (int i = 0; i < s1.size(); i++) {
            for (int j = 0; j < s2.size(); j++) {
                if (s1.get(i).equals(s2.get(j)) && (!commonWords.contains(s1.get(i)))){
                    commonWords.add(s1.get(i));
                }
            }
        }
        return commonWords;
    }

    //TASK-9
    public static ArrayList<String> noXInVariables(ArrayList<String> list){
        ArrayList<String> noXs = new ArrayList<>();
        for (String element : list) {
            if (element.toLowerCase().contains("x") && !element.toUpperCase().equals("X")){
                element = element.replaceAll("[xX]", "");
                noXs.add(element);
            }else noXs.add(element);
        }
        return noXs;
    }

    public static void main(String[] args) {
        System.out.println("\n--------TASK-1--------");
        System.out.println(hasLowercase("125$"));
        System.out.println(hasLowercase("hello"));

        System.out.println("\n--------TASK-2--------");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        System.out.println(noZero(new ArrayList<>(numbers)));

        System.out.println("\n--------TASK-3--------");
        System.out.println(Arrays.deepToString(numbersAndSquare(new int[]{1, 2, 3})));
        System.out.println(Arrays.deepToString(numbersAndSquare(new int[]{0, 3, 6})));
        System.out.println(Arrays.deepToString(numbersAndSquare(new int[]{1, 4})));

        System.out.println("\n--------TASK-4--------");
        System.out.println(containsValue(new String[]{"abc", "foo", "java"}, "hello"));
        System.out.println(containsValue(new String[]{"abc", "def", "123"}, "Abc"));
        System.out.println(containsValue(new String[]{"abc", "def", "123", "java", "hello"}, "123"));

        System.out.println("\n--------TASK-5--------");
        System.out.println(reverseSentence("Hello"));
        System.out.println(reverseSentence("Java is fun"));
        System.out.println(reverseSentence("This is a sentence"));

        System.out.println("\n--------TASK-6--------");
        System.out.println(removeStringSpecialsDigits("123Java #$%is fun"));
        System.out.println(removeStringSpecialsDigits("Selenium"));
        System.out.println(removeStringSpecialsDigits("Selenium 123#$%Cypress"));

        System.out.println("\n--------TASK-7--------");
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"123Java", "#$%is", "fun"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123$%", "###"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123#$%Cypress"})));

        System.out.println("\n--------TASK-8--------");
        ArrayList<String> s1 = new ArrayList<>();
        s1.add("Java");
        s1.add("is");
        s1.add("fun");

        ArrayList<String> s2 = new ArrayList<>();
        s2.add("abc");
        s2.add("xyz");
        s2.add("123");
        System.out.println(removeAndReturnCommons(new ArrayList<>(s1), new ArrayList<>(s2)));

        System.out.println("\n--------TASK-9--------");
        ArrayList<String> list = new ArrayList<>();
        list.add("xyz");
        list.add("123");
        list.add("#$%");
        System.out.println(noXInVariables(new ArrayList<>(list)));

    }
}
