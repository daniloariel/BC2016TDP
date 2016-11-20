package tanques;

import mapa.*;
import visitor.*;

public abstract class Enemigo extends Tanque {
	
	protected int puntos;
	
	protected boolean vivo = true;
	
	protected MoverEnemigo m;
	
	protected Enemigo(Celda c, int x, int y, int p){
		super(c,x,y);
		
		puntos = p;
		
		pos=0;		
		
		visitor = new VisitorEnemigo(this);
		
		celda.setObjeto(this, 0);
		
	}
	
	public boolean aceptar(Visitor vis){
		return vis.visitarEnemigo(this);
	}
	
	public int getPuntos(){
		return puntos;
	}
	
	public void stop(){
		m.stop();
	}
	
	public void start(){
		m.start();
	}
	
	public int recibirDisparo(){
		
		if(getResistencia()==1){
			this.destruir();
			vivo = false;
			celda.getMapa().getEnemigos().remove(this);
			return puntos;
		}
		
		else
			decrementarResistencia();
		return 0;
		
	}
	
	public void decrementarResistencia(){
		resistencia--;
	}
	
	public boolean estaVivo(){
		return vivo;
	}
}

