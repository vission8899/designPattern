package com.vission.behavioral.observer;

import com.vission.behavioral.observer.observer.BilibiliObserver;
import com.vission.behavioral.observer.observer.YoutubeObserver;
import com.vission.behavioral.observer.subjects.Subject;

/**
 * 观察者模式 【发布订阅模式有消息中心 做了解耦处理】
 *
 * @author vission
 */
public class Main {

    /**
     * 做一个简单的消息订阅Demo
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        //java 自带接口Observer Observable
        Subject subject = new Subject();
        new YoutubeObserver(subject);
        new BilibiliObserver(subject);
        subject.push("Hello World");
    }
}
