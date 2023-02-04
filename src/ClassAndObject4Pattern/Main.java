package ClassAndObject4Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static String email = "_Ab._bc.d@Abc.Com";
    public static void main(String[] args) {
        System.out.println(testEmail(email));
    }

    public static boolean testEmail(String email){
        String EMAIL_PATTERN = "^[_A-Za-z0-9]+(\\.[_A-Za-z0-9]+)*@[A-Za-z0-9]+(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}