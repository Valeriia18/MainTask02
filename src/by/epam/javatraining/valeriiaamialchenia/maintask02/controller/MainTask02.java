package by.epam.javatraining.valeriiaamialchenia.maintask02.controller;

import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.utility.FruitSaladCook;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.utility.FruitSaladFile;
import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.*;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.*;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.functionality.*;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.view.*;
import java.io.*;
import java.util.ArrayList;

public class MainTask02 {

    private static final LogPrinter lp = new LogPrinter();
    private static final ConsolePrinter cp = new ConsolePrinter();

    //  private static org.apache.log4j.Logger log = null;
    public static void main(String[] args) throws FileNotFoundException,
            IOException,
            NullArrayException, LogicException, NegativePriceException {
        try {
            Salad salad = new Salad();

            salad = FruitSaladFile.readFromFile();
            // counting total weight for the salad 
            lp.print("Total weight for cooked salad is "
                    + FruitSaladManager.getTotalWeight(salad));
            // counting total price for the salad
            lp.print("Total price for cooked salad is "
                    + FruitSaladManager.getTotalPrice(salad));
            // counting total calorific value for the salad
            lp.print("Total calories amount for cooked salad is "
                    + FruitSaladManager.getTotalCalories(salad));

            //   searching the most expensive fruit in the salad
            lp.print(FruitsSearch.findMostExpensiveFruit(salad));

            // searching the cheapest fruit in the salad
            lp.print(FruitsSearch.findCheapestFruit(salad));

            // searcing the most calorific fruit
            lp.print("Maximum Calorific fruit is: " + FruitsSearch.findMaxCalorificFruit(salad));

            // searcing fruit of a given range of price
            lp.print("Fruit within given limits of price: "
                    + FruitsSearch.findFruitByPrice(1, 100, salad));

            // searcing fruit of a given range of calories
            lp.print("Fruit within given limits of calories: "
                    + FruitsSearch.findFruitByCaloriesPer100g(0.1, 7, salad));

            // searcing fruit of a given name
            lp.print("Fruit within given limits of calories: "
                    + FruitsSearch.findFruitByName("Durian", salad));
            //   eating and counting how much grams of salad is left
            lp.print("Lets eat our Salad! ");
            lp.print(FruitSaladManager.eat(salad, 2) + " grams of Salad are left");

            // sorting fruit in the second salad by name
            FruitSaladSort f2 = new FruitSaladSort();
            f2.sortFruitsByName(salad);
            lp.print("Fruits are sorted by name: " + salad);

            //sorting fruit in the second salad by type
            f2.sortFruitsByType(salad);
            lp.print("Fruits are sorted by type: " + salad);

            //sorting fruit in the second salad by price
            f2.sortFruitsByPrice(salad);
            lp.print("Fruits are sorted by price: " + salad);

        } catch (FileNotFoundException n) {
            lp.print("File is not found");
        } catch (NullArrayException c) {
            lp.print("Array cannot be null!");
        } catch (NegativePriceException n) {
            lp.print("Price cannot be negative!");
        }
    }
}
