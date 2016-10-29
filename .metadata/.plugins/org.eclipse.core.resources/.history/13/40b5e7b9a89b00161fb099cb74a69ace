package obstaculos;

import javax.swing.ImageIcon;

import visitor.Visitor;

public class Arbol extends Obstaculo {

	public Arbol(int x, int y){
		super(x,y);
		
		//grafico.setIcon(new ImageIcon(this.getClass().getResource("/imagenes/arbol.png")));
	}
	
	public boolean aceptar (Visitor vis){
		return vis.visitarArbol(this);
	}
	
}
