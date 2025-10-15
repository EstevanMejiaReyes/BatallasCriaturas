package com.batallas;

/**
 * Guerrero: combate cuerpo a cuerpo, usa armas.
 */
public class Guerrero extends Criatura {
    private Arma arma;

    public Guerrero(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    public void equiparArma(Arma arma) {
        this.arma = arma;
        System.out.printf("%s equipa %s.%n", nombre, arma);
    }

    public void desequiparArma() {
        System.out.printf("%s desequipa %s.%n", nombre, (arma != null ? arma.getNombre() : "nada"));
        this.arma = null;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int base = this.fuerza;
        int extra = (arma != null) ? arma.atacarConArma() : 0;
        int total = base + extra;
        System.out.printf("%s (Guerrero) ataca a %s con fuerza %d y arma +%d -> total %d%n",
                nombre, objetivo.getNombre(), base, extra, total);
        objetivo.defender(total);
    }

    @Override
    public void defender(int damage) {
        // El guerrero puede reducir un poco el daño por armadura (ejemplo fijo)
        int mitigacion = 1; // simple
        int recibido = Math.max(0, damage - mitigacion);
        this.salud -= recibido;
        System.out.printf("%s bloquea %d de daño, recibe %d. Salud ahora: %d%n",
                nombre, mitigacion, recibido, salud);
    }
}
