package powerups;

import javax.swing.ImageIcon;


import mapa.*;
import visitor.Visitor;
import tanques.*;
public class Tank extends PowerUp{

	public Tank(Celda c, int x, int y,Mapa map) {
		super(c, x, y, map);
		this.grafico.setIcon(new ImageIcon(this.getClass().getResource("/sources/pwtanque.png")));
	}

	@Override
	public void activar(Jugador jug) {
		// TODO Auto-generated method stub
		jug.ganarVida();
	}

	@Override
	public boolean aceptar(Visitor vis) {
		// TODO Auto-generated method stub
		return vis.visitarPowerUp(this);
	}
	
	
	
	

}
