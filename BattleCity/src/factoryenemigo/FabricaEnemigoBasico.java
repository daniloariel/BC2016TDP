package factoryenemigo;

import tanques.*;
import mapa.*;
public class FabricaEnemigoBasico implements FabricaEnemigo{
	
	public FabricaEnemigoBasico(){
		
	}

	public Enemigo crearEnemigo(Celda c, int x, int y){
		return new EnemigoBasico(c,x,y,100);
	}
	
}
