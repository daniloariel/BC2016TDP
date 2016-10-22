package disparo;

import visitor.*;
import juego.*;
import mapa.Celda;

public class DisparoJugador extends Disparo{
	
	protected ObjetoMovil jugador;
	
	public DisparoJugador(int velocidad, ObjetoMovil t,Celda c){
		
		super(velocidad,t,c);
		
		
		
		
		this.visitor = new VisitorDisparoJugador(this);
		
		c.getGUI().add(this.getGrafico());
		
		MoverDisparo m = new MoverDisparo(this);
	}
	
	
	public boolean aceptar(Visitor vis){
		return vis.visitarDisparoJugador(this);
	}
	
	
	

}
