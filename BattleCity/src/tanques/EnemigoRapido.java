package tanques;
import javax.swing.ImageIcon;

import mapa.*;
public class EnemigoRapido extends Enemigo{
	
	public EnemigoRapido(Celda c, int x, int y,int p){
		super(c,x,y,p);
		resistencia = 1;
		puntos = 200;
		velocidad = 3;
		
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/sources/rapidoarriba.png"));
		this.imagenes[1] = new ImageIcon(this.getClass().getResource("/sources/rapidoabajo.png"));
		this.imagenes[2] = new ImageIcon(this.getClass().getResource("/sources/rapidoizquierda.png"));
		this.imagenes[3] = new ImageIcon(this.getClass().getResource("/sources/rapidoderecha.png"));
		
		grafico.setIcon(imagenes[0]);
		
		grafico.setVisible(true);
		
		m = new MoverEnemigo(this,300);
	}

}
