package ru.katsevich.spring_sso_googleid.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class ExampleController {

    @GetMapping("/")
    public String helloPage(){
        return "Hello user!";
    }

    @GetMapping("/user")
    public Principal userPage(Principal principal){
        return principal;
    }
}
