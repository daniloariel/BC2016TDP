package tanques;
import mapa.*;
public class EnemigoBlindado extends Enemigo {
	
	public EnemigoBlindado(Celda c, int x, int y, int p){
		super(c,x,y,p);
		
		velocidad = 1;
		resistencia = 4;
		puntos = 400;
	}

}
