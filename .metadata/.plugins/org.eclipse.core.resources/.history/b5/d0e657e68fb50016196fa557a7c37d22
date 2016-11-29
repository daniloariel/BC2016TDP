package powerups;

import java.util.LinkedList;

import javax.swing.ImageIcon;

import tanques.*;

import mapa.*;

import visitor.Visitor;

public class Granada extends PowerUp{
	
	public Granada (Celda c, int x, int y, Mapa map){
		super(c, x, y, map);
		this.grafico.setIcon(new ImageIcon(this.getClass().getResource("/sources/pwgranada.png")));
	}

	public void activar(Jugador jug) {
		// TODO Auto-generated method stub
		 LinkedList<Enemigo> eliminar= new LinkedList<Enemigo>();
		 
		 int puntosTotales = 0;
		 
		 for(Enemigo e: mapa.getEnemigos()){
			 eliminar.add(e);
		 }
		for(Enemigo e : eliminar){
			puntosTotales += e.getPuntos();
			e.destruir();
			mapa.getEnemigos().remove(e);
			
			}
		jug.getJuego().sumarPuntos(puntosTotales);
	}

	@Override
	public boolean aceptar(Visitor vis) {
		// TODO Auto-generated method stub
		return vis.visitarPowerUp(this);
	}

}
