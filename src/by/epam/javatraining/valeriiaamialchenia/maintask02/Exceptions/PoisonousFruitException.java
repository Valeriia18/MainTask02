/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions;
import by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions.LogicalException;
/*  
  @version 1.0 19 Jan 2019
  @author Valeriia Amialchenia
 */
public class PoisonousFruitException extends LogicalException{
    public PoisonousFruitException() {
        super(PoisonousFruitException.class.getSimpleName());
    }
    public PoisonousFruitException(String msg) {
        super(msg);
    }
}
