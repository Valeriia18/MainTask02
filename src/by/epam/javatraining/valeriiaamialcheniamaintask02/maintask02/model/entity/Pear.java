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
            String type, double vitaminA, double calcium, double magnesiumPer100g) {

        super(name, price, weight, caloriePer100g, type, vitaminA, calcium);
        this.magnesiumPer100g = magnesiumPer100g;
    }

    public double getMagnesiumPer100g() throws NegativeVitaminsException {
        if (magnesiumPer100g <= 0) {
            throw new NegativeVitaminsException();
        }
        return magnesiumPer100g;
    }

    @Override
    public String toString() {
        String s = "";
        try {
            s = "\n Name: " + getName()
                    + "\n Price: " + getPrice() + "\n Weight: " + getWeight()
                    + "\n Calories per 100g: " + getCaloriePer100g()
                    + "\n Kind of fruit: " + getType() + "\n Vitamin A per 100g fruit: "
                    + getVitaminAPer100g() + "\n Calcium per 100g fruit: "
                    + getCalciumPer100g() + "\n Magnesium per 100g: "
                    + getMagnesiumPer100g();

        } catch (NegativeWeightException | NegativeCaloriesException
                | NegativeVitaminsException | NegativePriceException a) {
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
            Pear fruit = (Pear) object;
            result = getName().equals(fruit.getName()) && getPrice() == fruit.getPrice()
                    && getWeight() == fruit.getWeight()
                    && getCaloriePer100g() == fruit.getCaloriePer100g()
                    && getType().equals(fruit.getType()) && getVitaminAPer100g()
                    == fruit.getVitaminAPer100g() && getCalciumPer100g()
                    == fruit.getCalciumPer100g() && getMagnesiumPer100g() 
                    == fruit.getMagnesiumPer100g();
        } catch (NegativeWeightException | NegativeCaloriesException
                | NegativePriceException | NegativeVitaminsException e) {
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
            result = (int) (prime * result + getVitaminAPer100g());
            result = (int) (prime * result + getCalciumPer100g());
            result = (int) (prime * result + getMagnesiumPer100g());
        } catch (NegativeWeightException | NegativeCaloriesException
                | NegativePriceException | NegativeVitaminsException e) {
        }
        return result;
    }
}
