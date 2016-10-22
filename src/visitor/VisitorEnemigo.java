package visitor;

import juego.*;

import disparo.DisparoEnemigo;
import disparo.DisparoJugador;
import obstaculos.Acero;
import obstaculos.Agua;
import obstaculos.Aguila;
import obstaculos.Arbol;
import obstaculos.Ladrillo;
import obstaculos.LadrilloPared;
import powerup.PowerUp;
import tanques.Enemigo;
import tanques.Jugador;

public class VisitorEnemigo extends Visitor{
	
	public VisitorEnemigo(GameObject go){
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
		return false;
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
		return true;
	}

	@Override
	public boolean visitarDisparoJugador(DisparoJugador d) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visitarDisparoEnemigo(DisparoEnemigo d) {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	

}
