package com.example.candyshop.Service;
import com.example.candyshop.Repository.LollipopRespository;
import com.example.candyshop.model.Lollipop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LollipopService {

   @Autowired
    LollipopRespository lollipopRespository;

    public List<Lollipop> getAllData(){
        return lollipopRespository.findAll();
    }
}




