package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса Car
        Car myCar = new Car(CarType.SPORTS_CAR, "Opel", "Astra", 650);

        // Устанавливаем значения для полей
        myCar.carType = CarType.TRUCK; // публичное поле, можно установить напрямую
        myCar.brand = "BMW"; // поле без модификатора доступа, можно установить напрямую в том же пакете

        // Для приватных полей используем геттеры и сеттеры
        myCar.setModel("S-500"); // устанавливаем модель
        myCar.setHorsepower(500); // устанавливаем мощность

        // Выводим значения полей
        System.out.println("Car Type: " + myCar.carType);
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Horsepower: " + myCar.getHorsepower());
    }
}
