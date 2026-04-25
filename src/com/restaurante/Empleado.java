package com.restaurante;

public class Empleado extends Persona {

    public Empleado(String nombre, String telefono) {
        super(nombre, telefono);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Teléfono: " + telefono);
    }
}