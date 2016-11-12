package factoryenemigo;
import tanques.*;
import mapa.*;
public class FabricaEnemigoDePoder implements FabricaEnemigo{
	
	public Enemigo crearEnemigo(Celda c, int x, int y){
		return new EnemigoDePoder(c,x,y,300);
	}
	

}
