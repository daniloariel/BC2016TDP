package disparo;

import visitor.Visitor;
import tanques.*;

public class DisparoJugador extends Disparo{
	
	protected Jugador jugador;
	
	public DisparoJugador(int velocidad,int x, int y,Jugador jug){
		super(velocidad,x,y);
		grafico.setLocation(x*32 +14, y*32 +14);
		jugador=jug;
	}
	
	
	public boolean aceptar(Visitor vis){
		return vis.visitarDisparoJugador(this);
	}
	
	
	public void disparar(int direccion){}

}
