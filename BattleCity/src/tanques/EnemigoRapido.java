package tanques;
import mapa.*;
public class EnemigoRapido extends Enemigo{
	
	public EnemigoRapido(Celda c, int x, int y,int p){
		super(c,x,y,p);
		resistencia = 1;
		puntos = 200;
		velocidad = 3;
	}

}
