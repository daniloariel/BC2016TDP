package obstaculos;



import juego.*;


public abstract class Obstaculo extends GameObject {
	
	
	public Obstaculo (int x, int y){
		super(x,y);
		pos=1;
	}
	
	public int getPos(){
		return pos;
	}
	

}
