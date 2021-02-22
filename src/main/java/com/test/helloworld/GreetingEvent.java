package com.test.helloworld;

import org.springframework.context.ApplicationEvent;

public class GreetingEvent extends ApplicationEvent {

    private String name;

    public GreetingEvent(Object source,String name) {
        super(source);
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
