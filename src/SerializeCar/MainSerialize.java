package SerializeCar;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;


public class MainSerialize implements Serializable {
    public static void main(String[] args) throws IOException {

        Engine engine = new Engine();
        engine.setHp(300);

        Car opel = new Car("Opel Astra",2015, engine, "Salon", 1000000);

        File file = new File("./Resources/car.json");


        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(file, opel);
    }
}
