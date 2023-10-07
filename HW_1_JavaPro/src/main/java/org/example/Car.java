package org.example;

public class Car {
    public CarType carType;
    String brand;
    private String model;
    private int horsepower;

    public Car(CarType carType, String brand, String model, int horsepower) {
        this.carType = carType;
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
