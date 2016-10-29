package obstaculos;

import mapa.*;

import javax.swing.ImageIcon;

import visitor.Visitor;

public class Acero extends Obstaculo {
	
	public Acero(Celda c, int x, int y){
		super(c,x,y);
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/sources/acero.png")));
	}
	
	public boolean aceptar(Visitor vis){
		
		return vis.visitarAcero(this);
		
	}
}
