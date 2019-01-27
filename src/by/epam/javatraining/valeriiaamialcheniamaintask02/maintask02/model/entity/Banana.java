package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity;

import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.*;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.TropicalFruit;
import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NegativeVitaminsException;
import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NegativeWeightException;
import java.io.Serializable;

/*
 Class Banana 

      @version 1.0 19 Jan 2019
  @author Valeriia Amialchenia
 */
public class Banana extends TropicalFruit {

    private double potassiumPer100g;

    public Banana(String name, double price, double weight, double caloriePer100g,
            FruitType type, String county, double potassiumPer100g) {

        super(name, price, weight, caloriePer100g, type, county);
        this.potassiumPer100g = potassiumPer100g;
    }

    public Banana() {
        super();
        this.potassiumPer100g = 0.0;
    }

    public void setPotassiumPer100g() {
        if (potassiumPer100g > 0) {
            this.potassiumPer100g = potassiumPer100g;
        } else {
            potassiumPer100g = 0;
        }
    }

    public double getPotassiumPer100g() throws NegativeVitaminsException {
        if (potassiumPer100g <= 0) {
            throw new NegativeVitaminsException();
        }
        return potassiumPer100g;
    }

    @Override
    public String toString() {
        String s = "";
        s = super.toString() + "\n Potassium per 100g: " + potassiumPer100g;
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
        Banana fruit = (Banana) object;
        result = super.equals(fruit) && potassiumPer100g == fruit.potassiumPer100g;
        return result;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;

        result = super.hashCode();
        result = (int) (prime * result + potassiumPer100g);

        return result;
    }
}
