package obstaculos;

import javax.swing.ImageIcon;

import visitor.Visitor;

public class Agua extends Obstaculo {
	
	public Agua(int x, int y){
		super(x,y);
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/imagenes/agua.png")));
	}

	public boolean aceptar (Visitor vis){
		return vis.visitarAgua(this);
	}
}
