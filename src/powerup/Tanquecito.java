package powerup;

import visitor.Visitor;

public class Tanquecito extends PowerUp{
	
	public Tanquecito(int x, int y){
		super(x,y);
		//grafico.setIcon(new ImageIcon(this.getClass().getResource("/imagenes/tanquecito.png")));
	}
	
	public boolean aceptar(Visitor vis){
		return vis.visitarPowerUp(this);
	}
	
	public void activar(){}
}
