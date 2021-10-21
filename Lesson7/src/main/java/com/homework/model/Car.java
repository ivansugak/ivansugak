package com.homework.model;

public class Car {

    private String model;
    private int age;
    private final int mileageGastank = 100;
    private int totalMileage = 0;
    private Engine engine;
    private Gastank gastank;

    public Car(String model, int age) {
        this.model = model;
        this.age = age;
        this.engine = new Engine();
        this.gastank =new Gastank();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMileageGastank() {
        return mileageGastank;
    }

    public void onCar(){
        if (!gastank.checkGastank()){
            System.out.println("Gastank is empty!");
        } else {
            engine.onEngine();
            System.out.println("Car work");
        }
    }

    public void offCar(){
        System.out.println("Car is off");
        engine.offEngine();
        gastank.fuelCapacity -= 50;
        totalMileage += mileageGastank;
        System.out.println("TotalMileage is " + totalMileage);
    }

    public void drive(){
        if (!gastank.checkGastank()) {
            System.out.println("Car can't ride");
        } else {
            onCar();
            System.out.println("Car rides");
        }
    }

    private static class Engine{

        private int power;

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        public void onEngine(){
            System.out.println("Engine work");
        }

        public void offEngine(){
            System.out.println("Engine is off");
        }
    }

    private static class Gastank{

        private int fuelCapacity = 100;

        public int getFuelCapacity() {
            return fuelCapacity;
        }

        public void setFuelCapacity(int fuelCapacity) {
            this.fuelCapacity = fuelCapacity;
        }

        public boolean checkGastank(){
            if (fuelCapacity > 0){
                return true;
            } else {
                return false;
            }
        }
    }
}
