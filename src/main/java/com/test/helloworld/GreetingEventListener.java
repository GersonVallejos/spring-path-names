package com.test.helloworld;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class GreetingEventListener {

    private char letter;

    @EventListener(condition = "#event.name ne 'my Friend'")
    public void handleEvent(GreetingEvent event) {
        letter = event.getName().toUpperCase().charAt(0);
        System.out.println(letter);
    }

}
