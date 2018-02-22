package com.cenfotec.patrones.logica;

public class ProcesadorRomano {

	
	public int Convierte(String letraRomana) throws Exception {		
				
		
		int numeroRomano = 0;
		
		switch(letraRomana) {
		case "":
			numeroRomano = 0;
			break;
		case "I":
			numeroRomano = 1;
			break;
		case "II":
			numeroRomano = 2;
			break;
		case "III":
			numeroRomano = 3;
			break;		
		case "V":
			numeroRomano = 5;
			break;
		case "X":
			numeroRomano = 10;
			break;
		case "L":
			numeroRomano = 50;
			break;
		case "C":
			numeroRomano = 100;
			break;
		case "D":
			numeroRomano = 500;
			break;
		case "M":
			numeroRomano = 1000;
			break;
		default:
			throw new Exception("Error");
			
		}				
				
		return numeroRomano;
	}	
	
}
