package com.example.springbootstudy.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/info")
    public User getUserInfo() {
        User user = new User();
        user.setId("woori");
        user.setName("jaewoon");
        user.setEmail("jwlee@dot-mill.com");

        return user;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}