package org.example.Level2.Model;

public class Agency implements Observer {

    private String name;

    public Agency(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, String movement) {


        System.out.println("📢 Hi, " + name + "! The stock '" + stockName + "' has gone " + (movement.equals("up") ? "up" : "down"));

    }
}