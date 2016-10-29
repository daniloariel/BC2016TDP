package powerups;

import mapa.*;
import juego.*;


public abstract class PowerUp extends GameObject {
	
	public PowerUp(Celda c, int x, int y, Mapa m){
		super(c,x,y,m);	
		
	}
	
	public abstract void activar();
	
	

}
