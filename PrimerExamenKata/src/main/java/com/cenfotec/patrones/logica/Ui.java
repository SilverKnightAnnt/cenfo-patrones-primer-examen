package com.cenfotec.patrones.logica;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Ui {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = new PrintStream(System.out);
	static ProcesadorRomano proces = new ProcesadorRomano();
	
	public static void main(String[] args) throws Exception {
		
		int opcion = -1;		
		do {
			
		out.println("Ingrese la letra para el conteo (Ejemplo: L): ");
		String letra = in.readLine();
		proces.Convierte(letra);
		out.println("¿Desea agregar otra letra?");
		out.println();
		out.println("1. Sí");
		out.println("2. No");
		opcion = Integer.parseInt(in.readLine());
		out.println(total(proces.Convierte(letra)));
		} while (opcion != 2);
		
	}
	
	public static int total(int value) {
		int total = 0;
		total = total + value;
		return total;
	}
	

}
