package org.example.Level1.Model.Builder;

import org.example.Level1.Model.Attributes.Dough;
import org.example.Level1.Model.Attributes.PizzaType;
import org.example.Level1.Model.Attributes.Size;
import org.example.Level1.Model.Attributes.Topping;

public interface PizzaBuilder {

    void setPizzaType(PizzaType pizzaType);
    void setDough(Dough dough);
    void setSize(Size size);
    void setToppings(Topping toppings);

}
