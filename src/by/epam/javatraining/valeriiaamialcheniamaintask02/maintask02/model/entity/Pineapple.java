package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity;

import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.*;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.TropicalFruit;
import java.io.Serializable;


/*
 Class Pineapple 

      @version 1.0 19 Jan 2019
  @author Valeriia Amialchenia
 */
public class Pineapple extends TropicalFruit {

    private double vitaminBPer100g;

    public Pineapple(String name, double price, double weight, double caloriePer100g, FruitType type, String county, double vitaminBPer100g) {
        super(name, price, weight, caloriePer100g, type, county);
        this.vitaminBPer100g = vitaminBPer100g;
    }

    public Pineapple() {
        super();
        this.vitaminBPer100g = 0.0;
    }

    public void setVitaminBPer100g() {
        if (vitaminBPer100g > 0) {
            this.vitaminBPer100g = vitaminBPer100g;
        } else {
            vitaminBPer100g = 0;
        }
    }

    public double getVitaminBPer100g() throws NegativeVitaminsException {
        if (vitaminBPer100g <= 0) {
            throw new NegativeVitaminsException();
        }
        return vitaminBPer100g;
    }

    @Override
    public String toString() {
        String s = super.toString() + "\n Vitamin B pr 100g: " + vitaminBPer100g;
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
        Pineapple fruit = (Pineapple) object;
        result = super.equals(fruit) && vitaminBPer100g
                == fruit.vitaminBPer100g;

        return result;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;

        result = super.hashCode();
        result = (int) (prime * result + vitaminBPer100g);

        return result;
    }
}
