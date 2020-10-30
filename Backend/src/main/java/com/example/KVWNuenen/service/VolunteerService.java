package com.example.KVWNuenen.service;

import com.example.KVWNuenen.DAO.ParentDAO;
import com.example.KVWNuenen.DAO.VolunteerDAO;
import com.example.KVWNuenen.model.Parents;
import com.example.KVWNuenen.model.Volunteers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VolunteerService {
    @Autowired
    private VolunteerDAO volunteerDAO;

    public void storeVolunteer(Volunteers volunteers ) {
        volunteerDAO.save(volunteers);
    }

    public List<Volunteers> getVolunteer(){
        List<Volunteers> volunteers = new ArrayList<>();
        volunteerDAO.findAll().forEach(volunteers::add);
        return  volunteers;
    }

    public  Optional<Volunteers> getVolunteer(String id){
        return volunteerDAO.findById(id);
    }
}
