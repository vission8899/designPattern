package com.vission.behavioral.observer.subjects;

import com.vission.behavioral.observer.observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class Subject {

    private final List<Observer> observers = new ArrayList<>();

    public String message;

    public void push(String message) {
        this.message = message;
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.note();
        }
    }
}
