/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.functionality;

import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NegativeCaloriesException;
import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NegativeEatenPortionException;
import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NegativePriceException;
import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NegativeWeightException;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Fruit;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Salad;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Valeriia_Amialchenia
 */
public class FruitSaladManager {

    public static double getTotalPrice(Salad salad) {
        double sum = 0;
        List<Fruit> fruits = salad.getFruits();
        for (Fruit temp : fruits) {
            sum += temp.getPrice();
        }

        return sum;
    }

    public static double getTotalWeight(Salad salad) {
        double sum = 0.0;
        List<Fruit> fruits = salad.getFruits();
        for (Fruit fruit : fruits) {
            sum += fruit.getWeight();
        }

        return sum;
    }

    public static double getTotalCalories(Salad salad) {
        double sumCalories = 0.0;
        List<Fruit> fruits = salad.getFruits();
        for (Fruit temp : fruits) {

            sumCalories += temp.getWeight() * temp.getCaloriePer100g() / 100;

        }
        return sumCalories;
    }

    public static double eat(Salad salad, double eatenPortion) {
        double remainingGramsOfSalad = 0.0;
        return remainingGramsOfSalad = getTotalWeight(salad) - eatenPortion;

    }
}
