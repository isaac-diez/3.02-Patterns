package org.example.Level1.Main;

import org.example.Level1.Model.*;

public class Main {
    public static void main(String[] args) {

        MestrePizzer mestrePizzer = new MestrePizzer();


        PizzeroHawaii pizzeroHawaii = new PizzeroHawaii();
        mestrePizzer.buildPizzaHawaiiFamily(pizzeroHawaii);
        Pizza hawaii = pizzeroHawaii.getResult();
        System.out.println("Pizza:\n" + hawaii.print());


        PizzeroBBQ pizzeroBBQ = new PizzeroBBQ();
        mestrePizzer.buildPizzaBBQLarge(pizzeroBBQ);
        Pizza bbq = pizzeroBBQ.getResult();
        System.out.println("Pizza:\n" + bbq.print());


        PizzeroVeggie pizzeroVeggie = new PizzeroVeggie();
        mestrePizzer.buildPizzaVeggieMedium(pizzeroVeggie);
        Pizza veggie = pizzeroVeggie.getResult();
        System.out.println("Pizza:\n" + veggie.print());


    }
}