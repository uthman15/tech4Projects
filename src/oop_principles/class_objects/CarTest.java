package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);

        System.out.println(car1.getClass().getName());
        System.out.println(car1.equals(car1));

        car1.make = "Tesla";
        car1.model = "S";
        car1.year = 2022;
        car1.color = "Red";

        System.out.println(car1.make); // Tesla
        System.out.println(car1.model); // S
        System.out.println(car1.year); // 2022
        System.out.println(car1.color); // Red

        Car car2 = new Car();
        car2.make = "BMW";
        car2.color = "White";
        System.out.println(car2.make);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);

        Car car3 = new Car();
        car3.make = "Audi";
        System.out.println(car3.make);
        System.out.println(car3.model);
        System.out.println(car3.year);
        System.out.println(car3.color);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        car1.drives(); // This car drives
        car2.drives(); // This car drives
        car3.drives(); // This car drives

        car1.honks(); // This car honks
        car2.honks(); // This car honks
        car3.honks(); // This car honks

        Car car4 = new Car();
        car4.make = "Tesla";
        car4.model = "X";
        car4.year = 2022;
        car4.color = "Black";

        System.out.println("\n-----Cars List-------\n");
        List<Car> myCars = new ArrayList<>();
        myCars.add(car1);
        myCars.add(car2);
        myCars.add(car3);
        myCars.add(car4);

        // Print the cars which are Tesla

        for (Car myCar : myCars) {
            if (myCar.make.equals("Tesla"))System.out.println(myCar);
        }


    }
}
