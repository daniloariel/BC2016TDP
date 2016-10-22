package disparo;

import visitor.Visitor;
import juego.*;
import mapa.Celda;

public class DisparoEnemigo extends Disparo {
	
	public DisparoEnemigo(int velocidad, ObjetoMovil t,Celda c){
		super(velocidad,t,c);
	}
	
	public boolean aceptar(Visitor vis){
		return vis.visitarDisparoEnemigo(this);
	}
	
	
	

}
