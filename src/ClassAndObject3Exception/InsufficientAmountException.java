package ClassAndObject3Exception;

public class InsufficientAmountException extends Exception{

    public InsufficientAmountException(){

    }

    public InsufficientAmountException(String message) {
        super(message);
    }
}