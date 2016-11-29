package factoryenemigo;
import tanques.*;
import mapa.*;
public class FabricaEnemigoRapido implements FabricaEnemigo {
	
	public Enemigo crearEnemigo(Celda c , int x, int y){
		return new EnemigoRapido(c,x,y,200);
	}

}
