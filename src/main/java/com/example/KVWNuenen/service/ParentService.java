package com.example.KVWNuenen.service;

import com.example.KVWNuenen.DAO.ParentDAO;
import com.example.KVWNuenen.model.Parents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ParentService {
    @Autowired
    private ParentDAO parentDAO;

    public void storeParent(Parents parents) {
        //Need to set {address & city by making an API call}

        parentDAO.save(parents);
    }

    public List<Parents> getParent(){
       List<Parents> parents = new ArrayList<>();
       parentDAO.findAll().forEach(parents::add);
       return  parents;
    }

    public  Optional<Parents> getParent(String id){
        return parentDAO.findById(id);
    }
}
