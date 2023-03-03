package SerializeCar;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

public class MainSerialize implements Serializable {
    public static void main(String[] args) throws IOException {

        Engine engine = new Engine(300);

        Car opel = new Car("Opel Astra",2015, engine, "Salon", 1000000);

        File file = new File("/src/SerializeCar/car.json");


        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(file.toURI()), opel);


        Car newOpel = objectMapper.readValue(file, Car.class);
        System.out.println(newOpel.getName());


    }
}
