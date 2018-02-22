package com.cenfotec.patrones.logica;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProcesadorRomanoTest {

	@Test
	public void procesarBasico() {
		ProcesadorRomano miProce = new ProcesadorRomano();
		assertEquals(0, miProce.Convierte(""));
	}
}
