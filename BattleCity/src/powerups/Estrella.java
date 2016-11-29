package powerups;

import javax.swing.ImageIcon;
import tanques.*;


import mapa.*;

import visitor.Visitor;

public class Estrella extends PowerUp {
	
	public Estrella(Celda c, int x, int y, Mapa map) {
		super(c, x, y, map);
		this.grafico.setIcon(new ImageIcon(this.getClass().getResource("/sources/pwestrella.png")));
	}

	@Override
	public void activar(Jugador jug) {
		// TODO Auto-generated method stub
		jug.subirNivel();
	}

	@Override
	public boolean aceptar(Visitor vis) {
		// TODO Auto-generated method stub
		return vis.visitarPowerUp(this);
	}

}
