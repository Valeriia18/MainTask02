
import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NegativePriceException;
import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NullArrayException;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.*;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.functionality.FruitSaladTotalPrice;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.functionality.FruitsSearch;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valeriia_Amialchenia
 */
public class FruitsSearchTest {
    @Before
    public void setup() {
        ArrayList<Fruit> list = new ArrayList <Fruit>();
        Apple a1 = new Apple("Green Apple", 15, 0.2, 0, "Apple", 0.02, 62, 3.4);
        list.add(a1);
        Apple a2 = new Apple("Red Apple", 2, 2.2, 0, "Apple", 10.02, 102, 3.4);
        list.add(a2);
        Pear p1 = new Pear("Yellow Pear", 6, 2.2, 0, "Pear", 0.02, 1, 3.4);
        list.add(p1);
        Pear p2 = new Pear("Yellow Pear", 0.9, 2.2, 50, "Pear", 0.02, 1, 3.4);
        list.add(p2);
        Mango m1 = new Mango("Thai Mango", 23, 0.2, 1., "Mango", false, Mango.MangoColor.GREEN);
        list.add(m1);
        Banana b1 = new Banana("Banana", 10, 0.1, 1.2, "Banana", "Marocco", 4.9);
        list.add(b1);
       // double expResult = 15;
        double result = FruitSaladTotalPrice.getTotalPrice(list);
       assertEquals(result, 56.9, 0.0);
      
    }
    @Test
    public void findMaxCalorificFruit1(){
     ArrayList<Fruit> list = new ArrayList <Fruit>();
        Apple a1 = new Apple("Green Apple", 15, 0.2, 0, "Apple", 0.02, 62, 3.4);
        list.add(a1);
        Apple a2 = new Apple("Red Apple", 2, 2.2, 0, "Apple", 10.02, 102, 3.4);
        list.add(a2);
        Pear p1 = new Pear("Yellow Pear", 6, 2.2, 0, "Pear", 0.02, 1, 3.4);
        list.add(p1);
        Pear p2 = new Pear("Yellow Pear", 0.9, 2.2, 50, "Pear", 0.02, 1, 3.4);
        list.add(p2);
        Mango m1 = new Mango("Thai Mango", 23, 0.2, 1., "Mango", false, Mango.MangoColor.GREEN);
        list.add(m1);
        Banana b1 = new Banana("Banana", 10, 0.1, 1.2, "Banana", "Marocco", 4.9);
        list.add(b1);
        String result = FruitsSearch.findMaxCalorificFruit(list);
        assertEquals (result, "The most calorific fruit is Yellow Pear. It contains 540.0 cal. per 100g", 0.0);
    }
        @Test
    public void findMaxCalorificFruit2(){
     ArrayList<Fruit> list = new ArrayList <Fruit>();
        Apple a1 = new Apple("Green Apple", 15, 0.2, 0, "Apple", 0.02, 62, 3.4);
        list.add(a1);
        
        String result = FruitsSearch.findMaxCalorificFruit(list);
        assertEquals (result, "The most calorific fruit is Green Apple. It contains 0 cal. per 100g", 0.0);
    }
    @Test
    public void findMaxCalorificFruit3() throws NullArrayException {
        ArrayList<Fruit> list = new  ArrayList<Fruit>();              
       String result = FruitsSearch.findMaxCalorificFruit(list);
       assertNull(null);
      
    }
     @Test
    public void findMostExpensiveFruit1() throws NullArrayException, NegativePriceException{
     ArrayList<Fruit> list = new ArrayList <Fruit>();
        Apple a1 = new Apple("Green Apple", 15, 0.2, 0, "Apple", 0.02, 62, 3.4);
        list.add(a1);
        Apple a2 = new Apple("Red Apple", 2, 2.2, 0, "Apple", 10.02, 102, 3.4);
        list.add(a2);
        Pear p1 = new Pear("Yellow Pear", 6, 2.2, 0, "Pear", 0.02, 1, 3.4);
        list.add(p1);
        Pear p2 = new Pear("Yellow Pear", 0.9, 2.2, 50, "Pear", 0.02, 1, 3.4);
        list.add(p2);
        Mango m1 = new Mango("Thai Mango", 23, 0.2, 1., "Mango", false,
                Mango.MangoColor.GREEN);
        list.add(m1);
        Banana b1 = new Banana("Banana", 10, 0.1, 1.2, "Banana", 
                "Marocco", 4.9);
        list.add(b1);
        String result = FruitsSearch.findMostExpensiveFruit(list);
        assertEquals (result, "The most calorific fruit is Thai Mango. It's price is 23", 0.0);
    
    }
    @Test
    public void findMostExpensiveFruit2() throws NullArrayException, NegativePriceException{
     ArrayList<Fruit> list = new ArrayList <Fruit>();
        Apple a1 = new Apple("Green Apple", 0, 0.2, 0, "Apple", 0.02, 62, 3.4);
        list.add(a1);
        Apple a2 = new Apple("Red Apple", 0, 2.2, 0, "Apple", 10.02, 102, 3.4);
        list.add(a2);
        Pear p1 = new Pear("Yellow Pear", 0, 2.2, 0, "Pear", 0.02, 1, 3.4);
        list.add(p1);
        Pear p2 = new Pear("Yellow Pear", 0, 2.2, 50, "Pear", 0.02, 1, 3.4);
        list.add(p2);
        Mango m1 = new Mango("Thai Mango", 0, 0.2, 1., "Mango", false,
                Mango.MangoColor.GREEN);
        list.add(m1);
        Banana b1 = new Banana("Banana", 0, 0.1, 1.2, "Banana", 
                "Marocco", 4.9);
        list.add(b1);
        String result = FruitsSearch.findMostExpensiveFruit(list);
        assertEquals (result, "The most calorific fruit is Thai Mango. It's price is 0", 0.0);
    
    }
    @Test
    public void findMostExpensiveFruit3() {
        ArrayList<Fruit> list = new ArrayList <Fruit>();                
        double result = FruitSaladTotalPrice.getTotalPrice(list);
       assertEquals(result, 0.0, 0.0);
      
    }
}
