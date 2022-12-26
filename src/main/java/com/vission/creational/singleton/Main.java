package com.vission.creational.singleton;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                DomainHungry domainHungry = DomainHungry.getDomain();
                String name = domainHungry.getName();
                System.out.println(name + ":" + domainHungry.hashCode());
            }).start();
        }

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    DomainLazy domainLazy = DomainLazy.getDomain();
                    String name = domainLazy.getName();
                    System.out.println(name + ":" + domainLazy.hashCode());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }


    }
}