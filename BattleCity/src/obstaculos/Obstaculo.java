package obstaculos;

import mapa.*;
import juego.*;

public abstract class Obstaculo extends GameObject {
	
	protected Obstaculo(Celda c, int x, int y){
		super(c,x,y,c.getMapa());
		pos=1;
	}
	
	public int getPos(){
		return pos;
	}

}
