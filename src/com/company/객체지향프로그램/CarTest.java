package com.company.객체지향프로그램;

public class CarTest {
    public static void main(String[] args) {
        Car c = new Car("black", "auto", 4);
        System.out.println(c.color + c.gearType + c.door);
    }
}
