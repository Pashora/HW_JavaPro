// Определение класса Студент
public class Student implements Cloneable {
    // Объявление полей класса
    private String firstName;
    private String lastName;
    private int groupNumber;

    // Конструктор №1: принимает имя, фамилию и номер группы
    public Student(String firstName, String lastName, int groupNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        setGroupNumber(groupNumber);  // Вызов сеттера для проверки номера группы
    }

    // Конструктор №2: конструктор по умолчанию
    public Student() {
        this("Неизвестно", "Неизвестно", 1);  // Вызов первого конструктора с значениями по умолчанию
    }

    // Геттеры и сеттеры для полей класса
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    // Сеттер для номера группы с проверкой на положительность
    public void setGroupNumber(int groupNumber) {
        if (groupNumber <= 0) {
            throw new RuntimeException("Номер группы должен быть положительным");
        }
        this.groupNumber = groupNumber;
    }

    // Метод для перехода в следующую группу
    public void moveToNextGroup() {
        setGroupNumber(getGroupNumber() + 1);
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}