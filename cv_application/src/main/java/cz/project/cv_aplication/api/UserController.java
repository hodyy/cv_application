package cz.project.cv_aplication.api;

import cz.project.cv_aplication.entity.User;
import cz.project.cv_aplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRepository UserRepository;

    @PostMapping("/test")
    public void  addUser(@RequestBody User newUser) {

        UserRepository.save(newUser);
    }
}
