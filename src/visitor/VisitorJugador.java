package visitor;
import disparo.*;
import juego.*;
import obstaculos.*;
import tanques.*;
import powerup.*;

public class VisitorJugador extends Visitor {
	
	public VisitorJugador(GameObject go){
		super(go);
	}

	@Override
	public boolean visitarLadrillo(Ladrillo l) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visitarLadrilloPared(LadrilloPared lp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visitarAguila(Aguila aguila) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visitarArbol(Arbol arbol) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean visitarEnemigo(Enemigo enemigo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visitarJugador(Jugador jug) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean visitarAgua(Agua a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visitarAcero(Acero a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visitarPowerUp(PowerUp p) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean visitarDisparoJugador (DisparoJugador d){
		return true;
	}
	
	public boolean visitarDisparoEnemigo(DisparoEnemigo d){
		return false;
	}

}
