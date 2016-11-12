package powerups;

import mapa.*;
import juego.*;
import tanques.*;

public abstract class PowerUp extends GameObject {
		
	public PowerUp(Celda c, int x, int y, Mapa map){
		super(c,x,y,map);	
		pos = 1;		
	}
	
	public abstract void activar(Jugador jug);
	
	public int getPos(){
		return pos;
	}
	

}
