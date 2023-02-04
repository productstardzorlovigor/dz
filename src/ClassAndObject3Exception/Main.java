package ClassAndObject3Exception;

public class Main {

    private static final String name = "Boris";
    public static int amount = 10000;
    public static void main(String[] args) throws InsufficientAmountException {
            System.out.println(deduct("Boris", 10500));
    }

    public static int deduct(String account_name, int amountToCashOut) throws InsufficientAmountException {
        if (!name.equals(account_name)){
            throw new AccessDeniedException("Account error!");
        }
        if (amount < amountToCashOut){
            throw new InsufficientAmountException("Balance incorrect!");
        }
        amount = amount - amountToCashOut;
        return amount;
    }
}