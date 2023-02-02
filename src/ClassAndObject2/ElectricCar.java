package ClassAndObject2;

public class ElectricCar extends Transport{
    public ElectricCar(String name, int power, int weight, CarView type) {
        super(name, power, weight, type);
    }

    @Override
    public void drive() {
        getWheel().steer();
    }
}
