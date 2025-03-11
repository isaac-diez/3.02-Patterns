package org.example.Level1.Model;

public interface PizzaBuilder {

    void setPizzaType(PizzaType pizzaType);
    void setDough(Dough dough);
    void setSize(Size size);
    void setToppings(Topping toppings);

}
