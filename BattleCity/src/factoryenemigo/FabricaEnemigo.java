package factoryenemigo;
import mapa.*;
import tanques.*;

public interface FabricaEnemigo {
	
	public Enemigo crearEnemigo(Celda c, int x, int y);

}
