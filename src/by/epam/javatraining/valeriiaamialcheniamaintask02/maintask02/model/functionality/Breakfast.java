package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.functionality;

import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NegativeEatenPortionException;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Fruit;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.view.LogPrinter;
import java.util.ArrayList;

/*  
  @version 1.0 19 Jan 2019
  @author Valeriia Amialchenia
 */
public class Breakfast implements Eatable {

    @Override
    public double eat(ArrayList<Fruit> list, double eatenPortion) throws NegativeEatenPortionException {
        double remainingGramsOfSalad;
        if (eatenPortion <= 0) {
            throw new NegativeEatenPortionException();
        }
        return remainingGramsOfSalad
                = FruitSaladTotalWeight.getTotalWeight(list) - eatenPortion;

    }    
}
