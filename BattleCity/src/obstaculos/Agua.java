package obstaculos;

import javax.swing.ImageIcon;
import mapa.*;

import visitor.Visitor;

public class Agua extends Obstaculo {
	
	public Agua(Celda c,int x, int y){
		super(c,x,y);
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/sources/agua.png")));
	}

	public boolean aceptar (Visitor vis){
		return vis.visitarAgua(this);
	}
}
