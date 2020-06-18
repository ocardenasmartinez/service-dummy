package cl.dummy.service.controllers;

import cl.dummy.service.controllers.entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping
    public ResponseEntity<List> getUsers(){
        User user1 = new User("Juan", "Perez");
        User user2 = new User("Elva", "Lazo");
        User user3 = new User("Soila", "Loca");
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}
