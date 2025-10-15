package com.batallas;

/**
 * Clase abstracta base para todas las criaturas.
 */
public abstract class Criatura {
    protected String nombre;
    protected int salud;
    protected int fuerza;

    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getFuerza() {
        return fuerza;
    }

    /**
     * Realiza un ataque sobre otra criatura.
     * Implementación específica en cada subclase.
     */
    public abstract void atacar(Criatura objetivo);

    /**
     * Recibe daño. Cada clase puede extender lógica (armas, resistencias, etc).
     * @param damage cantidad de daño recibido
     */
    public abstract void defender(int damage);

    /**
     * Indica si la criatura sigue viva.
     * @return true si salud > 0
     */
    public boolean estaViva() {
        return this.salud > 0;
    }

    @Override
    public String toString() {
        return nombre + " [salud=" + salud + ", fuerza=" + fuerza + "]";
    }
}
