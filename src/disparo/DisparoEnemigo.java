package disparo;

import visitor.Visitor;

public class DisparoEnemigo extends Disparo {
	
	public DisparoEnemigo(int velocidad, int x, int y){
		super(velocidad,x,y);
	}
	
	public boolean aceptar(Visitor vis){
		return vis.visitarDisparoEnemigo(this);
	}
	
	public void disparar(int direccion){}
	
	

}
