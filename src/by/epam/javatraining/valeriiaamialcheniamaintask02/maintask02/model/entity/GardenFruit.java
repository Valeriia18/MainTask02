package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity;

import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.*;
import java.io.Serializable;

/*
 Class GardenFruit 

      @version 1.0 19 Jan 2019
  @author Valeriia Amialchenia
 */
public class GardenFruit extends Fruit implements Serializable {

    private double vitaminAPer100g;
    private double calciumPer100g;

    public GardenFruit(String name, double price, double weight,
            double caloriePer100g, String type, double vitaminAPer100g,
            double calciumPer100g) {

        super(name, price, weight, caloriePer100g, type);
        this.vitaminAPer100g = vitaminAPer100g;
        this.calciumPer100g = calciumPer100g;
    }

    public double getVitaminAPer100g() throws NegativeVitaminsException {
        if (vitaminAPer100g <= 0) {
            throw new NegativeVitaminsException();
        }
        return vitaminAPer100g;
    }

    public double getCalciumPer100g() throws NegativeVitaminsException {
        if (calciumPer100g <= 0) {
            throw new NegativeVitaminsException();
        }
        return calciumPer100g;
    }

    @Override
    public String toString() {
        String s = "";
        try {
            s = "\n Name: " + getName()
                    + "\n Price: " + getPrice() + "\n Weight: " + getWeight()
                    + "\n Calories per 100g: " + getCaloriePer100g()
                    + "\n Kind of fruit: " + getType() + "\n Vitamin A per 100g fruit: "
                    + getVitaminAPer100g() + "\n Calcium per 100g fruit: " + getCalciumPer100g();

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
            GardenFruit fruit = (GardenFruit) object;
            result = getName().equals(fruit.getName()) && getPrice() == fruit.getPrice()
                    && getWeight() == fruit.getWeight()
                    && getCaloriePer100g() == fruit.getCaloriePer100g()
                    && getType().equals(fruit.getType()) && getVitaminAPer100g()
                    == fruit.getVitaminAPer100g() && getCalciumPer100g()
                    == fruit.getCalciumPer100g();
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
        } catch (NegativeWeightException | NegativeCaloriesException
                | NegativePriceException | NegativeVitaminsException e) {
        }
        return result;
    }
}
