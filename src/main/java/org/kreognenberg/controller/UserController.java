package org.kreognenberg.controller;

import org.kreognenberg.model.UsersEntity;
import org.kreognenberg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome(ModelMap model) {
        List<UsersEntity> users = userService.getAll();
        model.addAttribute("users", users);
        return "index";
    }

    @RequestMapping(value="/userForm", method = RequestMethod.GET)
    public ModelAndView navigateToRegistration() {
        return new ModelAndView("users/userForm",
                "command", new UsersEntity());
    }

    @RequestMapping(value = "/userInfo", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("SpringWeb")UsersEntity user, ModelMap model) {
        try {
            userService.register(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        model.addAttribute("name", user.getName());
        model.addAttribute("password", user.getPassword());
        model.addAttribute("email", user.getEmail());
        model.addAttribute("gender", user.getGender());
        model.addAttribute("beer", user.getBeer());

        return "users/userInfo";
    }
}