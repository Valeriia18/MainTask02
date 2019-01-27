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

    public ExoticFruit(String name, double price, double weight, double caloriePer100g, FruitType type, boolean isPoisonous) {
        super(name, price, weight, caloriePer100g, type);
        this.isPoisonous = isPoisonous;
    }

    public ExoticFruit() {
        super();
        this.isPoisonous = false;
    }

    public void setPoisonous() {
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
        String s = super.toString() + "\n Fruit is poisonous: " + isPoisonous;

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

        ExoticFruit fruit = (ExoticFruit) object;
        result = super.equals(fruit) && isPoisonous == fruit.isPoisonous;

        return result;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();

        return result;
    }
}
