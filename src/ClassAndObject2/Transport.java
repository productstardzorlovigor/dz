package ClassAndObject2;

public abstract class Transport implements Drivable{
    private String name;
    private int power;
    private int weight;
    private CarView type;
    private Engine engine;
    private Wheel wheel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public CarView getType() {
        return type;
    }

    public void setType(CarView type) {
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Transport(String name, int power, int weight, CarView type) {
        this.name = name;
        this.power = power;
        this.weight = weight;
        this.type = type;
        this.engine = new Engine();
        this.wheel = new Wheel();
    }

}
