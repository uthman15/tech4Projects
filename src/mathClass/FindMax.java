package mathClass;

public class FindMax {
    public static void main(String[] args) {
        // Math Class
        // max() method: Finds the largest number from the given numbers

        int x = 8;
        int y = 20;
        int z = 6;
        int a = 34;
        int b = 123;


        int maxValueOfXY = Math.max(x,y); //char can be put as well
        int maxValueOfXYZ = Math.max(maxValueOfXY, z);
        int maxValueOfAB = Math.max(a, b);

        int maxOfEvery = Math.max(Math.max(Math.max(8,20), 12_345), Math.max(34, 123));


        System.out.println(maxValueOfXY);
        System.out.println(maxValueOfXYZ);
    }

}
