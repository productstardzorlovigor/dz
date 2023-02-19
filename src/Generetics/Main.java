package Generetics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        HorsesHouse<Horse> horsesHouse = new HorsesHouse<>();
        HorsesHouse<Animal> animalHorsesHouse = new HorsesHouse<>();

        Abstang abstang = new Abstang();
        horsesHouse.addHorse(abstang);
        List<Abstang> wildAbstangs = new ArrayList<>();
        wildAbstangs.add(new Abstang());
        wildAbstangs.add(new Abstang());
        horsesHouse.addHorses(wildAbstangs);

        Altay altay = new Altay();
        horsesHouse.addHorse(altay);
        List<Altay> wildAltays = new ArrayList<>();
        wildAltays.add(new Altay());
        wildAltays.add(new Altay());
        horsesHouse.addHorses(wildAltays);

        Mustang mustang = new Mustang();
        horsesHouse.addHorse(mustang);
        List<Mustang> wildMustangs = new ArrayList<>();
        wildMustangs.add(new Mustang());
        wildMustangs.add(new Mustang());
        horsesHouse.addHorses(wildMustangs);

        moveHorses(horsesHouse, animalHorsesHouse);

        Object[] horses = horsesHouse.getHorses().toArray();

        for (Object hors : horses) {
            System.out.println(hors);
        }

    }

    public static <T> void moveHorses(HorsesHouse<? extends  T> source, HorsesHouse<? super T> destination){
        destination.addHorses(source.getHorses());
    }
}
