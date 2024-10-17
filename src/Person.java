import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name; // Имя
    private int birthYear; // Год рождения
    private Person mother; // Мать
    private Person father; // Отец
    private List<Person> children; // Список детей

    // Конструктор
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.children = new ArrayList<>(); // Инициализируем список детей
    }

    // Геттер для имени
    public String getName() {
        return name;
    }

    // Геттер для года рождения
    public int getBirthYear() {
        return birthYear;
    }

    // Сеттер для матери
    public void setMother(Person mother) {
        this.mother = mother;
    }

    // Сеттер для отца
    public void setFather(Person father) {
        this.father = father;
    }

    // Метод для добавления ребенка
    public void addChild(Person child) {
        this.children.add(child);
    }

    // Метод для получения списка детей
    public List<Person> getChildren() {
        return children;
    }

    // Геттер для матери
    public Person getMother() {
        return mother;
    }

    // Геттер для отца
    public Person getFather() {
        return father;
    }
}
