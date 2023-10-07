// Класс Car, который представляет собой автомобиль
public class Car {
    private String type;  // Переменная для хранения типа автомобиля

    // Конструктор класса Car, который принимает тип автомобиля в качестве параметра
    public Car(String type) {
        this.type = type;
    }

    // Метод для получения типа автомобиля
    public String getType() {
        return type;
    }
}