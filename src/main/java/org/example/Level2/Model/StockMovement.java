package org.example.Level2.Model;

import java.util.ArrayList;
import java.util.List;

public class StockMovement {

    private String stockName;
    private boolean stockMoved = false;
    private String movement;
    List<Observer> observers = new ArrayList<>();

    public StockMovement (String stockName) {
        this.stockName = stockName;
        //this.movement = movement;
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setStockMovement(boolean stockMoved, String movement) {

        this.stockMoved = stockMoved;

        this.movement = movement;

        if (stockMoved){
            notifyObservers();
        }

    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, movement);
        }
    }
}