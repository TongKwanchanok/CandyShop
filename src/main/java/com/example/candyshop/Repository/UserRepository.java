package com.example.candyshop.Repository;
import com.example.candyshop.model.Lollipop;
import com.example.candyshop.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

}
