package com.example.candyshop.Repository;

import com.example.candyshop.model.Lollipop;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LollipopRespository extends MongoRepository<Lollipop, String> {



}