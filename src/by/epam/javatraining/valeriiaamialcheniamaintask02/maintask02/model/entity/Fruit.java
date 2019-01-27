package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity;

import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.*;
import java.io.Serializable;

/*
 Class Fruit 

      @version 1.0 19 Jan 2019
  @author Valeriia Amialchenia
 */

public class Fruit implements Serializable {

    

    public enum FruitType {
    FRUIT, APPLE, PEAR, MANGO, PINEAPPLE, BANANA, DURIAN, TROPICAL_FRUIT, GARDEN_FRUIT,
    EXOTIC_FRUIT
}
    private FruitType type;
    private String name;
    private double price;
    private double weight;
    private double caloriePer100g;

    public Fruit(String name, double price, double weight, double caloriePer100g, FruitType type) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.caloriePer100g = caloriePer100g;
        this.type = type;
    }

    public Fruit(String name) {
        this.name = "Unnamed";
        this.price = 0.0;
        this.weight = 0.0;
        this.caloriePer100g = 0.0;
        this.type = null;
    }
     public Fruit() {
     
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            name = "";
        }

    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            price = 0;
        }
    }

    public double getPrice(){
        return price;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            weight = 0;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setCaloriePer100g(double caloriePer100g) {
        if (caloriePer100g > 0) {
            this.caloriePer100g = caloriePer100g;
        } else {
            caloriePer100g = 0;
        }
    }

    public double getCaloriePer100g(){
        return caloriePer100g;
    }

    public void setType(FruitType type) {
        if (type != null) {
            this.type = type;
        } else {
            name = null;
        }

    }

    public FruitType getType() {
        return type;
    }

    @Override
    public String toString() {
        String s = "";

        s = "Name: " + name + "\n Price: " + price + "\n Weight: " + weight
                + "Calories per 100g: " + caloriePer100g + "\n Kind of fruit:"
                + type;
        return s;
    }

    @Override
    public boolean equals(Object object) {
        boolean result = false;
        if (object == this) {
            return true;
        }
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }

        Fruit fruit = (Fruit) object;
        result = name.equals(fruit.name) && price == fruit.price
                && weight == fruit.weight
                && caloriePer100g == fruit.caloriePer100g
                && type.equals(fruit.type);

        return result;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;
        result = prime * result + ((name != null) ? name.hashCode() : 0);
        result = (int) (prime * result + price);
        result = (int) (prime * result + getWeight());
        result = (int) (prime * result + caloriePer100g);
        result = prime * result + ((type != null) ? type.hashCode() : 0);

        return result;
    }

}
