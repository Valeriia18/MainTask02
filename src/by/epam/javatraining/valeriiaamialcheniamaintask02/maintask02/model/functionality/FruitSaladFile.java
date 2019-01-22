package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.functionality;

import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.*;
import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NegativeWeightException;
import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.NegativeCaloriesException;
import by.epam.javatraining.valeriiaamialchenia.maintask02.controller.MainTask02;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity.Fruit;
import by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.view.ConsolePrinter;

import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;


/*  
Class implements serialization and deserialization of given ArrayList
  @version 1.0 19 Jan 2019
  @author Valeriia Amialchenia
 */
public class FruitSaladFile {

    public static void loadInitialSaladFromFile(ArrayList<Fruit> list) throws NegativeWeightException, NegativeCaloriesException, IOException {

        
        try {
            FileOutputStream f = new FileOutputStream(new File("C:\\Temp\\Java\\FruitSalad.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(list);

            FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            list = (ArrayList<Fruit>) oi.readObject();

            ConsolePrinter.print("" + list);

            o.close();
            f.close();
        } catch (FileNotFoundException | ClassNotFoundException e) {
        }

    }


}
