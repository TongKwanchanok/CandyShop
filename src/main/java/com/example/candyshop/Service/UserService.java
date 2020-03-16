package com.example.candyshop.Service;

import com.example.candyshop.Repository.UserRepository;
import com.example.candyshop.model.Lollipop;
import com.example.candyshop.model.User;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService  {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUser() {
        return (List<User>) userRepository.findAll();
    }



    public Optional<User> getId(String id) {
        return userRepository.findById(id);
    }

//    public List<User> getName(String name) {
//        return userRepository.findByFirstName(name);
//    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public boolean deleteUser(String id) {
        try {
            userRepository.deleteById(id);
            return true;
        } catch (EmptyResultDataAccessException e) {
            return false;
        }
    }

}
