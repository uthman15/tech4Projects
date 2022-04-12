package ifElseStatements.nestedIfStatements;

public class GoldNumber {
    public static void main(String[] args) {
        /*
Write a program that generates a random number bt -50 and 50
if number is positive, then we will win 10 points
if number is more than 25, then we will win extra 10 points
if number is -7, then we will win extra 10 points
lastly, if number is 7 (GOLD NUMBER), then will win extra 100 points
*/
        int num = (int) (Math.random() * 101) - 50;
        System.out.println(num);
        int point = 0;

        if (num > 0){
            System.out.println("Win 10 points");

            if (num > 25){
                System.out.println("Win an extra 10 points");
            }else if(num == 7){
                System.out.println("Golden number win an extra 100 points");
            }else if(num < 0){
                if (num < -25){
                }else if(num == -7){
                    System.out.println("Get an extra 10 points");
                }
            }
        }
    }
}
