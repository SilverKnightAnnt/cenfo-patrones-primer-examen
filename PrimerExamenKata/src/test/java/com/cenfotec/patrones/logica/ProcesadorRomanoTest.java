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
		assertEquals(5, miProce.Convierte("V"));
		assertEquals(10, miProce.Convierte("X"));
		assertEquals(50, miProce.Convierte("L"));
		assertEquals(100, miProce.Convierte("C"));
		assertEquals(500, miProce.Convierte("D"));
		assertEquals(1000, miProce.Convierte("M"));
	}
	
}
