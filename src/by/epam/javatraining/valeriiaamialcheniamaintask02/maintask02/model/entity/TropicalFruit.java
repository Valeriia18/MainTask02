package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity;

import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.*;
import java.io.Serializable;

/*
 Class TropicalFruit 

      @version 1.0 19 Jan 2019
  @author Valeriia Amialchenia
 */
public class TropicalFruit extends Fruit implements Serializable {

    String country;

    public TropicalFruit(String name, double price, double weight, double caloriePer100g, String type, String county) {
        super(name, price, weight, caloriePer100g, type);
        this.country = country;

    }

    public String getCountry() {
        return this.country = country;
    }

    @Override
    public String toString() {
        String s = "";
        try {
            s = "Name: " + getName()
                    + "Price: " + getPrice() + "Weight: " + getWeight()
                    + "Calories per 100g: " + getCaloriePer100g()
                    + "Kind of fruit:" + getType() + "Country of origin: " + country;

        } catch (NegativeWeightException | NegativeCaloriesException
                | NegativePriceException a) {

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
            TropicalFruit fruit = (TropicalFruit) object;
            result = getName().equals(fruit.getName()) && getPrice() == fruit.getPrice()
                    && getWeight() == fruit.getWeight()
                    && getCaloriePer100g() == fruit.getCaloriePer100g()
                    && getType().equals(fruit.getType())
                    && getCountry().equals(fruit.getCountry());
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
            result = prime * result + ((getCountry() != null) ? getCountry().hashCode() : 0);
        } catch (NegativeWeightException | NegativeCaloriesException | NegativePriceException e) {
        }
        return result;
    }
}
