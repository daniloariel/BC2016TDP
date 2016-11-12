package disparo;

import juego.GUI;
import juego.ObjetoMovil;
import mapa.Celda;
import visitor.*;


public class DisparoEnemigo extends Disparo {

	public DisparoEnemigo(Celda c , int x , int y, ObjetoMovil tanque,GUI gui,int direccion,int vd, boolean ds){
		
		super(c,x,y,tanque,gui,vd,ds);
		
		this.visitor = new VisitorDisparoEnemigo(this);
		
		new MoverDisparo(this);
		
		isRun = true;
		
		this.direccion = direccion;
	}
	
	public boolean aceptar(Visitor vis){
		return vis.visitarDisparoEnemigo(this);
	}
	
}
