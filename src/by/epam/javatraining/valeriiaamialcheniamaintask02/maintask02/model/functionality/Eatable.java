package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.functionality;

import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NegativeEatenPortionException;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Fruit;
import java.util.ArrayList;

/*  
  @version 1.0 19 Jan 2019
  @author Valeriia Amialchenia
 */
public interface Eatable {
    public double eat(ArrayList<Fruit> list, double eatenPortion) throws NegativeEatenPortionException;
}
