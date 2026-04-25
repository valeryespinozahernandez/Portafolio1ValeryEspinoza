package com.restaurante;

public class Reserva implements Reservable {
    private String fecha;
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(String fecha, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    @Override
    public void confirmarReserva() {
        System.out.println("Reserva confirmada para " + cliente.getNombre());
    }

    public void mostrarReserva() {
        System.out.println("Reserva confirmada:");
        System.out.println("Fecha: " + fecha);
        System.out.println("Mesa #: " + mesa.getNumero());
        cliente.mostrarInformacion();
    }
}