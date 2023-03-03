package SerializeCar;

import java.io.Serializable;

public class Engine implements Serializable {

    private int hp;

    public Engine(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
