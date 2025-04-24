package org.example.Level1.Model.Constructor;

import org.example.Level1.Model.Attributes.Dough;
import org.example.Level1.Model.Attributes.PizzaType;
import org.example.Level1.Model.Attributes.Size;
import org.example.Level1.Model.Attributes.Topping;
import org.example.Level1.Model.Builder.PizzaBuilder;
import org.example.Level1.Model.Pizza;

public class PizzeroVeggie implements PizzaBuilder {

    private PizzaType pizzaType;
    private Size size;
    private Dough dough;
    private Topping toppings;

    @Override
    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    @Override
    public void setDough(Dough dough) {
        this.dough = dough;
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void setToppings(Topping toppings) {
        this.toppings = toppings;

    }

    public Pizza getResult() {
        return new Pizza(pizzaType, size, dough, toppings);
    }
}
