package factoryenemigo;
import tanques.*;
import mapa.*;

public class FabricaEnemigoBlindado implements FabricaEnemigo{
	
	
	public Enemigo crearEnemigo(Celda c, int x, int y){
		return new EnemigoBlindado(c,x,y,400);
	}
	
}
