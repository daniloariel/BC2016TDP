package obstaculos;

import javax.swing.ImageIcon;
import visitor.*;
import mapa.*;

public class LadrilloPared extends Ladrillo {

	
	public LadrilloPared(Celda c,int x, int y){
		super(c,x,y);
		grafico.setIcon(new ImageIcon(this.getClass().getResource("/sources/ladrillo.png")));
	}
	
	
	public boolean aceptar(Visitor vis){
		return vis.visitarLadrilloPared(this);
	}
}

