package it.ariadne.test.shapes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import it.ariadne.shapes.Canvas;
import it.ariadne.shapes.Cerchio;
import it.ariadne.shapes.Punto;
import it.ariadne.shapes.Quadrato;

public class TestCanvas {

	private Canvas canvas;
	private Quadrato q;
	private Cerchio c;

	@Before
	public void setup() {
		canvas = new Canvas();
		Punto p = new Punto(12, 31);
		int lato = 2;
		int raggio = 2;
		q = new Quadrato(p, lato);
		c = new Cerchio(p, raggio);
		canvas.add(q);
		canvas.add(c);
	}
	
	
	@Test
	public void dimensioneCanvas() {
		int canvasSize = canvas.size();
		Assert.assertEquals("Il canvas contiene due forme", 2, canvasSize);		
	}
	
	@Test
	public void controlloAreePerimetri() {
		double perimetroQuadrato = q.calcolaPerimetro();
		double perimetroCerchio = c.calcolaPerimetro();
		
		double perimetroTotale = canvas.calcolaPerimetro();
		
		Assert.assertEquals("Il canvas contiene due forme", 20, perimetroTotale, 0);	
		
	}
	
	@Test
	public void bastard() {
		
		Quadrato q = new Quadrato(null, -3);
		Assert.assertEquals("Il perimetro è 12", 12, q.calcolaPerimetro(), 0);
		
		
	}
	

}
