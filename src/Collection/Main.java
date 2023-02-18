package Collection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] myArray = new String[] {"1","2","3","4","5","6","7","8","9","10"};
        String[] myArray2 = new String[] {"11","12","13","14","15","16","17","18","19","20"};

        List<String> list = new ArrayList<>(List.of(myArray));
        list.addAll(List.of(myArray2));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + list.indexOf(list.get(i)) + "] = " + list.get(i) + ";");
        }
        System.out.println("\nsize: " + list.size());
    }
}
