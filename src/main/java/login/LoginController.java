package login;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import model.User;

/**
 * Created by roxanap on 18.02.2016.
 */
@RestController
public class LoginController {
    @RequestMapping(path = "/login", method = RequestMethod.POST, produces = "application/json")
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<User> login(){
        System.out.println("login");
        ResponseEntity<User> userResponseEntity = new ResponseEntity(User.builder().id(1).password("123").username("gigi").build(), HttpStatus.OK);
        System.out.println(userResponseEntity.getBody());
        return userResponseEntity;
    }
}
