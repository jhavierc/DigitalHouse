package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre jugador 1 :");
        String jugador1 = scanner.next();
        System.out.println("Ingrese su nombre jugador 2 :");
        String jugador2 = scanner.next();

        System.out.println("El ganador es: " + jugar(jugador1, jugador2));
    }

    public static String jugar(String jugador1, String jugador2) {

        Scanner scanner = new Scanner(System.in);
        String ganador = "";
        boolean hayGanador = false;
        //piedra = 1; papel = 2; tijera = 3;
        int turno=1;

        while (!hayGanador) {
            System.out.println("===Turno"+turno+"====");
            System.out.println("Ingresar jugada (piedra = 1; papel = 2; tijera = 3) " + jugador1);
            int jugada = scanner.nextInt();
            System.out.println("Ingresar jugada (piedra = 1; papel = 2; tijera = 3) " + jugador2);
            int jugada2 = scanner.nextInt();

            if (jugada != jugada2) {
                if (jugada == 1 && jugada2 == 2) {
                    ganador = jugador2;

                } else if (jugada == 2 && jugada2 == 1) {
                    ganador = jugador1;

                } else if (jugada == 3 && jugada2 == 1) {
                    ganador = jugador2;

                } else if (jugada == 1 && jugada2 == 3) {
                    ganador = jugador1;

                } else if (jugada == 2 && jugada2 == 3) {
                    ganador = jugador2;

                } else {
                    ganador = jugador1;
                }
                hayGanador = true;

            }
            turno++;

        }
        return ganador.toUpperCase(Locale.ROOT);

    }
}
