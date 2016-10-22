package powerup;

import javax.swing.ImageIcon;

import visitor.Visitor;

public class Pala extends PowerUp {
	
	public Pala ( int x, int y){
		super(x,y);
		
		//grafico.setIcon(new ImageIcon(this.getClass().getResource("/imagenes/pala.png")));
		
	}
	
	public boolean aceptar(Visitor vis){
		return vis.visitarPowerUp(this);
	}
	
	public void activar(){
		
	}

}
