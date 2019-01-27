package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.utility;

import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.*;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Fruit;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Fruit.FruitType;
import static by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Fruit.FruitType.APPLE;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.view.ConsolePrinter;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.view.LogPrinter;
import java.io.*;
import java.util.Properties;
import java.util.Scanner;
import java.util.StringTokenizer;


/*  
Class implements serialization and deserialization of given ArrayList
  @version 1.0 19 Jan 2019
  @author Valeriia Amialchenia
 */
public class FruitSaladFile {

    private static final String diskPath = "C:\\Temp\\Java\\FruitSalad.txt";
    private static final ConsolePrinter cp = new ConsolePrinter();
    private static final LogPrinter lp = new LogPrinter();

    public static Salad readFromFile() throws FileNotFoundException, IOException {
        //Salad result = new Salad();
//        try {
        FileInputStream filestream = new FileInputStream(diskPath);
        //Properties property = new Properties();
        Scanner sc = new Scanner(filestream);
        //File inputFile = new File(property.getProperty("inputfile"));
        //property.load(filestream);
        Salad result = new Salad();

        while (sc.hasNextLine()) {
            Fruit fruit = new Fruit();
            String data = sc.nextLine();
            StringTokenizer token = new StringTokenizer(data, ",");
            while (token.hasMoreTokens()) {
                fruit.setName(token.nextToken());
                fruit.setPrice(Double.parseDouble(token.nextToken()));
                fruit.setWeight(Double.parseDouble(token.nextToken()));
                fruit.setCaloriePer100g(Double.parseDouble(token.nextToken()));
                fruit.setType(FruitType.valueOf(token.nextToken()));
                switch (fruit.getType()) {
                    case APPLE:
                        
                       Apple ap = new Apple();
                      
                        ap.setVitaminAPer100g(Double.parseDouble(token.nextToken()));
                        ap.setCalciumPer100g(Double.parseDouble(token.nextToken()));
                        ap.setPhosphorusPer100g(Double.parseDouble(token.nextToken()));
                        
                }

            }

            result.addFruit(fruit);

        }
//        } catch (FileNotFoundException e) {
//            lp.print("File is not found! Try agian. ");
//        }
        return result;
    }

}

//    public static void loadInitialSaladFromFile(ArrayList<Fruit> list) throws NegativeWeightException, NegativeCaloriesException, IOException {
//
//        try {
//            FileOutputStream f = new FileOutputStream(new File(diskPath));
//            ObjectOutputStream o = new ObjectOutputStream(f);
//            o.writeObject(list);
//
//            FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
//            ObjectInputStream oi = new ObjectInputStream(fi);
//
//            // Read objects
//            list = (ArrayList<Fruit>) oi.readObject();
//
//            cp.print("" + list);
//
//            o.close();
//            f.close();
//        } catch (FileNotFoundException | ClassNotFoundException e) {
//        }
//
//    }}
