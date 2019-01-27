package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.functionality;

import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.*;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.*;
import by.epam.javatraining.valeriiaamialchenia.maintask02.controller.MainTask02;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.view.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Алексей-Валерия
 */
public class FruitsSearch {

    private static LogPrinter lp = new LogPrinter();

    public static StringBuilder findMaxCalorificFruit(Salad salad) {
        StringBuilder builder = new StringBuilder();
        List<Fruit> fruits = salad.getFruits();
        double MaxCalorificValue = 0;
        String MaxCalorificFruit = "";
        for (Fruit temp : fruits) {
            if (temp.getCaloriePer100g() > MaxCalorificValue) {
                MaxCalorificValue = temp.getCaloriePer100g();
                builder.setLength(0);
                builder.append(temp.getName());
            }
        }

        return builder;
    }

    public static String findMostExpensiveFruit(Salad salad)
            throws NullArrayException, NegativePriceException {
        String s = "";
        double highestPrice = 0;
        List<Fruit> fruits = salad.getFruits();
        if (fruits == null) {
            throw new NullArrayException();
        } else {

            for (Fruit temp : fruits) {
                if (temp.getPrice() > highestPrice) {
                    highestPrice = temp.getPrice();
                    s = temp.getName();
                }
            }

        }
        return "The most expensive fruit is " + s + ". The price is " + highestPrice;
        //return s;
    }

    public static String findCheapestFruit(Salad salad) throws
            NullArrayException, NegativePriceException {
        String s = "";
        double lowestPrice = 0;
        List<Fruit> fruits = salad.getFruits();
        if (fruits == null) {
            throw new NullArrayException();
        }

        lowestPrice = fruits.get(0).getPrice();

        for (Fruit temp : fruits) {
            if (lowestPrice > temp.getPrice()) {
                lowestPrice = temp.getPrice();
                s = temp.getName();
            }
        }

        return "The cheapest fruit is " + s + ". The price is " + lowestPrice;
    }

    public static StringBuilder findFruitByPrice(double a, double b, Salad salad) {
        StringBuilder builder = new StringBuilder();
        List<Fruit> fruits = salad.getFruits();
        for (Fruit temp : fruits) {
            if (temp.getPrice() >= a && temp.getPrice() <= b) {
                builder.append(temp.getName()).append("(").append(temp.getType()).append(")");
            }
        }

        if (a < 0 || b < 0) {

            throw new IllegalArgumentException("Check entered numbers. They cannot be negative");
        }
        return builder;
    }

    public static StringBuilder findFruitByCaloriesPer100g(double a, double b,
            Salad salad) {
        StringBuilder builder = new StringBuilder();
        List<Fruit> fruits = salad.getFruits();
        for (Fruit temp : fruits) {
            if ((temp.getCaloriePer100g() >= a && temp.getCaloriePer100g() <= b)
                    || (temp.getCaloriePer100g() >= b && temp.getCaloriePer100g()
                    <= a)) {
                builder.append(temp.getName()).append("(").append(temp.getType()).append("), ");
            }
        }

        if (a < 0 || b < 0) {

            throw new IllegalArgumentException("Check entered numbers. They cannot be negative");
        }
        return builder;
    }

    public static StringBuilder findFruitByName(String name, Salad salad) {
        StringBuilder builder = new StringBuilder();
        List<Fruit> fruits = salad.getFruits();
        for (Fruit temp : fruits) {
            if (name == null) {
                lp.print("");
                lp.print("String with name cannot be empty!");
            } else if (name.equals(temp.getName())) {
                builder.append(temp.getName()).append("(").append(temp.getType()).append("), ");

            }
        }
        return builder;

    }

    public static String findMaxCalorificFruit2(Salad salad) {
        String s = "";
        double MaxCalorificValue = 0;
        String MaxCalorificFruit = "";
        List<Fruit> fruits = salad.getFruits();
        for (Fruit temp : fruits) {
            if (temp.getCaloriePer100g() > 0) {
                s = temp.getName();

            }
        }

        return s;
    }

}
