package disparo;

import javax.swing.ImageIcon;

import juego.*;
import mapa.Celda;
import visitor.*;
import tanques.*;

public abstract class Disparo extends ObjetoMovil {
	
	protected Thread t;
	protected int direccion;
	
	public Disparo(int velocidad, int x, int y){
		super(velocidad,x,y);
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/imagenes/bala.png")));
		pos=3;
		run = true;
	}
	
	public abstract void disparar(int direccion);
	
	public int getPos(){
		return pos;
	}
	
}