package obstaculos;

import javax.swing.ImageIcon;

import visitor.Visitor;
import mapa.*;
public class Arbol extends Obstaculo {

	public Arbol(Celda c,int x, int y){
		super(c,x,y);
		
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/sources/arbol.png")));
	}
	
	public boolean aceptar (Visitor vis){
		return vis.visitarArbol(this);
	}
	
}
