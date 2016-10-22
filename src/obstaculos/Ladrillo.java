package obstaculos;


import javax.swing.ImageIcon;

import visitor.Visitor;


public class Ladrillo extends Obstaculo {
	

	
	public Ladrillo(int x, int y){
		super(x,y);
		
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/imagenes/ladrillo.png")));
	}
	
	public boolean aceptar(Visitor vis){
		return vis.visitarLadrillo(this);
	}
}
