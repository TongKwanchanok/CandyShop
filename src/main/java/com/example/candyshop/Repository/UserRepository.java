package com.example.candyshop.Repository;
import com.example.candyshop.model.Lollipop;
import com.example.candyshop.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {

}
