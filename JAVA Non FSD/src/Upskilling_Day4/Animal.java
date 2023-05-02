package Upskilling_Day4;

import java.util.Locale;

public class Animal {
    private String name;
    private String type;

    public Animal() {
    }

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void check(Animal animal) {
        if(animal.getType().equalsIgnoreCase("wild")) {
            System.out.println(animal.getName() + " is wild.");
        }
        else if(animal.getType().equalsIgnoreCase("domestic")) {
            System.out.println(animal.getName() + " is domestic.");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
