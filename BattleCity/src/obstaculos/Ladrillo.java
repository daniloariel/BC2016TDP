package obstaculos;
import javax.swing.ImageIcon;

import mapa.*;
import visitor.Visitor;

public class Ladrillo extends Obstaculo{
	
	public Ladrillo(Celda c, int x, int y){
		super(c,x,y);
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/sources/ladrillo.png")));
		
	}
	
	public boolean aceptar(Visitor vis){
		
		return vis.visitarLadrillo(this);
	}

}
