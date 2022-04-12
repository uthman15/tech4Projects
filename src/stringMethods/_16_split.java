package stringMethods;

import java.util.Arrays;

public class _16_split {
    public static void main(String[] args) {

        String s = "Banana is nice";

        String[] sSplitFromSpaces = s.split(" ");

        System.out.println(Arrays.toString(sSplitFromSpaces));

        String[] sSplitFromI = s.split("i"); //

        System.out.println(Arrays.toString(sSplitFromI));
    }
}
