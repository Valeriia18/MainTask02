package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity;

import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.*;
import java.io.Serializable;

/*
 Class ExoticFruit 

    @version 1.0 19 Jan 2019
    @author Valeriia Amialchenia
 */
public class ExoticFruit extends Fruit {

   private boolean isPoisonous;

    public ExoticFruit(String name, double price, double weight, double caloriePer100g, String type, boolean isPoisonous) {
        super(name, price, weight, caloriePer100g, type);
        this.isPoisonous = isPoisonous;
    }

    public boolean getPoisonous() throws PoisonousFruitException {
        if (isPoisonous == true) {
            throw new PoisonousFruitException();
        }
        return isPoisonous;
    }

    @Override
    public String toString() {
        String s = "";
        try {
            s = "\n Name: " + getName()
                    + "\n Price: " + getPrice() + "\n Weight: " + getWeight()
                    + "\n Calories per 100g: " + getCaloriePer100g()
                    + "\n Kind of fruit:" + getType() + "\n Fruit is poisonous: " + getPoisonous();

        } catch (NegativeWeightException | NegativeCaloriesException
                | NegativePriceException a) {

        } catch (PoisonousFruitException p) {
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
            ExoticFruit fruit = (ExoticFruit) object;
            result = getName().equals(fruit.getName()) && getPrice() == fruit.getPrice()
                    && getWeight() == fruit.getWeight()
                    && getCaloriePer100g() == fruit.getCaloriePer100g()
                    && getType().equals(fruit.getType()) && getPoisonous() == fruit.getPoisonous();
        } catch (NegativeWeightException | NegativeCaloriesException
                | NegativePriceException | PoisonousFruitException e) {
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
        } catch (NegativeWeightException | NegativeCaloriesException
                | NegativePriceException e) {
        }
        return result;
    }
}
