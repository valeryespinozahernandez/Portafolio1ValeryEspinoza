package com.restaurante;

public class Cliente {
    private String nombre;
    private String telefono;

    // Constructor
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Método getter
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}