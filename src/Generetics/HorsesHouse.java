package Generetics;

import java.util.ArrayList;
import java.util.List;

public class HorsesHouse<T> {
    private final List<T> horses = new ArrayList<>();

    public void addHorse(T horse){
        horses.add(horse);
    }

    public void addHorses(List<? extends T> horsesAdd){
        horses.addAll(horsesAdd);
    }

    public int countHorses(){
        return horses.size();
    }

    public List<T> getHorses(){
        return horses;
    }
}
