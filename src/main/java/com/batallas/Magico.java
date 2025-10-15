package com.batallas;

/**
 * Interfaz para criaturas con habilidades mágicas.
 */
public interface Magico {
    void aprenderHechizo(String hechizo);
    void lanzarHechizo(Criatura objetivo);
}
