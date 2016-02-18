package ro.rh.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.rh.main.LoginService;
import ro.rh.main.User;

/**
 * Created by roxana on 18.02.2016.
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(method = RequestMethod.GET, path = "/hello",produces = "application/json")
    public String getLogin() {
        return "Hello,"+ User.builder().name("Puffer").build();
    }

}
