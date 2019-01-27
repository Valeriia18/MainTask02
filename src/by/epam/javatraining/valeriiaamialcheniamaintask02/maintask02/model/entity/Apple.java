package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity;

import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.*;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.*;

/*
 Class Fruit 

      @version 1.0 19 Jan 2019
  @author Valeriia Amialchenia
 */
public class Apple extends GardenFruit {

    private double phosphorusPer100g;

    public Apple(String name, double price, double weight, double caloriePer100g,
            FruitType type, double vitaminA, double calcium, double phosphorusPer100g) {

        super(name, price, weight, caloriePer100g, type, vitaminA, calcium);

        this.phosphorusPer100g = phosphorusPer100g;

    }

    public Apple() {

        super();

        this.phosphorusPer100g = 0.0;

    }

    public void setPhosphorusPer100g(double phosphorusPer100g) {
        if (phosphorusPer100g > 0) {
            this.phosphorusPer100g = phosphorusPer100g;
        } else {
            phosphorusPer100g = 0;
        }
    }

    public double getPhosphorusPer100g() throws NegativeVitaminsException {
        if (phosphorusPer100g <= 0) {
            throw new NegativeVitaminsException();
        }
        return phosphorusPer100g;
    }

    @Override
    public String toString() {
        String s = "";
        s = super.toString() + "\n Phosphorus per 100g fruit: " + phosphorusPer100g;

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

        Apple fruit = (Apple) object;
        result = super.equals(fruit) && phosphorusPer100g == fruit.phosphorusPer100g;

        return result;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;

        result = super.hashCode();
        result = (int) (prime * result + phosphorusPer100g);

        return result;
    }
}
