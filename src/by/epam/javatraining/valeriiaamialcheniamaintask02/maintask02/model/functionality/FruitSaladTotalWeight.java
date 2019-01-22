/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.functionality;

import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.*;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Fruit;
import java.util.ArrayList;

/**
 *
 * @author Алексей-Валерия
 */
public class FruitSaladTotalWeight {
    public static double getTotalWeight(ArrayList<Fruit> list) {
        double sum = 0;
       try{
        for (Fruit temp : list) {
            sum += temp.getWeight();
        } 
       } catch (NegativeWeightException n){
       }
        return sum;
    }
}
