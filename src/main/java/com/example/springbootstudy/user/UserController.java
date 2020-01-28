package com.example.springbootstudy.user;

//import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user/info")
    public String getUserInfo(Model model) {
        User user = new User();
        user.setId("woori");
        user.setName("jaewoon");
        user.setEmail("jwlee@dot-mill.com");

        model.addAttribute(user);
        return "user";
    }

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("hello", "hello");
        return "hello";
    }

}