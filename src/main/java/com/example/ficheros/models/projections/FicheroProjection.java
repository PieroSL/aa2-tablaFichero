package com.example.ficheros.models.projections;

import java.util.Date;

public interface FicheroProjection {
    int getIdFichero();
    Date getFechaImportacion();
    String getNombre();
    int getCantLect();
    int getPeriodoFactura();

}
