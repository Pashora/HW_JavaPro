// Главный класс программы
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Создание объекта студента
        Student student1 = new Student("Славик", "Куликов", 1);

        // Клонирование объекта студента
        Student student2 = (Student) student1.clone();

        // Проверка, что объекты имеют разные ссылки в памяти
        System.out.println(student1 == student2);

        // Изменение одного из полей оригинального студента
        student1.setFirstName("Сергей");

        // Проверка, изменилось ли то же поле у клона
        System.out.println(student1.getFirstName());
        System.out.println(student2.getFirstName());
    }
}