package ClassAndObject2;

public class CombustionCar extends Transport{
    public CombustionCar(String name, int power, int weight, CarView type) {
        super(name, power, weight, type);
    }

    @Override
    public void drive() {
        getEngine().startEngine();
        getWheel().steer();
        getEngine().stopEngine();
    }
}
