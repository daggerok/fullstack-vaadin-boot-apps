package com.github.daggerok.vaadin;

import java.io.Serializable;

import org.springframework.stereotype.Service;

@Service
public class GreetService implements Serializable {

    public String greet(String name) {
        return name == null || name.isEmpty()
            ? "Hello anonymous user"
            : "Hello " + name;
    }
}
