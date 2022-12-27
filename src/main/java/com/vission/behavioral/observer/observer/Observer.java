package com.vission.behavioral.observer.observer;

import com.vission.behavioral.observer.subjects.Subject;

public abstract class Observer {

    protected Subject subject;

    public void note() {
        System.out.println(getClass().getName() + ":" + subject.message);
    }
}
