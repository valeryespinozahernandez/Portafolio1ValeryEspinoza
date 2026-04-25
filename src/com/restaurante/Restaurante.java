package com.restaurante;

import java.util.ArrayList;

public class Restaurante {
    private String nombre;
    private ArrayList<Mesa> mesas;
    private ArrayList<Reserva> reservas;

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.mesas = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void agregarMesa(Mesa mesa) {
        mesas.add(mesa);
    }

    public void crearReserva(Reserva reserva) {
        reservas.add(reserva);
        reserva.confirmarReserva();
    }

    public void mostrarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
        } else {
            for (Reserva r : reservas) {
                r.mostrarReserva();
                System.out.println("----------------------");
            }
        }
    }

    public ArrayList<Mesa> getMesas() {
        return mesas;
    }
}