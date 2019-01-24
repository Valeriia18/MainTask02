package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.functionality;

import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NegativeCaloriesException;
import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NegativeWeightException;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Fruit;
import java.util.ArrayList;

/*  
  @version 1.0 19 Jan 2019
  @author Valeriia Amialchenia
 */
public class FruitSaladCalories {
        public static double getTotalCalories(ArrayList<Fruit> list) throws NegativeWeightException, NegativeCaloriesException {
        double sumCalories = 0.0;

        for (Fruit temp : list) {
            try {
                sumCalories += temp.getWeight() * temp.getCaloriePer100g() / 100;
            } catch (NegativeCaloriesException n) {
            } catch (NegativeWeightException e) {
            }

        }
        return sumCalories;
    }
}
