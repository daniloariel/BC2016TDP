package tanques;
import javax.swing.ImageIcon;

import mapa.*;
public class EnemigoDePoder extends Enemigo{
	
	public EnemigoDePoder(Celda c, int x, int y,int p){
		
		super(c,x,y,p);
		
		
		velocidad = 2;
		puntos = 300;
		resistencia = 1;
		
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/sources/depoderarriba.png"));
		this.imagenes[1] = new ImageIcon(this.getClass().getResource("/sources/depoderabajo.png"));
		this.imagenes[2] = new ImageIcon(this.getClass().getResource("/sources/depoderizquierda.png"));
		this.imagenes[3] = new ImageIcon(this.getClass().getResource("/sources/depoderderecha.png"));
		grafico.setIcon(imagenes[0]);
		grafico.setVisible(true);
		
		m = new MoverEnemigo(this,700);
		
	}

}
