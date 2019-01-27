/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.valeriiaamialcheniamaintask02.maintask02.model.entity;

import java.util.ArrayList;
import java.util.List;

/*
 Class Salad is  a container class 

      @version 1.0 19 Jan 2019
  @author Valeriia Amialchenia
 */
public class Salad {

    private String name;
    private List<Fruit> salad;
    // private Salad[] salad;

    public Salad() {
        salad = new ArrayList<>();
    }

    public Salad(String name) {
        if (name == null || name.length() == 0) {
            new Salad();
        } else {
            this.name = name;
            this.salad = new ArrayList<>();
        }
    }

    public Salad(String name, List<Fruit> compositions) {
        if (name == null || name.length() == 0) {
            new Salad();
        } else {
            this.name = name;
            this.salad = new ArrayList<>();
            for (Fruit composition : compositions) {
                addFruit(composition);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            name = "";
        }
    }

    public List<Fruit> getFruits() {
        return salad;
    }

    public void setFruit(List<Fruit> compositions) {
        this.salad = salad;
    }

    public boolean addFruit(Fruit fruit) {
        return salad.add(fruit);
    }

    public boolean removeFruit(Fruit fruit) {
        return salad.remove(fruit);
    }

    @Override
    public String toString() {
        StringBuilder resultListToString = new StringBuilder("List: ");
        for (Fruit fruit : salad) {
            resultListToString.append(fruit);
            resultListToString.append("; ");
        }

        return getClass().getSimpleName() + ": name = " + name + "; " + resultListToString + "; ";
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }

        Salad s = (Salad) object;
        return name.equals(s.name) && salad.equals(s.salad);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((name != null) ? name.hashCode() : 0);
        result = prime * result + ((salad != null) ? salad.hashCode() : 0);

        return result;

    }
}
