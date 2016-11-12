package powerups;

import javax.swing.ImageIcon;

import mapa.*;
import visitor.*;
import tanques.*;

public class Casco extends PowerUp{
	
	public Casco(Celda c, int x, int y,Mapa map) {
		super(c, x, y, map);
		this.grafico.setIcon(new ImageIcon(this.getClass().getResource("/sources/pwcasco.png")));
	}

	@Override
	public void activar(Jugador jugador) {
		
		jugador.setInvulnerable();
	}

	@Override
	public boolean aceptar(Visitor vis) {
		// TODO Auto-generated method stub
		return vis.visitarPowerUp(this);
	}

}
