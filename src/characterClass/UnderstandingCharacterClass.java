package characterClass;

import utilities.CharacterHelper;

import java.io.CharConversionException;

public class UnderstandingCharacterClass {
    public static void main(String[] args) {

        char c = 'c';
        boolean b = Character.isDigit('9');
        System.out.println(b);

        System.out.println(Character.isDigit('9')); // true

        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isUpperCase('B'));

        System.out.println(Character.isLowerCase('G'));
        System.out.println(Character.isLowerCase('h'));

        System.out.println(Character.isLetter('l'));
        System.out.println(Character.isLetter('Z'));

        System.out.println(Character.isLetterOrDigit('5'));
        System.out.println(Character.isLetterOrDigit('t'));
        System.out.println(Character.isLetterOrDigit(' '));

        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isSpaceChar(' '));

        char c2 = '$';

        System.out.println(!Character.isLetterOrDigit(c2) && !Character.isSpaceChar(c2));

        char c3 = 'A';

        String s = "AEOUIaeiou";
        System.out.println(s.contains(c3 + ""));

        char c4 = 'a';
        boolean isC4Vowel = false;

        for (int i = 0; i < s.length(); i++) {
            if (c4 == s.charAt(i)){
                isC4Vowel = true;
                break;
            }
        }



        if(isC4Vowel) System.out.println("c4 is Vowel");
        else System.out.println("C4 is not Vowel");

    }
}
