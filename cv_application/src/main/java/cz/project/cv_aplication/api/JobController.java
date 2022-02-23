//package cz.project.cv_aplication.api;
//
//import cz.project.cv_aplication.entity.User;
//import cz.project.cv_aplication.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class PreviousJobController {
//    @Autowired
//    UserRepository UserRepository;
//
//    @PostMapping("/AddNewUser")
//    public void  AddNewUser(@RequestBody User newUser) {
//               UserRepository.save(newUser);
//    }
//    @GetMapping("/GetAllUsers")
//    public List<User> GetAllUsers(){
//        return UserRepository.findAll();
//    }
//
//    @GetMapping("/GetAllUsers")
//    public List<User> GetAllUsers(){
//        return UserRepository.findAll();
//    }
//}
