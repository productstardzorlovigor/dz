package ClassAndObject5firstProgram.Phonebook;

import java.util.Objects;
import java.util.Scanner;

import static ClassAndObject5firstProgram.Phonebook.Main.in;
import static ClassAndObject5firstProgram.Phonebook.Person.*;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        initBD();
        findAll();
    }
}

record Person(String name, String phone, String email) {
    private static final Person[] persons = new Person[10];

    public static void initBD() {
        persons[0] = new Person("Юля", "89210000000", "Julia@yandex.com");
        persons[1] = new Person("Сергей", "777777", "borya@yandex.com");
        persons[2] = new Person("Друган", "23566777", "univer@yandex.com");
        persons[3] = new Person("EvilBoss", "456546546", "boss@yandex.com");
        persons[4] = new Person("Anna", "+79216661666", "mylove@yandex.com");
    }

    public String toString() {
        return "\n\nName: " + this.name() + "\nPhone number: " + this.phone() + "\nEmail: " +
                this.email();
    }

    // поиск человека
    public static void findPerson(String searchType, String searchString) {

        switch (searchType) {
            case "1" ->
                //по имени
                    System.out.println(findName(searchString, persons));
            case "2" ->
                //по телефону
                    System.out.println(findPhone(searchString, persons));
            case "3" ->
                // по почте
                    System.out.println(findEmail(searchString, persons));
            default -> {
            }
        }
    }

    public static Person findName(String name, Person[] persons) {
        for (Person person : persons) {
            if (person == null) continue;
            if (person.name().equals(name)) {
                return person;
            }
        }
        System.out.println("нет такого человека");
        return null;
    }

    public static Person findPhone(String phone, Person[] persons) {
        for (Person person : persons) {
            if (person == null) continue;
            if (person.phone().equals(phone)) {
                return person;
            }
        }
        System.out.println("нет такого человека");
        return null;
    }

    public static Person findEmail(String email, Person[] persons) {
        for (Person person : persons) {
            if (person == null) continue;
            if (person.email().equals(email)) {
                return person;
            }
        }
        System.out.println("нет такого человека");
        return null;
    }

    public static void findAll(){
        while (true) {
            System.out.println("Для того чтобы найти по имени введите 1, по номеру 2, по email 3, для выхода 4: ");
            String searchType = in.nextLine();
            if (Objects.equals(searchType, "")){
                System.out.println("Строка поиска не может быть пустой");
                continue;
            }
            if (searchType.equals("4")) {
                System.out.println("Всего Вам доброго!");
                break;
            }

            System.out.print("Введите поисковое значение: ");
            String searchString = in.nextLine();

            findPerson(searchType, searchString);

            System.out.println("\nПродолжить поиск? Да/Нет");
            String forExit = in.nextLine();
            if (forExit.equalsIgnoreCase("Нет") | forExit.equalsIgnoreCase("No")){
                System.out.println("Всего Вам доброго!");
                break;
            }
        }
    }
}
/*
 ДЗ
Дописать методы поиска для телефона и почты
Сделать так же выход
Продумать обработку исключений для поиска по пустым значениям
*/