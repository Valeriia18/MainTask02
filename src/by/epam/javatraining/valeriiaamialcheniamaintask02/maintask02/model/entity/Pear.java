package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity;

import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NegativeCaloriesException;
import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NegativePriceException;
import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NegativeVitaminsException;
import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NegativeWeightException;
import java.io.Serializable;

/*
 Class Pear 

      @version 1.0 19 Jan 2019
  @author Valeriia Amialchenia
 */
public class Pear extends GardenFruit {

   private double magnesiumPer100g;

    public Pear(String name, double price, double weight, double caloriePer100g,
            FruitType type, double vitaminA, double calcium, double magnesiumPer100g) {

        super(name, price, weight, caloriePer100g, type, vitaminA, calcium);
        this.magnesiumPer100g = magnesiumPer100g;
    }
    public Pear() {

        super();
        this.magnesiumPer100g = 0.0;
    }

    public void setMagnesiumPer100g() {
        if (magnesiumPer100g > 0) {
            this.magnesiumPer100g = magnesiumPer100g;
        } else {
            magnesiumPer100g = 0;
        }
    }
    public double getMagnesiumPer100g() throws NegativeVitaminsException {
        if (magnesiumPer100g <= 0) {
            throw new NegativeVitaminsException();
        }
        return magnesiumPer100g;
    }

    @Override
    public String toString() {
        String s = super.toString() + "\n Magnesium per 100g: "
                    + magnesiumPer100g; 
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
        Pear fruit = (Pear) object;
            result = super.equals(fruit) && magnesiumPer100g
                    == fruit.magnesiumPer100g;
       
        return result;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;
        
         result = super.hashCode();
            result = (int) (prime * result + magnesiumPer100g);
        
        return result;
    }
}
