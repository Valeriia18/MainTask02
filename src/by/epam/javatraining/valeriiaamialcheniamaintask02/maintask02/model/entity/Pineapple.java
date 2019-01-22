package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity;

import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.*;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.TropicalFruit;
import java.io.Serializable;


/*
 Class Pineapple 

      @version 1.0 19 Jan 2019
  @author Valeriia Amialchenia
 */
public class Pineapple extends TropicalFruit implements Serializable{

    double vitaminBPer100g;

    public Pineapple(String name, double price, double weight, double caloriePer100g, String type, String county, double vitaminBPer100g) {
        super(name, price, weight, caloriePer100g, type, county);
        this.vitaminBPer100g = vitaminBPer100g;
    }
    public double getVitaminBPer100g() throws NegativeVitaminsException {
        if (vitaminBPer100g <= 0) {
            throw new NegativeVitaminsException();
        }
        return vitaminBPer100g;
    }
    @Override
    public String toString() {
        String s = "";
        try {
            s = "\n Name: " + getName()
                    + "\n Price: " + getPrice() + "\n Weight: " + getWeight()
                    + "\n Calories per 100g: " + getCaloriePer100g()
                    + "\n Kind of fruit: " + getType() + "\n Country of origin: "
                    + country + "\n Vitamin B pr 100g: " + getVitaminBPer100g();

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
            Pineapple fruit = (Pineapple) object;
            result = getName().equals(fruit.getName()) && getPrice() == fruit.getPrice()
                    && getWeight() == fruit.getWeight()
                    && getCaloriePer100g() == fruit.getCaloriePer100g()
                    && getType().equals(fruit.getType())
                    && getCountry().equals(fruit.getCountry()) 
                    && getVitaminBPer100g() == fruit.getVitaminBPer100g();
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
            result = (int) (prime * result + getVitaminBPer100g());
        } catch (NegativeWeightException | NegativeCaloriesException 
                | NegativePriceException | NegativeVitaminsException e) {
        }
        return result;
    }
}
