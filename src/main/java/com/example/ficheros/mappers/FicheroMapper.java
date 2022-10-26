package com.example.ficheros.mappers;

import com.example.ficheros.models.projections.FicheroProjection;
import com.example.ficheros.models.responses.FicheroResponse;

public class FicheroMapper {
    public static FicheroResponse getFicheroResponse(FicheroProjection ficheroProjection) {
        return FicheroResponse
                .builder()
                .idFichero(ficheroProjection.getIdFichero())
                .fechaImportacion(ficheroProjection.getFechaImportacion())
                .nombre(ficheroProjection.getNombre())
                .cantlect(ficheroProjection.getCantLect())
                .periodoFactura(ficheroProjection.getPeriodoFactura())
                .build();
    }
}
