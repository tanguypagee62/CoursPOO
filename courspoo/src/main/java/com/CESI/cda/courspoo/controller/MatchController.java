package com.CESI.cda.courspoo.controller;

import com.CESI.cda.courspoo.dao.person.model.PersonDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MatchController{

    @GetMapping("/exemple/{id}")
    public String exempleEndPoint(@PathVariable Long id) {
        return "loire atlantique";
    }

    /*@GetMapping("/quentin/{id}")
    public String deuxiemeExemple(@PathVariable Long id){
        PersonDTO person = new PersonDTO();
    }*/
}