//package cz.project.cv_aplication;
//
//import cz.project.cv_aplication.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//
//@RestController
//public class GreetingController {
//
//    @Autowired
//    UserRepository UserRepository;
//
//    @GetMapping("/test/add")
//    public ArrayList<Person> getAllWithAdd(){
//
//        return database.getAllWithAdd();
//
//    }
//
//    @GetMapping("/test")
//    public ArrayList<Person> getAll(){
//
//        return database.getAll();
//
//    }
//
//    @PostMapping("/test")
//    public void  addPersonReq(@RequestBody Person newPerson) {
//
//        database.addPerson(newPerson);
//    }
//
//}
