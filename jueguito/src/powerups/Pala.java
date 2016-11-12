package powerups;

import javax.swing.ImageIcon;
import tanques.*;


import mapa.*;

import visitor.Visitor;

public class Pala extends PowerUp{
	
	public Pala(Celda c, int x, int y, Mapa map) {
		super(c, x, y, map);
		this.grafico.setIcon(new ImageIcon(this.getClass().getResource("/sources/pwpala.png")));
	}

	@Override
	public void activar(Jugador jug) {
		
		Thread t = new Thread (new ActivarPala(mapa));
		t.start();
	}

	@Override
	public boolean aceptar(Visitor vis) {
		// TODO Auto-generated method stub
		return vis.visitarPowerUp(this);
	}
	
}
