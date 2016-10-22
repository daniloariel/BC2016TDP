package powerup;

import visitor.Visitor;

public class Timer extends PowerUp{
	
	public Timer(int x, int y){
		super(x,y);
		//grafico.setIcon(new ImageIcon(this.getClass().getResource("/imagenes/Timer.png")));
	}
	
	public boolean aceptar(Visitor vis){
		return vis.visitarPowerUp(this);
	}
	
	public void activar(){}

}
