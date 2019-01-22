package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.functionality;

import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.*;
//import by.epam.javatraining.valeriiaamialchenia.maintask02.controller.MainTask02;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Fruit;
import java.util.ArrayList;

/*
 Class FruitSaladCalculcations implements methods getTotalPrice for counting 
total price of a given fruit salad and getTotalCalories for counting total
calorific value of a given fruit salad.

      @version 1.0 19 Jan 2019
  @author Valeriia Amialchenia
 */
public class FruitSaladTotalPrice {
//
//    private static org.apache.log4j.Logger log = null;
//

    public static double getTotalPrice(ArrayList<Fruit> list) {
        double sum = 0;
       try{
        for (Fruit temp : list) {
            sum += temp.getPrice();
        } 
       } catch (NegativePriceException n){
       }
        return sum;
    }

 }
