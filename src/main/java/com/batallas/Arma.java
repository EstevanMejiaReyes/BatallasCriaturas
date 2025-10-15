package com.batallas;

/**
 * Clase que representa un arma por composición.
 */
public class Arma {
    private final String nombre;
    private final int danoAdicional;

    public Arma(String nombre, int danoAdicional) {
        this.nombre = nombre;
        this.danoAdicional = danoAdicional;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDanoAdicional() {
        return danoAdicional;
    }

    /**
     * Representa un ataque con el arma (puede retornar el daño).
     */
    public int atacarConArma() {
        // Lógica simple: daño extra fijo. Se puede extender.
        return danoAdicional;
    }

    @Override
    public String toString() {
        return nombre + " (+" + danoAdicional + " daño)";
    }
}
