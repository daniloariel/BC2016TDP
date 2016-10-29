package disparo;

import mapa.*;
import tanques.*;
import juego.*;
import visitor.*;

public class DisparoJugador extends Disparo {
	
	ObjetoMovil tanque;
	
	public DisparoJugador(Celda c , int x , int y, ObjetoMovil tanque,GUI gui,int direccion){
		
		super(c,x,y,tanque,gui);
		
		this.tanque=tanque;
		
		this.visitor = new VisitorDisparoJugador(this);
		
		MoverDisparo m = new MoverDisparo(this);
		
		isRun = true;
		
		this.direccion = direccion;
	}
	
	public boolean aceptar(Visitor vis){
		return vis.visitarDisparoJugador(this);
	}
	
	public Jugador getJugador(){
		return (Jugador) tanque;
	}
	
	


}
