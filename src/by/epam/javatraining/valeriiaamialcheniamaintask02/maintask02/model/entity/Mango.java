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
            FruitType type, boolean isPoisonous, MangoColor mangoColor) {
        super(name, price, weight, caloriePer100g, type, isPoisonous);
        this.mangoColor = mangoColor;
    }

      public Mango() {
        super();
        this.mangoColor = null;
    } 
      
      public void setMangoColor() {
        this.mangoColor = mangoColor;
        
    }
    public MangoColor getMangoColor() {
        return this.mangoColor = mangoColor;
    }

    @Override
    public String toString() {
        String s = super.toString() + "\n Color: " + getMangoColor();
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

        Mango fruit = (Mango) object;
        result = super.equals(fruit) && mangoColor.equals(fruit.mangoColor);

        return result;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;

        result = super.hashCode();
        result = prime * result + ((mangoColor != null)
                ? mangoColor.hashCode() : 0);
        return result;
    }
}
