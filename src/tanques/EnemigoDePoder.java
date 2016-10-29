package tanques;
import mapa.*;
public class EnemigoDePoder extends Enemigo{
	
	public EnemigoDePoder(Celda c, int x, int y,int p){
		super(c,x,y,p);
		velocidad = 2;
		puntos = 300;
		resistencia = 1;
	}

}
