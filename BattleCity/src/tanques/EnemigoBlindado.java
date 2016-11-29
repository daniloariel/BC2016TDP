package tanques;
import javax.swing.ImageIcon;

import mapa.*;
public class EnemigoBlindado extends Enemigo {
	
	public EnemigoBlindado(Celda c, int x, int y, int p){
		super(c,x,y,p);
		
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/sources/blindadoarriba.png"));
		this.imagenes[1] = new ImageIcon(this.getClass().getResource("/sources/blindadoabajo.png"));
		this.imagenes[2] = new ImageIcon(this.getClass().getResource("/sources/blindadoizquierda.png"));
		this.imagenes[3] = new ImageIcon(this.getClass().getResource("/sources/blindadoderecha.png"));
		
		grafico.setIcon(imagenes[0]);
		
		grafico.setVisible(true);
		
		velocidad = 1;
		resistencia = 4;
		puntos = 400;
		
		m = new MoverEnemigo(this,900);
	}

}
