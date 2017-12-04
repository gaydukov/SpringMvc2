package com.springmvc.controller;


import com.springmvc.object.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping (value = "/", method = RequestMethod.GET)
    public ModelAndView Home(){
        return new ModelAndView("login","User",new User());
            }

     @RequestMapping(value = "HelloUser",method = RequestMethod.POST)
    public ModelAndView HelloUser(@ModelAttribute("User") User user){
         ModelAndView modelAndView=new ModelAndView();
         modelAndView.setViewName("helloview");
         modelAndView.addObject(user);
         return modelAndView;
     }
}
