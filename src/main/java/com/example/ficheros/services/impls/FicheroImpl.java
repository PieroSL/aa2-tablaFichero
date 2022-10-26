package com.example.ficheros.services.impls;

import com.example.ficheros.mappers.FicheroMapper;
import com.example.ficheros.models.dto.FicheroDTO;
import com.example.ficheros.models.projections.FicheroProjection;
import com.example.ficheros.repositories.FicheroRepository;
import com.example.ficheros.services.FicheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FicheroImpl implements FicheroService {
    @Autowired
    FicheroRepository ficheroRepository;


    @Override
    public FicheroDTO getFichero() {
        List<FicheroProjection> listarFichero = ficheroRepository.findByPeriodoFactura(2022);

        return FicheroDTO
                .builder()
                .ficheroResponses(
                        listarFichero
                                .parallelStream()
                                .map(FicheroMapper::getFicheroResponse)
                                .collect(Collectors.toList())
                )
                .build();
    }
}
