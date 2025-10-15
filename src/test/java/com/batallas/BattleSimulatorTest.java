package com.batallas;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class BattleSimulatorTest {

    @Test
    public void testDragonAtacaGuerrero() {
        Dragon d = new Dragon("TestDraco", 20, 5);
        Guerrero g = new Guerrero("TestG", 20, 4);
        d.atacar(g);
        // Dragon ataca con fuerza*2 = 10, sin arma -> g.salud debe reducirse
        assertTrue(g.getSalud() < 20, "El guerrero debió recibir daño");
    }

    @Test
    public void testMagoLanzaHechizo() {
        Mago m = new Mago("MagoTest", 15, 3);
        Guerrero g = new Guerrero("GTest", 15, 3);
        m.aprenderHechizo("Rayo");
        m.lanzarHechizo(g);
        assertTrue(g.getSalud() < 15, "El guerrero debió recibir daño por hechizo");
    }

    @Test
    public void testSimularBatallaDevuelveGanadorNoNulo() {
        Dragon d = new Dragon("D1", 10, 3);
        Mago m = new Mago("M1", 10, 2);
        Criatura ganador = BattleSimulator.simularBatalla(d, m);
        assertNotNull(ganador);
        assertTrue(ganador.estaViva(), "El ganador debe estar vivo");
    }
}
