package com.example.ficheros.models.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuperBuilder
public class FicheroResponse {
    private int idFichero;
    private Date fechaImportacion;
    private String nombre;
    private int cantlect;
    private int periodoFactura;
}
