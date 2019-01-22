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
public class Banana extends TropicalFruit implements Serializable {

    double potassiumPer100g;

    public Banana(String name, double price, double weight, double caloriePer100g,
            String type, String county, double potassiumPer100g) {

        super(name, price, weight, caloriePer100g, type, county);
        this.potassiumPer100g = potassiumPer100g;
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
        try {
            s = "\n Name: " + getName()
                    + "\n Price: " + getPrice() + "\n Weight: " + getWeight()
                    + "\n Calories per 100g: " + getCaloriePer100g()
                    + "\n Kind of fruit: " + getType() + "\n Country of origin: "
                    + country + "\n Potassium per 100g: " + getPotassiumPer100g();

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
            Banana fruit = (Banana) object;
            result = getName().equals(fruit.getName()) && getPrice() == fruit.getPrice()
                    && getWeight() == fruit.getWeight()
                    && getCaloriePer100g() == fruit.getCaloriePer100g()
                    && getType().equals(fruit.getType())
                    && getCountry().equals(fruit.getCountry())
                    && getPotassiumPer100g() == fruit.getPotassiumPer100g();
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
            result = prime * result + ((getCountry() != null) ? getCountry().hashCode() : 0);
            result = (int) (prime * result + getPotassiumPer100g());
        } catch (NegativeWeightException | NegativeCaloriesException
                | NegativePriceException | NegativeVitaminsException e) {
        }
        return result;
    }
}
