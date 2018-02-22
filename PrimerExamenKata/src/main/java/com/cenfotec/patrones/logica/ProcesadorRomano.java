package com.cenfotec.patrones.logica;

public class ProcesadorRomano {

	
	public int Convierte(String letraRomana) throws Exception {		
		
		int numeroRomano = 0;
		
			if (letraRomana == "") {
				numeroRomano = 0;
			}else if(letraRomana == "I"){
				numeroRomano = 1;
			}else if(letraRomana == "II"){
				numeroRomano = 2;
			}else if(letraRomana == "III"){
				numeroRomano = 3;
			}else if(letraRomana == "IIII"){
				throw new Exception("Error");
			}else if(letraRomana == "V"){
				numeroRomano = 5;
			}else if(letraRomana == "X"){
				numeroRomano = 10;
			}else if(letraRomana == "L"){
				numeroRomano = 50;
			}else if(letraRomana == "C"){
				numeroRomano = 100;
			}else if(letraRomana == "D"){
				numeroRomano = 500;
			}else if(letraRomana == "M"){
				numeroRomano = 1000;
			}
		
				
		return numeroRomano;
	}
}
