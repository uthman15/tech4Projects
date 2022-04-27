package exceptions;

public class MultipleCatchBlocks {
    public static void main(String[] args) {

        try{
            System.out.println(3/0);
            System.out.println("Hello".charAt(1000));
        }catch (StringIndexOutOfBoundsException se){
            se.printStackTrace();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println("End of the program");
    }
}
