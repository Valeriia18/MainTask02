package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.view;

import by.epam.javatraining.valeriiaamialchenia.maintask02.controller.MainTask02;
import org.apache.log4j.Logger;

/*
 Class LogPrinter 

      @version 1.0 19 Jan 2019
  @author Valeriia Amialchenia
 */
public class LogPrinter implements Printable {

    private static org.apache.log4j.Logger log = null;
   
        @Override
    public void print(String msg) {
         log = Logger.getLogger(LogPrinter.class);
        log.info(msg);
    }
}
