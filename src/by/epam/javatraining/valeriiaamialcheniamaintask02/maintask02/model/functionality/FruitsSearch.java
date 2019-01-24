package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.functionality;

import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.*;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.*;
import by.epam.javatraining.valeriiaamialchenia.maintask02.controller.MainTask02;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.view.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Алексей-Валерия
 */
public class FruitsSearch {
private static LogPrinter lp = new LogPrinter();
    public static StringBuilder findMaxCalorificFruit(ArrayList<Fruit> list) {
        StringBuilder builder = new StringBuilder();
        double MaxCalorificValue = 0;
        String MaxCalorificFruit = "";
        try {
            for (Fruit temp : list) {
                if (temp.getCaloriePer100g() > MaxCalorificValue) {
                    MaxCalorificValue = temp.getCaloriePer100g();
                    builder.setLength(0);
                    builder.append(temp.getName());
                }
            }
        } catch (NegativeCaloriesException b) {
        }
        return builder;
    }

    public static String findMostExpensiveFruit(ArrayList<Fruit> list)
            throws NullArrayException, NegativePriceException {
        String s = "";
        double highestPrice = 0;

        if (list == null) {
            throw new NullArrayException();
        } else {
            try {
                for (Fruit temp : list) {
                    if (temp.getPrice() > highestPrice) {
                        highestPrice = temp.getPrice();
                        s = temp.getName();
                    }
                }
            } catch (NegativePriceException p) {

            }
        }
        return "The most expensive fruit is " + s + ". The price is " + highestPrice;
        //return s;
    }

    public static String findCheapestFruit(ArrayList<Fruit> list) throws
            NullArrayException, NegativePriceException {
        String s = "";
        double lowestPrice = 0;
        if (list == null) {
            throw new NullArrayException();
        }
        try {
            lowestPrice = list.get(0).getPrice();

            for (Fruit temp : list) {
                if (lowestPrice > temp.getPrice()) {
                    lowestPrice = temp.getPrice();
                    s = temp.getName();
                }
            }
        } catch (NegativePriceException e) {
        }

        return "The cheapest fruit is " + s + ". The price is " + lowestPrice;
    }

    public static StringBuilder findFruitByPrice(double a, double b, ArrayList<Fruit> list) throws NegativePriceException {
        StringBuilder builder = new StringBuilder();
        try {
            for (Fruit temp : list) {
                if (temp.getPrice() >= a && temp.getPrice() <= b) {
                    builder.append(temp.getName()).append("(").append(temp.getType()).append(")");
                }
            }
        } catch (NegativePriceException p) {

        }
        if (a < 0 || b < 0) {

            throw new IllegalArgumentException("Check entered numbers. They cannot be negative");
        }
        return builder;
    }

    public static StringBuilder findFruitByCaloriesPer100g(double a, double b,
            ArrayList<Fruit> list) throws NegativePriceException {
        StringBuilder builder = new StringBuilder();
        try {
            for (Fruit temp : list) {
                if ((temp.getCaloriePer100g() >= a && temp.getCaloriePer100g() <= b)
                        || (temp.getCaloriePer100g() >= b && temp.getCaloriePer100g()
                        <= a)) {
                    builder.append(temp.getName()).append("(").append(temp.getType()).append("), ");
                }
            }
        } catch (NegativeCaloriesException p) {

        }
        if (a < 0 || b < 0) {

            throw new IllegalArgumentException("Check entered numbers. They cannot be negative");
        }
        return builder;
    }

    public static StringBuilder findFruitByName(String name, ArrayList<Fruit> list) {
        StringBuilder builder = new StringBuilder();
        for (Fruit temp : list) {
            if (name == null) {
               lp.print("");
                lp.print("String with name cannot be empty!");
            } else if (name.equals(temp.getName())) {
                builder.append(temp.getName()).append("(").append(temp.getType()).append("), ");

            }
        }
        return builder;

    }

    public static String findMaxCalorificFruit2(ArrayList<Fruit> list) {
        String s = "";
        double MaxCalorificValue = 0;
        String MaxCalorificFruit = "";
        try {
            for (Fruit temp : list) {
                if (temp.getCaloriePer100g() > 0) {
                    s = temp.getName();

                }
            }
        } catch (NegativeCaloriesException b) {
        }
        return s;
    }

}
