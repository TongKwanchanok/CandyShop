package com.example.candyshop.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Generated;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Document(collection = "user")
public class User {

    @Id
    @NotNull
    private ObjectId id;
    private String name;
    private String password;

    @JsonFormat(pattern="dd-mm-yyyy")
    private Date birthday;
    private int age;
    private String gender;
    private String country;
    private String address;



//    public void setId(ObjectId id) {
//        this.id = id;
//    }
}
