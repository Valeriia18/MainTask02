/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.functionality;

import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Fruit;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Salad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Алексей-Валерия
 */
public class FruitSaladSort {

    public void sortFruitsByName(Salad salad) {
        List<Fruit> fruits = salad.getFruits();
        Collections.sort(fruits, new NameComparator());

    }

    public void sortFruitsByType(Salad salad) {
        List<Fruit> fruits = salad.getFruits();
        Collections.sort(fruits, new TypeComparator());
    }

    public void sortFruitsByPrice(Salad salad) {
        List<Fruit> fruits = salad.getFruits();
        Collections.sort(fruits, new PriceComparator());
    }
}
