package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity;

import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.*;
import java.io.Serializable;

/*
 Class Mango 

      @version 1.0 19 Jan 2019
  @author Valeriia Amialchenia
 */
public class Mango extends ExoticFruit implements Serializable {

    public enum MangoColor {
        GREEN,
        YELLOW
    }
    MangoColor mangoColor;

    public Mango(String name, double price, double weight, double caloriePer100g,
            String type, boolean isPoisonous, MangoColor mangoColor) {
        super(name, price, weight, caloriePer100g, type, isPoisonous);
        this.mangoColor = mangoColor;
    }

    public MangoColor getMangoColor() {
        return this.mangoColor = mangoColor;
    }

    @Override
    public String toString() {
        String s = "";
        try {
            s = "\n Name: " + getName()
                    + "\n Price: " + getPrice() + "\n Weight: " + getWeight()
                    + "\n Calories per 100g: " + getCaloriePer100g()
                    + "\n Kind of fruit:" + getType() + "\n Fruit is poisonous: "
                    + getPoisonous() + "\n Color: " + getMangoColor();

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
            Mango fruit = (Mango) object;
            result = getName().equals(fruit.getName()) && getPrice() == fruit.getPrice()
                    && getWeight() == fruit.getWeight()
                    && getCaloriePer100g() == fruit.getCaloriePer100g()
                    && getType().equals(fruit.getType()) && getPoisonous()
                    == fruit.getPoisonous() && getMangoColor().equals(fruit.mangoColor);
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
            result = prime * result + ((getMangoColor() != null)
                    ? getMangoColor().hashCode() : 0);
        } catch (NegativeWeightException | NegativeCaloriesException
                | NegativePriceException e) {
        }
        return result;
    }
}
