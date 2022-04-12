package ifElseStatements.ifElseStatements;

public class WeekdayOrWeekend {
    public static void main(String[] args) {
        // if it is weekend right out "it is weekend!"
        // else it is weekday

        boolean isWeekday = false;
        String str = "";
        String anotherSTR = "";

        // you CANNOT use relational operators with objects
        // you can use relational operators with primitives

        if (!isWeekday) {
            System.out.println("it is weekend!");
        } else {
            System.out.println("it is weekday!");
        }
    }
}