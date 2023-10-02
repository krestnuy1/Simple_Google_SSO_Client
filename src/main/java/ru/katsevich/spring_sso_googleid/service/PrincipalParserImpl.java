package ru.katsevich.spring_sso_googleid.service;

import org.springframework.stereotype.Component;
import ru.katsevich.spring_sso_googleid.service.interfaces.PrincipalParser;

import java.security.Principal;


@Component
public class PrincipalParserImpl implements PrincipalParser {
    @Override
    public void parsePrincipal(Principal principal) {


        String[] parts = principal.toString().split(",\\s+");
        String givenName = null;
        String familyName = null;
        String email = null;

        for (String part : parts) {
            if (part.startsWith("given_name=")) {
                givenName = part.substring("given_name=".length());
            } else if (part.startsWith("family_name=")) {
                familyName = part.substring("family_name=".length());
            } else if (part.startsWith("email=")) {
                email = part.substring("email=".length());
            }
        }

        System.out.println("Given Name: " + givenName);
        System.out.println("Family Name: " + familyName);
        System.out.println("Email: " + email);
    }
}
