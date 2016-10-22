package tanques;

import juego.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import visitor.Visitor;
import visitor.VisitorJugador;

public class Jugador extends ObjetoMovil {
	
	protected Nivel nivel;
	
	public Jugador (int velocidad, int  x, int y){
		super(velocidad,x,y);
		

		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/up.png"));
		this.imagenes[1] = new ImageIcon(this.getClass().getResource("/imagenes/down.png"));
		this.imagenes[2] = new ImageIcon(this.getClass().getResource("/imagenes/left.png"));
		this.imagenes[3] = new ImageIcon(this.getClass().getResource("/imagenes/right.png"));
		
		this.grafico = new JLabel();
		grafico.setBounds(x*32, y*32, 32, 32);
		grafico.setIcon(imagenes[0]);
		
		visitor = new VisitorJugador(this);
		
		pos = 0;
		
		
	}
	
	public boolean aceptar (Visitor vis){
		return vis.visitarJugador(this);
	}
	
	public void subirNivel(){
		nivel.subir();
	}
	
	public int getPos(){
		return pos;
	}
	
	public void destruir(){
		this.setCelda(null);
		this.getGrafico().setIcon(null);
		super.destruir();
	}
}
