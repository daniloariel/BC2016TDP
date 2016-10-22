package powerup;

import visitor.Visitor;

public class Casco extends PowerUp {
	
	public Casco(int x, int y){
		super(x,y);
		//grafico.setIcon(new ImageIcon(this.getClass().getResource("/imagenes/casco.png")));
	}
	
	public boolean aceptar(Visitor vis){
		return vis.visitarPowerUp(this);
	}
	
	public void activar(){}

}
