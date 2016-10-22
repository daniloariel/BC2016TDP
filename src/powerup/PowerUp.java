package powerup;

import juego.*;

public abstract class PowerUp extends GameObject {
	
	public PowerUp(int x, int y){
		super(x,y);
		pos=1;
	}
	
	
	public abstract void activar();

	public int getPos(){
		return pos;
	}
}
