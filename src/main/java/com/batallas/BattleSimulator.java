package com.batallas;

import java.util.Random;

/**
 * Simula batallas entre criaturas. Contiene lógica simple de turnos.
 */
public class BattleSimulator {

    private static final Random rnd = new Random();

    /**
     * Simula una batalla entre a y b. Devuelve la criatura ganadora.
     */
    public static Criatura simularBatalla(Criatura a, Criatura b) {
        System.out.printf("=== Inicia batalla: %s vs %s ===%n", a.getNombre(), b.getNombre());

        // Determinar aleatoriamente quién inicia
        boolean turnoA = rnd.nextBoolean();

        while (a.estaViva() && b.estaViva()) {
            if (turnoA) {
                System.out.printf("%nTurno de %s:%n", a.getNombre());
                a.atacar(b);
            } else {
                System.out.printf("%nTurno de %s:%n", b.getNombre());
                b.atacar(a);
            }

            // Mostrar estado
            System.out.printf("Estado: %s | %s%n", a, b);

            // Alternar turno
            turnoA = !turnoA;

            // Pausa corta simulada (sin sleep real para tests)
        }

        Criatura ganador = a.estaViva() ? a : b;
        System.out.printf("=== Fin batalla. Ganador: %s ===%n%n", ganador.getNombre());
        return ganador;
    }
}
