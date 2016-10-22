package powerup;

import javax.swing.ImageIcon;

import visitor.Visitor;

public class Granada extends PowerUp{
	
	public Granada(int x, int y){
		super(x,y);
		//grafico.setIcon(new ImageIcon(this.getClass().getResource("/imagenes/granada.png")));
	}
	
	public boolean aceptar(Visitor vis){
		return vis.visitarPowerUp(this);
	}
	
	public void activar(){}

}
