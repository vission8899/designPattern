package com.vission.behavioral.observer.observer;

import com.vission.behavioral.observer.subjects.Subject;

public class YoutubeObserver extends Observer {

    public YoutubeObserver(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void note() {
        System.out.println("Youtube平台收到消息:" + subject.message);
    }
}
