package tanques;

import javax.swing.ImageIcon;

import mapa.Celda;

public class EnemigoBasico extends Enemigo {
	
	public EnemigoBasico(Celda c, int x, int y, int p){
		super(c,x,y,p);
		resistencia = 1;
		puntos = 100;
		velocidad = 1;

		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/sources/up2.png"));
		this.imagenes[1] = new ImageIcon(this.getClass().getResource("/sources/down2.png"));
		this.imagenes[2] = new ImageIcon(this.getClass().getResource("/sources/left2.png"));
		this.imagenes[3] = new ImageIcon(this.getClass().getResource("/sources/right2.png"));
		
		grafico.setIcon(imagenes[0]);
		grafico.setVisible(true);
		
		m = new MoverEnemigo(this,700);
	}	

}
