package utilities;

public class CharacterHelper {

    //Task-1
    public static boolean isSpace(char space){
        return space == ' ';
    }

    //Task-2
    public static boolean isDigit(char digit){
        return digit >= 48 && digit <= 57;
    }

    //Task-3
    public static boolean isUppercase(char upper) {
        return upper >= 65 && upper <= 90;
    }

    //Task-4
    public static boolean isLowercase(char lower) {
        return lower >= 97 && lower <= 122;
    }

    //Task-5
    public static boolean isLetter(char letter) {
        return letter >= 65 && letter <= 90 || letter >= 97 && letter <= 122;
    }

    //Task-6
    public static boolean isVowel(char vowel) {
        return (vowel == 'A') || (vowel == 'E') || (vowel == 'O') || (vowel == 'U') || (vowel == 'I') || (vowel == 'a') || (vowel == 'e') ||
                (vowel == 'o') || (vowel == 'u') || (vowel == 'i');
    }

    //Task-7
    public static boolean isConsonant(char consonant) {
        return (consonant >= 66 && consonant <= 68) || (consonant >= 70 && consonant <= 72) || (consonant >= 74 && consonant <= 78)
                || (consonant >= 80 && consonant <= 84) || (consonant >= 86 && consonant <= 90) || (consonant >= 98 && consonant <= 100)
                || (consonant >= 102 && consonant <= 104) || (consonant >= 106 && consonant <= 110)
                || (consonant >= 112 && consonant <= 116) || (consonant >= 118 && consonant <= 122);

    }

}
