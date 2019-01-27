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

    public TropicalFruit(String name, double price, double weight, double caloriePer100g, FruitType type, String county) {
        super(name, price, weight, caloriePer100g, type);
        this.country = country;

    }

    public TropicalFruit() {
        super();
        this.country = "No country known";

    }

    public void setCountry() {
        if (country != null) {
            this.country = country;
        } else {
            country = "";
        }

    }

    public String getCountry() {
        return this.country = country;
    }

    @Override
    public String toString() {
        String s = super.toString() + "Country of origin: " + country;

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
        TropicalFruit fruit = (TropicalFruit) object;
        result = super.equals(fruit) && country.equals(fruit.country);

        return result;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;

        result = super.hashCode();
        result = prime * result + ((country != null) ? country.hashCode() : 0);

        return result;
    }
}
