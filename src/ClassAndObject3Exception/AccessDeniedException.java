package ClassAndObject3Exception;

public class AccessDeniedException extends RuntimeException{
    public AccessDeniedException(String message) {
        super(message);
    }

    public AccessDeniedException(){

    }
}
