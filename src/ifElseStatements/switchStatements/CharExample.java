package ifElseStatements.switchStatements;

public class CharExample {
    public static void main(String[] args) {
        char character = '$';

        switch (character){
            case 'A':
                System.out.println("It is uppercase and is the first letter in the alphabet");
                break;
            case '5':
                    System.out.println("It is a digit");
                    break;
            case '$':
                System.out.println("It is a dollar sign");
                break;
            default:
                System.out.println("It is not A, 5 or $");
        }
    }
}
