package casting;

public class ConvertingPrimitivesToString {
    public static void main(String[] args) {

        int num = 36;

        // + (concatenation)
        // valueOf() method


        String numStr1 = num + "";
        String numStr2 = String.valueOf(num);

        System.out.println("numStr1" + numStr1);


    }
}
