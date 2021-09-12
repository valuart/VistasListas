package com.example.vistaslistas.Modelo;

import android.widget.TextView;

public class Inmueble {
    private String direccion;
    private Double precio;
    private int foto;

    public Inmueble(String direccion, Double precio, int foto) {
        this.direccion = direccion;
        this.precio = precio;
        this.foto = foto;
    }

    public String getDireccion() {
        return direccion;
    }

    public Double getPrecio() {
        return precio;
    }

    public int getFoto() {
        return foto;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
