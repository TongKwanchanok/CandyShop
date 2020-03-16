package com.example.candyshop.controller;
import com.example.candyshop.Service.UserService;
import com.example.candyshop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/data")
    public List<User> getAllUser(@RequestBody User user) {
        return userService.getAllUser();
    }

//    @GetMapping(params = "name")
//    public List<User> getUser(@RequestParam(value = "name") String name) {
//        return userService.getName(name);
//    }

    @PostMapping("/user")
    public User createUser( @RequestBody User user) {
        return userService.createUser(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable String id) {
        if(!userService.deleteUser(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }

    







}
