package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del jugador 1 :");
        String jugador1 = scanner.next();
        System.out.println("Ingrese el nombre del jugador 2 :");
        String jugador2 = scanner.next();

        System.out.println("El ganador es: " + jugar(jugador1, jugador2) +", fin del juego!!!");
    }

    public static String jugar(String jugador1, String jugador2) {

        Scanner scanner = new Scanner(System.in);
        String ganador = "";
        boolean hayGanador = false;
        int turno=1;

        while (!hayGanador) {
            System.out.println("===Turno"+turno+"====");
            System.out.println("["+ jugador1.toUpperCase() +"] > ingresar número jugada (1=piedra, 2=papel, 3=tijera) :");
            int jugada = scanner.nextInt();
            System.out.println("["+ jugador2.toUpperCase() +"] > ingresar número jugada (1=piedra, 2=papel, 3=tijera) :");
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
