package com.javatechie.jpa.controller;

import com.javatechie.jpa.entity.User;
import com.javatechie.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService Userservice;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return Userservice.saveUser(user);
    }
    @PostMapping("/login")
    @CrossOrigin(origins = "http://localhost:4200")
    public User loginUser(@RequestBody User user) {
       Long count= Userservice.login(user.getEmail(),user.getMdp())   ;
    if(count==1)
            return user;
                    else return null ;

    }

    @PostMapping("/addChef")
    public User addChef(@RequestBody User user) {
        return Userservice.saveUser(user);
    }

    @PostMapping("/addUsers")
    public List<User> addUsers(@RequestBody List<User> users) {
        return Userservice.saveUsers(users);
    }

    @GetMapping("/Users")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<User> findAllUsers() {
        return Userservice.getUsers();
    }

    @GetMapping("/UserById/{id}")
    public User findUserById(@PathVariable Long id) {
        return Userservice.getUserById(id);
    }

 @GetMapping("/User/{nom}")
    public User findUserByName(@PathVariable String nom) {
        return Userservice.getUserByName(nom);
    }


    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User User) {
        return Userservice.updateUser(User);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable Long id) {
        return Userservice.deleteUser(id);
    }
}
