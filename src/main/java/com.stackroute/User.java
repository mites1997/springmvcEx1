package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class User {

    private String message;



    public User(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public User(String message, int id) {
        this.message = message;

    }

    @Override
    public String toString() {
        return "User{" +
                "message='" + message + '\'' +
                '}';
    }
}
