package com.example.KVWNuenen.controller;

import com.example.KVWNuenen.model.Volunteers;
import com.example.KVWNuenen.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/volunteer")
public class VolunteerController {
    private final VolunteerService volunteerService;

    @Autowired
    public VolunteerController(VolunteerService volunteerService) {
        this.volunteerService = volunteerService;
    }

    @PostMapping
    public void storeVolunteer(@RequestBody Volunteers volunteers){
        volunteerService.storeVolunteer(volunteers);
    }

    @GetMapping(path = "{id}")
    public Optional<Volunteers> getVolunteers(@PathVariable("id") String id){
        return volunteerService.getVolunteer(id);
    }

    @GetMapping
    public List<Volunteers> getAllVolunteers(){
        return volunteerService.getVolunteer();
    }
}

