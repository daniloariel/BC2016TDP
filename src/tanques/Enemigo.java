package tanques;

import java.util.Random;

import javax.swing.*;
import mapa.*;
import visitor.*;

public class Enemigo extends Tanque {
	
	protected int puntos;
	
	public Enemigo(Celda c, int x, int y, int p){
		super(c,x,y);
		
		puntos = p;
		
		pos=0;
		
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/sources/up2.png"));
		this.imagenes[1] = new ImageIcon(this.getClass().getResource("/sources/down2.png"));
		this.imagenes[2] = new ImageIcon(this.getClass().getResource("/sources/left2.png"));
		this.imagenes[3] = new ImageIcon(this.getClass().getResource("/sources/right2.png"));
		
		grafico.setIcon(imagenes[0]);
		
		
		visitor = new VisitorEnemigo(this);
		
		MoverEnemigo m = new MoverEnemigo(this,800);
		
	}
	
	public boolean aceptar(Visitor vis){
		return vis.visitarEnemigo(this);
	}
	
	public int getPuntos(){
		return puntos;
	}
	
}