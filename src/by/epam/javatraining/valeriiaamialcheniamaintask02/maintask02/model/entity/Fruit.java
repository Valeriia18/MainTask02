package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity;

import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.*;
import java.io.Serializable;

/*
 Class Fruit 

      @version 1.0 19 Jan 2019
  @author Valeriia Amialchenia
 */
public class Fruit implements Serializable {

    String name;
    double price;
    private double weight;
    private double caloriePer100g;
    String type;

    public Fruit(String name, double price, double weight, double caloriePer100g, String type) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.caloriePer100g = caloriePer100g;
        this.type = type;
    }

    public double getWeight() throws NegativeWeightException {
        if (weight <= 0) {
            throw new NegativeWeightException();
        }
        return weight;
    }

    public double getCaloriePer100g() throws NegativeCaloriesException {
        if (caloriePer100g <= 0) {
            throw new NegativeCaloriesException();
        }
        return caloriePer100g;
    }

    public String getName() {
        return name;
    }

    public double getPrice() throws NegativePriceException {
        if (price <= 0) {
            throw new NegativePriceException();
        }
        return price;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        String s = "";
        try {
            s = "Name: " + getName()
                    + "\n Price: " + getPrice() + "\n Weight: " + getWeight()
                    + "Calories per 100g: " + getCaloriePer100g() + "\n Kind of fruit:" + getType();

        } catch (NegativeWeightException | NegativeCaloriesException | NegativePriceException e) {

        }
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
        try {
            Fruit fruit = (Fruit) object;
            result = getName().equals(fruit.getName()) && getPrice() == fruit.getPrice()
                    && getWeight() == fruit.getWeight()
                    && getCaloriePer100g() == fruit.getCaloriePer100g()
                    && getType().equals(fruit.getType());
        } catch (NegativeWeightException | NegativeCaloriesException | NegativePriceException e) {
        }
        return result;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;
        try {
            result = prime * result + ((getName() != null) ? getName().hashCode() : 0);
            result = (int) (prime * result + getPrice());
            result = (int) (prime * result + getWeight());
            result = (int) (prime * result + getCaloriePer100g());
            result = prime * result + ((getType() != null) ? getType().hashCode() : 0);
        } catch (NegativeWeightException | NegativeCaloriesException | NegativePriceException e) {
        }
        return result;
    }

}
