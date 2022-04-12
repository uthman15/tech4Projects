package oop_principles.class_objects;

public class Car {

    //Default constructor
    public Car(){

    }

    /*
    Attributes of a car
    make, model, year, color
    Attributes are defining what every object of car should have
     */

    //Declaring attributes or field of Car
    public String make;
    public String model;
    public int year;
    public String color;

    //Defining some behaviors of the Car Objects
    //WHAT CAR DOES

    public void drives(){
        System.out.println("This car drives");
    }

    public void honks(){
        System.out.println("This car honks");
    }


    //Override toString() method that comes from Object class
    //Overriding is implementing another body from the parent method
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
