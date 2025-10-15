package com.batallas;

/**
 * Dragón: fuerza doble en ataque, puede volar.
 */
public class Dragon extends Criatura implements Volador {

    private Arma arma; // opcional

    public Dragon(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    public void equiparArma(Arma arma) {
        this.arma = arma;
    }

    public void desequiparArma() {
        this.arma = null;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int base = this.fuerza * 2; // dragon tiene ataque más fuerte
        int extra = (arma != null) ? arma.atacarConArma() : 0;
        int total = base + extra;
        System.out.printf("%s (Dragón) ataca a %s con fuerza base %d y arma +%d -> total %d%n",
                nombre, objetivo.getNombre(), base, extra, total);
        objetivo.defender(total);
    }

    @Override
    public void defender(int damage) {
        // lógica simple: resta el daño directamente
        this.salud -= damage;
        System.out.printf("%s recibe %d de daño. Salud ahora: %d%n", nombre, damage, salud);
    }

    @Override
    public void volar() {
        System.out.printf("%s despega y domina el cielo.%n", nombre);
    }

    @Override
    public void aterrizar() {
        System.out.printf("%s aterriza con majestuosidad.%n", nombre);
    }
}
