package tanques;

import mapa.*;
import juego.*;

public abstract class Tanque extends ObjetoMovil{
	
	protected int resistencia;
	protected int velocidad;
	protected int contador;
	
	protected Tanque(Celda c, int x, int y){
		super(c,x,y);
		pos=0;
		contador=0;
		
	}
	
	public int getPos(){
		return pos;
	}
	
	public int getVelodicad(){
		return velocidad;
	}
	
	public int getResistencia(){
		return resistencia;
	}
	
//	public void destruir(){
//		contador++;
//		if(contador == resistencia){
//			super.destruir();
//		}
//	}
	
	

}
