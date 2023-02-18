package StreamApi;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] array = {"java", "python", "pascal", "basic"};

                Arrays.stream(array)
                        .filter(arrays -> arrays.length() > 5)
                        .map(arrays -> arrays.substring(0, 1).toUpperCase() + arrays.substring(1).toLowerCase())
                        .forEach(System.out::println);
    }
}
