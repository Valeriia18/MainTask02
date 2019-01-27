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
public class Durian extends ExoticFruit {

    private String alcoholNotification;

    public Durian(String name, double price, double weight, double caloriePer100g,
            FruitType type, boolean isPoisonous, String alcoholNotification) {
        super(name, price, weight, caloriePer100g, type, isPoisonous);
        this.alcoholNotification = alcoholNotification;
    }

    public Durian() {
        this.alcoholNotification = " ";
    }

    public void setAlcoholNotification() {
        this.alcoholNotification = alcoholNotification;

    }

    public String getAlcoholNotification() {
        return this.alcoholNotification = alcoholNotification;
    }

    @Override
    public String toString() {
        String s = super.toString() + "\n Important Notification: " + alcoholNotification;

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

        Durian fruit = (Durian) object;
        result = super.equals(fruit) && alcoholNotification
                == fruit.getAlcoholNotification();

        return result;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;
        result = super.hashCode();
        result = prime * result + ((alcoholNotification != null)
                ? alcoholNotification.hashCode() : 0);

        return result;
    }
}
