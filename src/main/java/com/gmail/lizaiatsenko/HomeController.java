package com.gmail.lizaiatsenko;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String goUser(){
        return "/content/user";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String goAdmin(){
        return "/content/admin";
    }

    @RequestMapping(value = {"/", "/homePage"}, method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false)String error){
       ModelAndView model= new ModelAndView();
       if(error!=null){
           model.addObject("error", "invalid user or password!");

       }
       model.setViewName("homePage");
        return model;
    }

}
