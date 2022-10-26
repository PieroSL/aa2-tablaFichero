package com.example.ficheros.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "fichero", schema = "public")
@Data
public class Fichero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfichero", nullable = false)
    private long idFichero;
    @Column(name = "fecha_importacion", nullable = false, length = 255)
    private Date fechaImportacion;
    @Column(name = "nombre", nullable = false, length = 255)
    private String nombre;
    @Column(name = "cant_lect", nullable = false, length = 255)
    private int cantLect;
    @Column(name = "pfactura", nullable = false, length = 255)
    private int periodoFactura;
    @Column(name = "estado", nullable = false, length = 255)
    private int estado;
    @Column(name = "empresa", nullable = false, length = 255)
    private int empresa;
    @Column(name = "usuario_id", nullable = false, length = 255)
    private int usuarioId;
    @Column(name = "idsuministro",nullable = false, length = 255)
    private int idSuministro;
}
