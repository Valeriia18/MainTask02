package by.epam.javatraining.valeriiaamialchenia.maintask02.controller;

import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.*;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.*;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.functionality.*;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.view.*;
import java.io.*;
import java.util.ArrayList;

public class MainTask02 {

    //  private static org.apache.log4j.Logger log = null;
    public static void main(String[] args) throws FileNotFoundException,
            NegativeWeightException, NegativeCaloriesException, IOException,
            NullArrayException {
        try {
            ArrayList<Fruit> myList = new ArrayList<Fruit>();
            FruitSaladCook f1 = new FruitSaladCook();

            /*Creating ArrayList of different
        fruit kinds for Salad + logging it to file
             */
            f1.cookFruitSalad(myList);
            LogPrinter.print("Salad is successfully cooked and contains: " + myList);

            /*utility method which serializes created salad to file and 
        deserializes it from there
             */
            FruitSaladFile.loadInitialSaladFromFile(myList);
            ConsolePrinter.print(" Reading from file " + myList);
            LogPrinter.print(" Reading from file " + myList);

            // adding some more fruit to the Salad
            Durian d1 = new Durian("Durian", 1.6, 0.2, 52, "Durian", true, "Be careful! Do not mix this fruit with alcohol! ");
            myList.add(6, d1);
            Pineapple p1 = new Pineapple("Yellow Pineapple", 1.3, 2.2, 52, "Pineapple", "Africa", 1.9);
            myList.add(7, p1);
            Pineapple p2 = new Pineapple("Yellow Pineapple", 1.3, 2.2, 52, "Pineapple", "Africa", 1.9);
            myList.add(8, p1);
            ExoticFruit e1 = new ExoticFruit("Some Exotic Fruit", 123, 2.2, 52, "Exotic Fruit", false);
            myList.add(9, e1);
            ExoticFruit e2 = new ExoticFruit("Some Exotic Fruit", 123, 2.2, 52, "Exotic Fruit", false);
            myList.add(10, e1);

            LogPrinter.print("Exotic Fruits are equal? " + e1.equals(e2));

            // counting total price for the salad
            LogPrinter.print("Total price for cooked salad is "
                    + FruitSaladTotalPrice.getTotalPrice(myList));

            // counting total weight for the salad
            LogPrinter.print("Total price for cooked salad is "
                    + FruitSaladTotalWeight.getTotalWeight(myList));

            // counting total calorific value for the salad
            LogPrinter.print("Total calories amount for cooked salad is "
                    + FruitSaladCalories.getTotalCalories(myList));

            // searching the most expensive fruit in the salad
            LogPrinter.print(FruitsSearch.findMostExpensiveFruit(myList));

            // searching the cheapest fruit in the salad
            LogPrinter.print(FruitsSearch.findCheapestFruit(myList));

            // searcing the most calorific fruit
            LogPrinter.print(FruitsSearch.findMaxCalorificFruit(myList));

            // searcing fruit of a given range of price
            LogPrinter.print("Fruit within given limits of price: "
                    + FruitsSearch.findFruitByPrice(1, 100, myList));

            // searcing fruit of a given range of calories
            LogPrinter.print("Fruit within given limits of calories: "
                    + FruitsSearch.findFruitByCaloriesPer100g(0.1, 7, myList));

            // searcing fruit of a given name
            LogPrinter.print("Fruit within given limits of calories: "
                    + FruitsSearch.findFruitByName("Durian", myList));

            // eating and counting how much grams of salad is left
            LogPrinter.print("Lets eat our Salad! ");
            Breakfast b = new Breakfast();
            LogPrinter.print(b.eat(myList, 12) + " grams of Salad is left");

            // cooking second salad
            ArrayList<Fruit> mySecondSalad = new ArrayList<Fruit>();
            Apple a7 = new Apple("Red Apple", 1.3, 2.2, 52, "Apple", 10.02, 102, 3.4);            
            mySecondSalad.add(a7);
            Pear p4 = new Pear("Yellow Pear", 123, 2.2, 52, "Pear", 0.02, 1, 3.4);
            mySecondSalad.add(p4);
            Pear p3 = new Pear("Yellow Pear", 123, 2.2, 52, "Pear", 0.02, 1, 3.4);
            mySecondSalad.add(p3);
            Mango m1 = new Mango("Thai Mango", 8.7, 0.2, 1., "Mango", false, Mango.MangoColor.GREEN);
            mySecondSalad.add(m1);
            Mango m2 = new Mango("Thai Mango", 8.7, 0.2, 1., "Mango", false, Mango.MangoColor.YELLOW);
            mySecondSalad.add(m2);
            
            //sorting fruit in the second salad by name
            FruitSaladSort f2 = new FruitSaladSort();
            f2.sortFruitsByName(mySecondSalad);
            LogPrinter.print("Fruits are sorted by name: " + mySecondSalad);
            
            //sorting fruit in the second salad by type
             f2.sortFruitsByType(mySecondSalad);
            LogPrinter.print("Fruits are sorted by type: " + mySecondSalad);
            
            //sorting fruit in the second salad by price
            f2.sortFruitsByPrice(mySecondSalad);
            LogPrinter.print("Fruits are sorted by price: " + mySecondSalad);
             
            

        } catch (NegativeWeightException | NegativeCaloriesException
                | NegativePriceException | NegativeEatenPortionException e) {
        }
    }
}
