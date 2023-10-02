package ru.katsevich.spring_sso_googleid.service.interfaces;

import org.springframework.stereotype.Component;

import java.security.Principal;

@Component
public interface PrincipalParser {
    public void parsePrincipal(Principal principal);
}
