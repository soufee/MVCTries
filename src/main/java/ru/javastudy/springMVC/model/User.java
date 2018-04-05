package ru.javastudy.springMVC.model;

import org.springframework.stereotype.Component;

/**
 * Created by Shoma on 05.04.2018.
 */

@Component
public class User {

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
