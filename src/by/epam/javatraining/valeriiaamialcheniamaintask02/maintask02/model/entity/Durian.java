package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity;

import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NegativeCaloriesException;
import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NegativePriceException;
import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NegativeWeightException;
import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.PoisonousFruitException;
import java.io.Serializable;

/*
 Class Durian 

      @version 1.0 19 Jan 2019
  @author Valeriia Amialchenia
 */
public class Durian extends ExoticFruit implements Serializable {

    String alcoholNotification;

    public Durian(String name, double price, double weight, double caloriePer100g,
            String type, boolean isPoisonous, String alcoholNotification) {
        super(name, price, weight, caloriePer100g, type, isPoisonous);
        this.alcoholNotification = alcoholNotification;
    }

    public String getAlcoholNotification() {
        return this.alcoholNotification = alcoholNotification;
    }

    @Override
    public String toString() {
        String s = "";
        try {
            s = "\n Name: " + getName()
                    + "\n Price: " + getPrice() + "\n Weight: " + getWeight()
                    + "\n Calories per 100g: " + getCaloriePer100g()
                    + "\n Kind of fruit: " + getType() + "\n Fruit is poisonous: "
                    + getPoisonous() + "\n Important Notification: " + getAlcoholNotification();

        } catch (NegativeWeightException | NegativeCaloriesException | NegativePriceException a) {

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
            Durian fruit = (Durian) object;
            result = getName().equals(fruit.getName()) && getPrice() == fruit.getPrice()
                    && getWeight() == fruit.getWeight()
                    && getCaloriePer100g() == fruit.getCaloriePer100g()
                    && getType().equals(fruit.getType()) && getPoisonous()
                    == fruit.getPoisonous() && getAlcoholNotification()
                    == fruit.getAlcoholNotification();
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
            result = prime * result + ((getAlcoholNotification() != null)
                    ? getAlcoholNotification().hashCode() : 0);
        } catch (NegativeWeightException | NegativeCaloriesException
                | NegativePriceException e) {
        }
        return result;
    }
}
