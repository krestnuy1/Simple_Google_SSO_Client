package ru.katsevich.spring_sso_googleid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.katsevich.spring_sso_googleid.service.interfaces.PrincipalParser;


import java.security.Principal;

@RestController
public class ExampleController {

    private final PrincipalParser principalParser;

    @Autowired
    public ExampleController(PrincipalParser principalParser) {
        this.principalParser = principalParser;
    }

    @GetMapping("/")
    public String helloPage(){
        return "Hello user!";
    }

    @GetMapping("/user")
    public Principal userPage(Principal principal)  {
        principalParser.parsePrincipal(principal);
        return principal;
    }
}
