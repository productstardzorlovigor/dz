package SerializeCar;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.Serializable;

public class Car implements Serializable {

    private String name;
    private int year;
    private Engine engine;
    private String owner;
    private int price;

    public Car(String name, int year, Engine engine, String owner, int price) {
        this.name = name;
        this.year = year;
        this.engine = engine;
        this.owner = owner;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
