package ClassAndObject;

public class Main {
    public static void main(String[] args) {


        Student Igor = new Student();
        Igor.age = 38;
        Igor.name = "Igor";
        Docent Petya = new Docent();
        Petya.age = 65;
        Petya.name = "Petya";

        Igor.sound();
        Petya.sound();
    }
}