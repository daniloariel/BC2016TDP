package obstaculos;

import javax.swing.ImageIcon;

import visitor.Visitor;

public class Acero extends Obstaculo {
	
	public Acero(int x, int y){
		super(x,y);
		//grafico.setIcon(new ImageIcon(this.getClass().getResource("/imagenes/acero.png")));
	}
	
	public boolean aceptar(Visitor vis){
		
		return vis.visitarAcero(this);
		
	}
}
