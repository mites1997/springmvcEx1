package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    User user=new User("Welcome to Stackroute");
   @RequestMapping("/*")
    public ModelAndView welcome()
   {
      // User user=new User("Welcome to Stackroute");
       ModelAndView mv=new ModelAndView("index");
       mv.addObject("message",user.getMessage());

       return mv;
   }

    }

