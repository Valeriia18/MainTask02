
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Apple;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Banana;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Fruit;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Mango;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Pear;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.functionality.FruitSaladTotalPrice;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
//import static org.testng.Assert.assertEquals;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Алексей-Валерия
 */
public class FruitSaladTotalPriceTest {
    @Before
    public static void setUpClass(ArrayList<Fruit> list) throws Exception {
     list = new ArrayList <Fruit>();
        Apple a1 = new Apple("Green Apple", 15, 0.2, 52, "Apple", 0.02, 62, 3.4);
        list.add(a1);
        Apple a2 = new Apple("Red Apple", 10, 2.2, 52, "Apple", 10.02, 102, 3.4);
        list.add(a2);
        Pear p1 = new Pear("Yellow Pear", 0, 2.2, 52, "Pear", 0.02, 1, 3.4);
        list.add(p1);
        Pear p2 = new Pear("Yellow Pear", 100, 2.2, 52, "Pear", 0.02, 1, 3.4);
        list.add(p2);
        Mango m1 = new Mango("Thai Mango", 8, 0.2, 1., "Mango", false, Mango.MangoColor.GREEN);
        list.add(m1);
        Banana b1 = new Banana("Banana", 4, 0.1, 1.2, "Banana", "Marocco", 4.9);
        list.add(b1);
    }
    
    @Test
    public void testGetTotalPrice() {
        System.out.println("getTotalPrice");
        ArrayList<Fruit> list = null;
        double expResult = 136;
        double result = FruitSaladTotalPrice.getTotalPrice(list);
       assertEquals(result, expResult, 0.0);
      
    }
    
}
