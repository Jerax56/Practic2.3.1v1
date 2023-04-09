package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import web.model.User;
import web.service.UserService;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/")
    String getUsers(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "users";
    }
    @GetMapping(value = "/addNewUser")
    public String addNewUser(Model model) {
        model.addAttribute("newUser", new User());
        return "user-info";
    }
    @PostMapping(value="/saveUser")
    public String saveUser(@ModelAttribute("newUser") User user) {
        userService.saveUsers(user);
        return "redirect:/";
    }
}
