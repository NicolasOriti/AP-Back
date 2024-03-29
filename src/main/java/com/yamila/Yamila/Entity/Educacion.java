package com.yamila.Yamila.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String descripcion;
    private boolean esActual;

    public Educacion() {
    }

    public Educacion(String nombre, String descripcion, boolean esActual) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.esActual = esActual;
    }

}
