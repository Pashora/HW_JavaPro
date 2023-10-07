//2 Создайте класс Завод. Класс будет производить три вида автомобилей (иметь 3 метода) – спорткар,
// грузовик, легковой. В основной программе создайте несколько автомобилей с помощью класса Завод.
// Главный класс, в котором выполняется основная логика программы
public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();  // Создание нового объекта Factory
        Car sportsCar = factory.produceSportsCar();  // Производство спортивного автомобиля
        Car truck = factory.produceTruck();  // Производство грузовика
        Car lightVehicle = factory.produceLightVehicle();  // Производство легкового автомобиля

        // Вывод типов автомобилей на консоль
        System.out.println(sportsCar.getType());
        System.out.println(truck.getType());
        System.out.println(lightVehicle.getType());
    }
}
