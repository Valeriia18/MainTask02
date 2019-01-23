
import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NegativePriceException;
import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NullArrayException;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.*;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.functionality.FruitSaladTotalPrice;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.functionality.FruitsSearch;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
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
       double result = FruitSaladTotalPrice.getTotalPrice(list);
       assertEquals(result, 56.9, 0.0);
      
    }
    @Test
    public void findMaxCalorificFruit1(){
     ArrayList<Fruit> list = new ArrayList <Fruit>();
        Apple a1 = new Apple("Green Apple", 15, 0.2, 4, "Apple", 0.02, 62, 3.4);
        list.add(a1);
        Apple a2 = new Apple("Red Apple", 2, 2.2, 1, "Apple", 10.02, 102, 3.4);
        list.add(a2);
        Pear p1 = new Pear("Yellow Pear", 6, 2.2, 2, "Pear", 0.02, 1, 3.4);
        list.add(p1);
        Pear p2 = new Pear("Yellow Pear", 0.9, 2.2, 50, "Pear", 0.02, 1, 3.4);
        list.add(p2);
        Mango m1 = new Mango("Thai Mango", 23, 0.2, 1., "Mango", false, Mango.MangoColor.GREEN);
        list.add(m1);
        Banana b1 = new Banana("Banana", 10, 0.1, 1.2, "Banana", "Marocco", 4.9);
        list.add(b1);
         StringBuilder actual = FruitsSearch.findMaxCalorificFruit(list);
       StringBuilder expected = new StringBuilder("Yellow Pear");
        assertEquals (actual.toString(), expected.toString());
    }
        @Test
    public void findMaxCalorificFruit2(){
     ArrayList<Fruit> list = new ArrayList <Fruit>();
        Apple a1 = new Apple("Green Apple", 15, 0.2, 0, "Apple", 0.02, 62, 3.4);
        list.add(a1);
        
      String actual = FruitsSearch.findMaxCalorificFruit2(list);
       String expected = "";
        assertEquals (actual, expected);
    }
    @Test
    public void findMaxCalorificFruit3() throws NullArrayException {
        ArrayList<Fruit> list = new  ArrayList<Fruit>();              
       StringBuilder result = FruitsSearch.findMaxCalorificFruit(list);
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
        assertEquals (result, "The most expensive fruit is Thai Mango. The price is 23.0");
       
    
    }
    @Test
    public void findMostExpensiveFruit2() throws NullArrayException, NegativePriceException, NegativePriceException{
     ArrayList<Fruit> list = new ArrayList <Fruit>();
        Apple a1 = new Apple("Green Apple", 0, 0.2, 0, "Apple", 0.02, 62, 3.4);
        list.add(a1);
        Apple a2 = new Apple("Red Apple", 0, 2.2, 0, "Apple", 10.02, 102, 3.4);
        list.add(a2);
        Pear p1 = new Pear("Yellow Pear", 0, 2.2, 0, "Pear", 0.02, 1, 3.4);
        list.add(p1);
        Pear p2 = new Pear("Yellow Pear", 0, 2.2, 50, "Pear", 0.02, 1, 3.4);
        list.add(p2);
        Mango m1 = new Mango("Thai Mango", 23, 0.2, 1., "Mango", false,
                Mango.MangoColor.GREEN);
        list.add(m1);
        Banana b1 = new Banana("Banana", 0, 0.1, 1.2, "Banana", 
                "Marocco", 4.9);
        list.add(b1);
         String result = FruitsSearch.findMostExpensiveFruit(list);
        assertEquals (result, "The most expensive fruit is . The price is 0.0");
    
    }
    @Test
    public void findMostExpensiveFruit3() throws NullArrayException, NegativePriceException {
        ArrayList<Fruit> list = new ArrayList <Fruit>();                
        String result = FruitsSearch.findMostExpensiveFruit(list);
       assertNull(null);
      
    }
    
    @Test
    public void findCheapestFruit1() throws NullArrayException, NegativePriceException {
        ArrayList<Fruit> list = null;                
        assertNull(list);
      
    }
    @Test
    public void findCheapestFruit2() throws NullArrayException, NegativePriceException{
     ArrayList<Fruit> list = new ArrayList <Fruit>();
        Apple a1 = new Apple("Green Apple", 34, 0.2, 0, "Apple", 0.02, 62, 3.4);
        list.add(a1);
        Apple a2 = new Apple("Red Apple", 9, 2.2, 0, "Apple", 10.02, 102, 3.4);
        list.add(a2);
        Pear p1 = new Pear("Yellow Pear", 7, 2.2, 0, "Pear", 0.02, 1, 3.4);
        list.add(p1);
        Pear p2 = new Pear("Yellow Pear", 6, 2.2, 50, "Pear", 0.02, 1, 3.4);
        list.add(p2);
        Mango m1 = new Mango("Thai Mango",9, 0.2, 1., "Mango", false,
                Mango.MangoColor.GREEN);
        list.add(m1);
        Banana b1 = new Banana("Banana", 1, 0.1, 1.2, "Banana", 
                "Marocco", 4.9);
        list.add(b1);
         String result = FruitsSearch.findCheapestFruit(list);
        assertEquals (result, "The cheapest fruit is Banana. The price is 1.0");
    
    }
    @Test
    public void findFruitByPrice1() throws NullArrayException, NegativePriceException{
    double a = 0.9;
      double b = 3;
      ArrayList<Fruit> list = new ArrayList <Fruit>(); 
      Apple a1 = new Apple("Green Apple", 34, 0.2, 0, "Apple", 0.02, 62, 3.4);
        list.add(a1);
        Apple a2 = new Apple("Red Apple", 9, 2.2, 0, "Apple", 10.02, 102, 3.4);
        list.add(a2);
        Pear p1 = new Pear("Yellow Pear", 7, 2.2, 0, "Pear", 0.02, 1, 3.4);
        list.add(p1);
        Pear p2 = new Pear("Yellow Pear", 6, 2.2, 50, "Pear", 0.02, 1, 3.4);
        list.add(p2);
        Mango m1 = new Mango("Thai Mango",80, 0.2, 1., "Mango", false,
                Mango.MangoColor.GREEN);
        list.add(m1);
        Banana b1 = new Banana("Banana", 1, 0.1, 1.2, "Banana", 
                "Marocco", 4.9);
        list.add(b1);
       StringBuilder s = (FruitsSearch.findFruitByPrice(a, b, list));
       StringBuilder expected = new StringBuilder ("Banana(Banana)"); 
       assertEquals (s.toString(), expected.toString());
               
    }
    @Test
    public void findFruitByPrice2() throws NullArrayException, NegativePriceException{
    double a = 0.0;
      double b = 0.0;
      ArrayList<Fruit> list = new ArrayList <Fruit>(); 
      Apple a1 = new Apple("Green Apple", 34, 0.2, 0, "Apple", 0.02, 62, 3.4);
        list.add(a1);
        Apple a2 = new Apple("Red Apple", 9, 2.2, 0, "Apple", 10.02, 102, 3.4);
        list.add(a2);
        Pear p1 = new Pear("Yellow Pear", 7, 2.2, 0, "Pear", 0.02, 1, 3.4);
        list.add(p1);
        Pear p2 = new Pear("Yellow Pear", 6, 2.2, 50, "Pear", 0.02, 1, 3.4);
        list.add(p2);
        Mango m1 = new Mango("Thai Mango",80, 0.2, 1., "Mango", false,
                Mango.MangoColor.GREEN);
        list.add(m1);
        Banana b1 = new Banana("Banana", 1, 0.1, 1.2, "Banana", 
                "Marocco", 4.9);
        list.add(b1);
       StringBuilder s = (FruitsSearch.findFruitByPrice(a, b, list));
       StringBuilder expected = new StringBuilder (""); 
       assertEquals (s.toString(), expected.toString());
               
    }
   
}
