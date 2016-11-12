package visitor;
import disparo.DisparoEnemigo;
import juego.*;

public class VisitorJugadorInvulnerable extends VisitorJugador{
	
	public VisitorJugadorInvulnerable (ObjetoMovil o){
		
		super(o);
	}
	
	public boolean visitarDisparoEnemigo(DisparoEnemigo d){
		d.destruir();
		return false;
	}

}
