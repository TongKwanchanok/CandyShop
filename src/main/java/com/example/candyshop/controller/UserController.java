package com.example.candyshop.controller;
import com.example.candyshop.Service.UserService;
import com.example.candyshop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    UserService userService;

    //CREATE
    @PostMapping("/user")
    public User createUser( @RequestBody User user) {
        return userService.createUser(user);
    }

    //READ ALL
    @GetMapping("/data")
    public List<User> getAllUser(@RequestBody User user) {
        return userService.getAllUser();
    }

    //READ ONLY ONE ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getId(@PathVariable String id) {
        Optional<User> user = userService.getId(id);
        if(!user.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }

    //UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@PathVariable String id, @Valid @RequestBody User body) {
        Optional<User> user = (Optional<User>) userService.updateUser(id,body);
        if(!user.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }


    //DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable String id) {
        if(!userService.deleteUser(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }

}


