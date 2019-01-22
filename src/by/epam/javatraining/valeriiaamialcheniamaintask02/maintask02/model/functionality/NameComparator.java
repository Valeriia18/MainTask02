/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.functionality;

import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NegativePriceException;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Fruit;
import java.util.Comparator;

/**
 *
 * @author Алексей-Валерия
 */
public class NameComparator implements Comparator<Fruit> {

//    @Override
//     public int compare(Fruit o1, Fruit o2) {
//       return o1.getName().compareToIgnoreCase(o2.getName());
//    }
    @Override
    public int compare(Fruit o1, Fruit o2) {
        int result = 0;
        try {
            double p1 = o1.getPrice();
            double p2 = o2.getPrice();

            if (p1 < p2) {
                return 1;
            } else if (p1 > p2) {
                result = -1;
            } else {
                result = 0;
            }
        } catch (NegativePriceException c) {
        }
        return result;
    }

}
