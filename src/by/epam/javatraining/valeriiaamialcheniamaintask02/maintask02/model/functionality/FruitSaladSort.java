/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.functionality;

import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Fruit;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Алексей-Валерия
 */
public class FruitSaladSort {

    public void sortFruitsByName(ArrayList<Fruit> list) {
        Collections.sort(list, new NameComparator());

    }

    public  void sortFruitsByType(ArrayList<Fruit> list) {
        Collections.sort(list, new TypeComparator());
    }
    public  void sortFruitsByPrice(ArrayList<Fruit> list) {
        Collections.sort(list, new PriceComparator());
    }
}
