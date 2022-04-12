package learningObjects;

import java.sql.SQLOutput;

public class LearningConcatMethod {
    public static void main(String[] args){

        String tech = "Tech";
        String global = "Global";


        String schoolName1 = tech + global;   //+ operator
        String schoolName2 = tech.concat(global); //concat method 

        System.out.println(schoolName1 + "\n" + schoolName2);

        String myName = "Uthman";
        String myLastName = "Musleh";

        // "Uthman Musleh'

        // create a String variable double quotations
        // create a String variable with '+'
        // create a String variable with concat() method

        String fullName1 ="Uthman Musleh ";
        String fullName2 = myName + " " +
                myLastName;
        String fullName3 = myName.concat(myLastName);
                        // "Uthman".concat()

        // "Musleh"
        " ".concat(myLastName);

        System.out.println("This is fullName1 --> " + fullName1);





    }
}
