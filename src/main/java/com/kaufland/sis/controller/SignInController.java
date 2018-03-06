package com.kaufland.sis.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Scope("session")
public class SignInController {

    private static final String URL = "/sign_in";

    @GetMapping(URL)
    public String getSignIn() {
        return URL;
    }

    @PostMapping(URL)
    public String buttonLoginClicked() {
        checkLoginData();
        return "redirect:" + URL;
    }

    private void checkLoginData() {
        //TODO build Login
    }

}
