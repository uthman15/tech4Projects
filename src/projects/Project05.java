package projects;


import java.util.Scanner;

public class Project05 {
    public static void main(String[] args) {

        System.out.println("-------Task1-------\n");
        String name = "TechGlobal";
        String beginning = name.substring(0,4);
        String ending = name.substring(name.length()-4);
        String newName = "";

        name = name.replace(beginning,"").replace(ending,"");
        newName = ending + name + beginning;

        System.out.println(newName);

        System.out.println("\n-------Task2-------\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = scanner.nextLine();

        if(sentence.contains(" ")) {
            String newSent = sentence.substring(sentence.lastIndexOf(" ") + 1)
                    + sentence.substring(sentence.indexOf(" "), sentence.lastIndexOf(" ") + 1)
                    + sentence.substring(0, sentence.indexOf(" "));

            System.out.println(newSent);
        }else System.out.println("This sentence does not have 2 or more words to swap");


        System.out.println("\n-------Task3-------\n");
        System.out.println("Enter a sentence");
        String str1 = scanner.nextLine();

        if(str1.contains("stupid") || str1.contains("idiot")){
            str1 = str1.replace("stupid", "nice").replace("idiot", "nice");
        }
        System.out.println(str1);


        System.out.println("\n-------Task4-------\n");

        System.out.println("Enter your name");
        String name1 = scanner.nextLine();
        int x;
        if(name1.length() > 2){

            if(name1.length() % 2 == 0){
                x = name1.length() / 2;
                System.out.println(name1.substring(x - 1, x + 1));
            }else{
                x = name1.length() / 2;
                System.out.println(name1.charAt(x));
            }



        }else System.out.println("Invalid input!!!");


        System.out.println("\n-------Task5-------\n");

        System.out.println("Enter a country");
        String country = scanner.nextLine();

        if(country.length() > 5){

            country = country.replace(country.substring(0,2),"").replace(country.substring(country.length()-2),"");


            System.out.println(country);

        }else System.out.println("Invalid input!!!");


        System.out.println("\n-------Task6-------\n");

        System.out.println("Please enter your full address");
        String address = scanner.nextLine();
        address = address.replace("a", "*").replace("A", "*").replace("e", "#")
                .replace("E", "#").replace("i", "+").replace("I", "+")
                .replace("u", "$").replace("U", "$").replace("o", "@")
                .replace("O", "@");
        System.out.println(address);


        System.out.println("\n-------Task7-------\n");

        int randomNumber1 = (int)(Math.random() * 26);
        int randomNumber2 = (int)(Math.random() * 26);
        int min = Math.min(randomNumber1, randomNumber2);
        int max = Math.max(randomNumber1, randomNumber2);
        String s11 = "";
        for (int i = min; i <= max; i++) {
            if (i % 5 != 0) s11 += (i + " - ");
        }
        System.out.println(s11);


    }

}
