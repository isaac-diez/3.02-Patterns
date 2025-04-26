package org.example.Level1.Builder;

import org.example.Level1.Attributes.Dough;
import org.example.Level1.Attributes.PizzaType;
import org.example.Level1.Attributes.Size;
import org.example.Level1.Attributes.Topping;
import org.example.Level1.Model.Pizza;

public interface PizzaBuilder {

    void setPizzaType(PizzaType pizzaType);
    void setDough(Dough dough);
    void setSize(Size size);
    void setToppings(Topping toppings);
    Pizza getResult();

}
