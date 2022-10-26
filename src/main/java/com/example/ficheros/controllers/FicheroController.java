package com.example.ficheros.controllers;

import com.example.ficheros.models.dto.FicheroDTO;
import com.example.ficheros.services.FicheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FicheroController {
    @Autowired
    FicheroService ficheroService;

    @GetMapping("/fichero")
    FicheroDTO all(){
        return ficheroService.getFichero();
    }
}
