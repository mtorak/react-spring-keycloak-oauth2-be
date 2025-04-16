package com.keycloak.rest.controller;

import com.keycloak.rest.entity.CardEntity;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Arrays;
import java.util.List;

@RestController
public class CardController {

    @PreAuthorize("hasAuthority('ROLE_view-cards')")
    @RequestMapping("/cards")
    public List<CardEntity> getCars(Authentication auth, Principal principal) {
        return Arrays.asList(
          new CardEntity("Master Roshi", "orange", 22000000L),
          new CardEntity("Korin", "white", 24500000L),
          new CardEntity("Android 18", "yellow", 45000000L));
    }

}