package it.ariadne.shapes;

import java.util.ArrayList;
import java.util.List;

public class Canvas {

	List<Forma> forme = new ArrayList<>();
		
	public void add(Forma f) {
		forme.add(f);
	}


	public int size() {
		int numeroTotaleForme = 0;
		numeroTotaleForme += forme.size();
		return numeroTotaleForme;
	}

	public double calcolaPerimetro() {
		double perimetroTotale = 0d;
		
		for (Forma forma : forme) {
			perimetroTotale += forma.calcolaPerimetro();
		}
		
		return perimetroTotale;
	}

	
}
