package org.example.Level1.Model;

import org.example.Level1.Model.Attributes.Dough;
import org.example.Level1.Model.Attributes.PizzaType;
import org.example.Level1.Model.Attributes.Size;
import org.example.Level1.Model.Attributes.Topping;

public class Pizza {

    private PizzaType pizzaType;
    private Size size;
    private Dough dough;
    private Topping toppings;

    public Pizza(PizzaType pizzaType, Size size, Dough dough, Topping toppings) {
        this.pizzaType = pizzaType;
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public Size getSize() {
        return size;
    }

    public Dough getDough() {
        return dough;
    }

    public Topping getToppings() {
        return toppings;
    }

    public String print() {

        String info = "Type of pizza: " + this.pizzaType + "\n" +
                "Dough: " + this.dough  + "\n" +
                "Size: " + this.size + "\n" +
                "Toppings: " + (this.toppings.printToppings()) + "\n";

        return info;
    }
}
