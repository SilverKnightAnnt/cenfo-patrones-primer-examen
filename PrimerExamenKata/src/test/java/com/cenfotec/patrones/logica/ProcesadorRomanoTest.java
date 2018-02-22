package com.cenfotec.patrones.logica;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProcesadorRomanoTest {

	@Test
	public void procesarBasico() {
		ProcesadorRomano miProce = new ProcesadorRomano();
		assertEquals(0, miProce.Convierte(""));
	}
	
	@Test 
	public void procesarString() {
		ProcesadorRomano miProce = new ProcesadorRomano();
		assertEquals(1, miProce.Convierte("I"));
		assertEquals(2, miProce.Convierte("II"));
		assertEquals(3, miProce.Convierte("III"));
		assertEquals("Error", miProce.Convierte("IIII"));
	}
	
}
