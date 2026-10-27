package org.example;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Civic");
        car1.setBrand("Honda");
        car1.setYear(2024);
        car1.setPrice(35000);
        car1.setColor("Black");
        car1.setQuantity(5);

        Car car2 = new Car();
        car2.setModel("Civic");
        car2.setBrand("Honda");
        car2.setYear(2024);
        car2.setPrice(35000);
        car2.setColor("Black");
        car2.setQuantity(5);

        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);

        System.out.println("car1 equals car2: " + car1.equals(car2));
        System.out.println("car1 hashCode: " + car1.hashCode());
        System.out.println("car2 hashCode: " + car2.hashCode());
    }
}