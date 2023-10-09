import java.util.Arrays;

//№3
//Напишите класс Велосипед  с минимум пятью полями. В программе создайте 3 разных велосипеда (например, шоссейный, горный, детский) и выведите каждый из них в консоль.
//Создайте массив из этих велосипедов. С помощью Arrays.toString() превратите массив в строку и выведите в консоль. Запустите программу.
//Вернитесь в объявление класса велосипед. Переопределите метод toString, чтобы он выводил полное описание велосипеда по его полям.
//Перейдите в код метода Arrays.toString() и посмотрите на его реализацию. В какой момент автомобиль становится строкой внутри этого метода?
//
public class Main {
    public static void main(String[] args) {
        Bicycle[] bicycles = new Bicycle[3];
        bicycles[0] = new Bicycle("Road bike", "Red", 28, 21, true);
        bicycles[1] = new Bicycle("Mountain bike", "Green", 26, 18, false);
        bicycles[2] = new Bicycle("Kids bike", "Blue", 20, 6, true);

        for (Bicycle bicycle : bicycles) {
            System.out.println(bicycle);
        }

        System.out.println(Arrays.toString(bicycles));
    }
}
// автомобиль становится строкой внутри метода Arrays.toString() на этапе создания строки для вывода.
// Это происходит при вызове метода String.valueOf(), который вызывается для каждого элемента массива.