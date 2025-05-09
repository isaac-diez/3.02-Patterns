package org.example.Level1.Model;

import org.example.Level1.Attributes.Dough;
import org.example.Level1.Attributes.PizzaType;
import org.example.Level1.Attributes.Size;
import org.example.Level1.Attributes.Topping;
import org.example.Level1.Builder.PizzaBuilder;

public class MestrePizzer {

    public void buildPizzaVeggieMedium(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.setPizzaType(PizzaType.VEGGIE);
        pizzaBuilder.setDough(Dough.VEGAN);
        pizzaBuilder.setSize(Size.MEDIUM);
        pizzaBuilder.setToppings(new Topping("cheese", "cucumber", "eggplant"));
    }

    public void buildPizzaBBQLarge(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.setPizzaType(PizzaType.BBQ);
        pizzaBuilder.setDough(Dough.PLAIN);
        pizzaBuilder.setSize(Size.LARGE);
        pizzaBuilder.setToppings(new Topping("cheese", "meat", "BBQ Sauce"));
    }

    public void buildPizzaHawaiiFamily(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.setPizzaType(PizzaType.HAWAII);
        pizzaBuilder.setDough(Dough.WHOLE);
        pizzaBuilder.setSize(Size.FAMILY);
        pizzaBuilder.setToppings(new Topping("cheese", "pineapple", "roasted pork"));
    }

}
