package obstaculos;

import javax.swing.ImageIcon;

import visitor.Visitor;


public class Aguila extends Obstaculo{
	
		
	public Aguila(int x, int y){
		super(x,y);
			
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/imagenes/aguila.png")));
	}
	
	public boolean aceptar (Visitor vis){
		return vis.visitarAguila(this);
	}
	
	
	
}
