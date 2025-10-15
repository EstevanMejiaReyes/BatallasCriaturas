package com.batallas;

import java.util.ArrayList;
import java.util.List;

/**
 * Mago: usa magia y hechizos.
 */
public class Mago extends Criatura implements Magico {

    private final List<String> hechizos = new ArrayList<>();
    private Arma arma; // puede equipar arma opcionalmente

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    public void equiparArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public void aprenderHechizo(String hechizo) {
        hechizos.add(hechizo);
        System.out.printf("%s aprende el hechizo '%s'.%n", nombre, hechizo);
    }

    @Override
    public void lanzarHechizo(Criatura objetivo) {
        if (hechizos.isEmpty()) {
            System.out.printf("%s intenta lanzar un hechizo pero no conoce ninguno.%n", nombre);
            return;
        }
        // Para simplicidad: toma el primer hechizo y su efecto como fuerza + 5
        String hechizo = hechizos.get(0);
        int dano = this.fuerza + 5 + ((arma != null) ? arma.getDanoAdicional() : 0);
        System.out.printf("%s lanza '%s' a %s causando %d de daño.%n", nombre, hechizo, objetivo.getNombre(), dano);
        objetivo.defender(dano);
    }

    @Override
    public void atacar(Criatura objetivo) {
        // El mago prefiere lanzar hechizos; si no hay hechizos, ataca con fuerza.
        if (!hechizos.isEmpty()) {
            lanzarHechizo(objetivo);
        } else {
            int extra = (arma != null) ? arma.atacarConArma() : 0;
            int total = this.fuerza + extra;
            System.out.printf("%s (Mago) ataca físicamente a %s con %d (+%d arma) -> total %d%n",
                    nombre, objetivo.getNombre(), fuerza, extra, total);
            objetivo.defender(total);
        }
    }

    @Override
    public void defender(int damage) {
        // Podríamos añadir resistencias mágicas; por ahora resta directo
        this.salud -= damage;
        System.out.printf("%s recibe %d de daño. Salud ahora: %d%n", nombre, damage, salud);
    }
}
