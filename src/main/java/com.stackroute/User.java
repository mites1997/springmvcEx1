package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
public class User {
    @Autowired
    private StringBuilder message;
    public User()
    {

    }



    public User(StringBuilder message) {
        this.message = message;
    }

    public StringBuilder getMessage() {
        return message;
    }


    @Override
    public String toString() {
        return "User{" +
                "message='" + message + '\'' +
                '}';
    }
        @Bean
        public StringBuilder name()
        {
             StringBuilder name=new StringBuilder("Welcome to Stackroute");
            return name;
        }
    }

