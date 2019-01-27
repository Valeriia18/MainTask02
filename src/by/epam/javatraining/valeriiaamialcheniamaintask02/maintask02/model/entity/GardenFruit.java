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
            double caloriePer100g, FruitType type, double vitaminAPer100g,
            double calciumPer100g) {

        super(name, price, weight, caloriePer100g, type);
        this.vitaminAPer100g = vitaminAPer100g;
        this.calciumPer100g = calciumPer100g;
    }

    public GardenFruit() {

        super();
        this.vitaminAPer100g = 0.0;
        this.calciumPer100g = 0.0;
    }

    public void setVitaminAPer100g(double vitaminAPer100g) {
        if (vitaminAPer100g > 0) {
            this.vitaminAPer100g = vitaminAPer100g;
        } else {
            vitaminAPer100g = 0;
        }
    }

    public double getVitaminAPer100g() throws NegativeVitaminsException {
        return vitaminAPer100g;
    }

    public void setCalciumPer100g(double calciumPer100g) {
        if (calciumPer100g > 0) {
            this.calciumPer100g = calciumPer100g;
        } else {
            calciumPer100g = 0;
        }
    }

    public double getCalciumPer100g() throws NegativeVitaminsException {
        return calciumPer100g;
    }

    @Override
    public String toString() {
        String s = super.toString() + "\n Vitamin A per 100g fruit: "
                + vitaminAPer100g + "\n Calcium per 100g fruit: " + calciumPer100g;
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
        GardenFruit fruit = (GardenFruit) object;
        result = super.equals(fruit) && vitaminAPer100g
                == fruit.vitaminAPer100g && calciumPer100g
                == fruit.calciumPer100g;

        return result;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;

        result = super.hashCode();
        result = (int) (prime * result + vitaminAPer100g);
        result = (int) (prime * result + calciumPer100g);

        return result;
    }
}
