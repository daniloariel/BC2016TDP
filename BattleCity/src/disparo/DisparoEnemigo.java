package disparo;

import juego.GUI;
import juego.ObjetoMovil;
import mapa.Celda;
import visitor.*;


public class DisparoEnemigo extends Disparo {

	public DisparoEnemigo(Celda c , int x , int y, ObjetoMovil tanque,GUI gui,int direccion){
		
		super(c,x,y,tanque,gui);
		
		this.visitor = new VisitorDisparoEnemigo(this);
		
		MoverDisparo m = new MoverDisparo(this);
		
		isRun = true;
		
		this.direccion = direccion;
	}
	
	public boolean aceptar(Visitor vis){
		return vis.visitarDisparoEnemigo(this);
	}
	
}
