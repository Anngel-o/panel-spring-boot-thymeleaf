package com.example.plantilla.model;

public class PanelObject {
    private String nombre;
    private String contenido;

    public PanelObject(String nombre, String contenido) {
        this.nombre = nombre;
        this.contenido = contenido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContenido() {
        return contenido;
    }
}
