package ClassAndObject5firstProgram.Stock;

public record Main(String name) {

    private static final Main[] stocks = new Main[10];

    public static void main(String[] args) {
        initDB();
        showAll();
    }

    public static void initDB() {
        stocks[0] = new Main("утюг");
        stocks[1] = new Main("сковородка");
        stocks[2] = new Main("лыжи");
        stocks[3] = new Main("утюг2");
        stocks[4] = new Main("пылесос");
    }

    public static void showAll() {
        System.out.println("Показать всех: ");
        for (Main stock : stocks) {
            System.out.println(stock);
        }
    }


    public String toString() {
        return "\nName: " + this.name();
    }
}
