/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.functionality;

import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Fruit;
import java.util.Comparator;

/**
 *
 * @author Алексей-Валерия
 */
public class TypeComparator implements Comparator <Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
       return o1.getType().compareToIgnoreCase(o2.getType());
    }
}
