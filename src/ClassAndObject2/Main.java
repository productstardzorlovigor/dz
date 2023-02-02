package ClassAndObject2;

public class Main {
    public static void main(String[] args) {

        Transport vaz2110 = new CombustionCar("Vaz",82,850,CarView.CAR);
        Transport gazel3100 = new CombustionCar("Gazel",115,1200,CarView.PICKUP);
        Transport jeepCherocky = new ElectricCar("JEEP CHAROCKY",250,900,CarView.SUV);

        testTheTransport(vaz2110);
        testTheTransport(gazel3100);
        testTheTransport(jeepCherocky);
    }



    public static void testTheTransport(Transport transport){
        System.out.println("--------------");
        describeTransport(transport);
        driveTransport(transport);
        System.out.println("--------------");
    }

    public static void describeTransport(Transport transport) {
        System.out.println("Name: " + transport.getName() + "\n" +
                "Type: " + transport.getType() + "\n" +
                "Power: " + transport.getPower() + "\n" +
                "Weight: " + transport.getWeight() + "\n" + transport.getClass().getSimpleName());
    }

    public static void driveTransport(Drivable drivable){
        drivable.drive();
    }
}