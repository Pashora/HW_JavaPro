// Класс для хранения пары строк
public class Pair {
    // Приватные поля first и second
    private String first;
    private String second;

    // Геттеры для полей first и second
    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    // Блок инициализации
    {
        // Выводим в консоль значение полей first и second
        System.out.println("first: " + first + ", second: " + second);
        // Присваиваем полю first значение "one", а полю second значение "two"
        first = "one";
        second = "two";
    }

    // Конструктор по умолчанию (без входных параметров)
    public Pair() {
        // Выводим в консоль значение полей first и second
        System.out.println("first: " + first + ", second: " + second);
    }

    // Конструктор, который принимает параметры first и second и обновляет значения соответствующих полей
    public Pair(String first, String second) {
        // Обновляем значения полей first и second
        this.first = first;
        this.second = second;
        // Выводим в консоль значение полей first и second
        System.out.println("first: " + first + ", second: " + second);
    }
}
