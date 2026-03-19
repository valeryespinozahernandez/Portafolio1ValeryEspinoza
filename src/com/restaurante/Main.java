package com.restaurante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Restaurante restaurante = new Restaurante("CenfoFood");

        // Mesas iniciales
        restaurante.agregarMesa(new Mesa(1, 4));
        restaurante.agregarMesa(new Mesa(2, 2));

        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE RESERVAS ===");
            System.out.println("1. Crear cliente y reserva");
            System.out.println("2. Ver reservas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.print("Nombre del cliente: ");
                    String nombre = sc.nextLine();

                    System.out.print("Teléfono: ");
                    String telefono = sc.nextLine();

                    Cliente cliente = new Cliente(nombre, telefono);

                    System.out.print("Fecha (ej: 20/03/2026): ");
                    String fecha = sc.nextLine();

                    System.out.print("Número de mesa: ");
                    int numMesa = sc.nextInt();
                    sc.nextLine();

                    Mesa mesaSeleccionada = null;
                    for (Mesa m : restaurante.getMesas()) {
                        if (m.getNumero() == numMesa) {
                            mesaSeleccionada = m;
                            break;
                        }
                    }

                    if (mesaSeleccionada != null) {
                        Reserva reserva = new Reserva(fecha, cliente, mesaSeleccionada);
                        restaurante.crearReserva(reserva);
                        System.out.println("✅ Reserva creada con éxito");
                    } else {
                        System.out.println("❌ Mesa no encontrada");
                    }
                    break;

                case 2:
                    restaurante.mostrarReservas();
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("❌ Opción inválida");
            }

        } while (opcion != 3);

        sc.close();
    }
}