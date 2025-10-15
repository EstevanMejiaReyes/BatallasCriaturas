package com.batallas;


public class Main {
    public static void main(String[] args) {
        // Crear armas
        Arma espada = new Arma("Espada Larga", 3);
        Arma baston = new Arma("Bastón Arcano", 2);
        Arma garra = new Arma("Garra de Dragón", 4);

        // Crear criaturas
        Dragon draco = new Dragon("Draco", 40, 6);
        Mago merlin = new Mago("Merlín", 30, 4);
        Guerrero aragorn = new Guerrero("Aragorn", 35, 5);

        // Equipar armas
        draco.equiparArma(garra);
        merlin.equiparArma(baston);
        aragorn.equiparArma(espada);

        // Aprender hechizos
        merlin.aprenderHechizo("Bola de Fuego");

        // Simulaciones
        BattleSimulator.simularBatalla(merlin, aragorn);
        BattleSimulator.simularBatalla(draco, aragorn);
        BattleSimulator.simularBatalla(draco, merlin);
    }
}
