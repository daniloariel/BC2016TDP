package powerup;

import javax.swing.ImageIcon;

import visitor.Visitor;

public class Estrella extends PowerUp{
	
	public Estrella(int x, int y){
		
		super(x,y);
		
		//grafico.setIcon(new ImageIcon(this.getClass().getResource("/imagenes/estrella.png")));
	}
	
	public boolean aceptar(Visitor vis){
		return vis.visitarPowerUp(this);
	}
	
	public void activar(){}

}
