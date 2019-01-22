/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.valeriiaamialchenia.maintask02.Exceptions;

/*  
  @version 1.0 19 Jan 2019
  @author Valeriia Amialchenia
 */
public class NegativeWeightException extends LogicalException {
 public NegativeWeightException() {
        super(NegativeWeightException.class.getSimpleName());
    }
    public NegativeWeightException(String msg) {
        super(msg);
    }
}
