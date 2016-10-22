package disparo;

import javax.swing.ImageIcon;

import juego.*;
import mapa.Celda;
import visitor.*;
import tanques.*;

public abstract class Disparo extends ObjetoMovil {
	
	protected Thread t;
	
	protected ObjetoMovil tanque;
	
	public Disparo(int velocidad, ObjetoMovil t,Celda c){
		super(velocidad,c.getX(),c.getY());
		
		
		
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/imagenes/bala.png")));

		imagenes[0]= grafico.getIcon();
		imagenes[1]= grafico.getIcon();
		imagenes[2]= grafico.getIcon();
		imagenes[3]= grafico.getIcon();
		
		pos=3;
		
		celda=c;
		
		celda.setObjeto(this,pos);
		
		tanque=t;
		
		direccion = t.getDireccion();
		
		run = true;
	}
	
	
	public int getPos(){
		return pos;
	}
	
}