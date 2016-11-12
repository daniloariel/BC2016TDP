package powerups;

import java.util.LinkedList;

import javax.swing.ImageIcon;
import tanques.*;

import mapa.*;
import visitor.*;


public class Timer extends PowerUp {
	
	public Timer(Celda c, int x, int y, Mapa map) {
		super(c, x, y, map);
		this.grafico.setIcon(new ImageIcon(this.getClass().getResource("/sources/pwtimer.png")));
	}
	
	
	@Override
	public void activar(Jugador jug) {
		// TODO Auto-generated method stub
		LinkedList<Enemigo> enemigos = mapa.getEnemigos();
		
		for(Enemigo e : enemigos){
			//creo un thread y le paso el enemigo
			Thread t = new Thread(new ActivarTimer(e));
			t.start();
			e.stop();
		}
		
		
	}

	@Override
	public boolean aceptar(Visitor vis) {
		// TODO Auto-generated method stub
		return vis.visitarPowerUp(this);
	}

}
