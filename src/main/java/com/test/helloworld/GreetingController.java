package com.test.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class GreetingController {

    private static final String template = "Bienvenido,%s!";
    private final AtomicLong counter = new AtomicLong();
    private ArrayList<String> array = new ArrayList<String>();

    @GetMapping(value = {"/greeting", "/greeting/{name}"})
    public String greeting(@PathVariable(required = false) String name, Model model){
        if(name == null){
            name = "my Friend";
        }
        array.add(name);
        model.addAttribute("greet", new Greeting(counter.incrementAndGet(),String.format(template,name)));
        model.addAttribute("alumnos",array);

        return "greetingView";
    }
}
