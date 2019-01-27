package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.utility;

import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Apple;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Banana;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Fruit;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Mango;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Pear;
import java.util.ArrayList;

/*  
  @version 1.0 19 Jan 2019
  @author Valeriia Amialchenia
 */
public class FruitSaladCook {

    public void cookFruitSalad(ArrayList<Fruit> list) {
        Apple a1 = new Apple("Green Apple", 1.6, 0.2, 52, Apple.FruitType.APPLE, 0.02, 62, 3.4);
        list.add(a1);
        Apple a2 = new Apple("Red Apple", 1.3, 2.2, 52, Apple.FruitType.APPLE, 10.02, 102, 3.4);
        list.add(a2);
        Pear p1 = new Pear("Yellow Pear", 123, 2.2, 52, Pear.FruitType.PEAR, 0.02, 1, 3.4);
        list.add(p1);
        Pear p2 = new Pear("Yellow Pear", 123, 2.2, 52, Pear.FruitType.PEAR, 0.02, 1, 3.4);
        list.add(p2);
        Mango m1 = new Mango("Thai Mango", 8.7, 0.2, 1., Mango.FruitType.MANGO, false, Mango.MangoColor.GREEN);
        list.add(m1);
        Banana b1 = new Banana("Banana", 0.4, 0.1, 1.2, Banana.FruitType.BANANA, "Marocco", 4.9);
        list.add(b1);

    }
}
