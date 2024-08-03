package com.JavaPractical;
public class OverRiding{
    static class Vehicle{
        public void move(){
             System.out.println("Vehicle is moving...");
    }
    }
        static class Car extends Vehicle {
             @Override
            public void move(){
             System.out.println("Car is moving on the road...");
            }

        }
        static class Bike extends Vehicle { 
            @Override
            public void move(){
                System.out.println("Bike Has Only two tyres...");
            }  
        }
    public static void main(String[] args){
        Car car = new Car();
        Bike bike = new Bike();
        car.move();
        bike.move();
    }
}
