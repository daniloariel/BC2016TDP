package obstaculos;



import javax.swing.ImageIcon;

import visitor.Visitor;
import mapa.*;

public class Aguila extends Obstaculo{
	
		
	public Aguila(Celda c,int x, int y){
		super(c,x,y);
			
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/sources/aguila.png")));
	}
	
	public boolean aceptar (Visitor vis){
		return vis.visitarAguila(this);
	}
	
	public void activar(){
		
		this.getCelda().getMapa().getGUI().getJuego().gameOver();
		
	}
	
}
