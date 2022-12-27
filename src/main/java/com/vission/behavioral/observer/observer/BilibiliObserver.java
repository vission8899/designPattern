package com.vission.behavioral.observer.observer;

import com.vission.behavioral.observer.subjects.Subject;

public class BilibiliObserver extends Observer {

    public BilibiliObserver(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void note() {
        System.out.println("bilibili平台收到消息:" + subject.message);
    }
}
