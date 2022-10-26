package com.example.ficheros.services;

import com.example.ficheros.models.dto.FicheroDTO;
import org.springframework.stereotype.Component;

@Component
public interface FicheroService {
    FicheroDTO getFichero();
}
