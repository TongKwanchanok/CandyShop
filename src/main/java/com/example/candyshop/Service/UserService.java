package com.example.candyshop.Service;

import com.example.candyshop.Repository.UserRepository;
import com.example.candyshop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService  {

    @Autowired
    UserRepository userRepository;

    //CREATE
    public User createUser(User user) {
        return userRepository.save(user);
    }

    //READ ALL
    public List<User> getAllUser() {
        return (List<User>) userRepository.findAll();
    }

    //READ ONLY ONE ID
    public Optional<User> getId(String id) {
        return userRepository.findById(id);
    }

    //UPDATE
    public Object updateUser(String id, User user) {
        Optional<User> userOptional = userRepository.findById(id);
        if(!userOptional.isPresent()) {
            return userOptional;
        }
        return userRepository.save(user);
    }


    //DELETE
    public boolean deleteUser(String id) {
        try {
            userRepository.deleteById(id);
            return true;
        } catch (EmptyResultDataAccessException e) {
            return false;
        }
    }

}



