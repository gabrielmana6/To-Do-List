package br.com.gabrielmana6.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @PostMapping("/")
    public void createUser(@RequestBody UserModel user){
        System.out.println(user.name);
    }
}
