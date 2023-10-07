// Класс Factory, который производит различные типы автомобилей
public class Factory {
    // Метод для производства спортивного автомобиля
    public Car produceSportsCar() {
        return new Car("SportsCar");
    }

    // Метод для производства грузовика
    public Car produceTruck() {
        return new Car("Truck");
    }

    // Метод для производства легкового автомобиля
    public Car produceLightVehicle() {
        return new Car("LightVehicle");
    }
}