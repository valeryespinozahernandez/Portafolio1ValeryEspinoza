package com.restaurante;

public class Reserva {
    private String fecha;
    private Cliente cliente;
    private Mesa mesa;

    // Constructor
    public Reserva(String fecha, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public void mostrarReserva() {
        System.out.println("Reserva confirmada:");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Fecha: " + fecha);
        System.out.println("Mesa #: " + mesa.getNumero());
    }
}