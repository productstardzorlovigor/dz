package ClassAndObject;

public abstract class Human {
    int age;
    String name;
    public void sound(){
        System.out.println("Hello, my name is " + name + " and I'm is " + age + " years old and I'm a " + getClass().getSimpleName());
    }
}