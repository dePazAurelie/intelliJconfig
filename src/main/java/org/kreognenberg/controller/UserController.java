package org.kreognenberg.controller;

import org.kreognenberg.model.User;
import org.kreognenberg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView user() {
        return new ModelAndView("users/userForm", "command", new User());
    }


    @RequestMapping(value = "/userInfo", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("SpringWeb")User user, ModelMap model) {
        model.addAttribute("name", user.getName());
        model.addAttribute("password", user.getPassword());
        model.addAttribute("email", user.getEmail());

        return "users/userInfo";
    }
}

/*
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model){
        return "users/userForm";
    }

    @RequestMapping(value = "/userForm", method = RequestMethod.GET)
    public ModelAndView userForm(){
        return new ModelAndView("users/userForm", "command", new User());
    }

    @RequestMapping(value = "/userInfo", method = RequestMethod.POST)
    public String addUser(@ModelAttribute User person){
        return "users/userInfo";
    }
}
*/