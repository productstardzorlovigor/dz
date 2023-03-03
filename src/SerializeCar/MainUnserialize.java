package SerializeCar;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

public class MainUnserialize implements Serializable {
    public static void main(String[] args) throws IOException {



        File file = new File("./Resources/car.json");
        ObjectMapper objectMapper = new ObjectMapper();
        Car newOpel = objectMapper.readValue(file, Car.class);
        System.out.println(newOpel.getName() + "\n" +
                newOpel.getEngine().getHp());
    }
}
