package visitor;

import obstaculos.Acero;
import obstaculos.Agua;
import obstaculos.Aguila;
import obstaculos.Arbol;
import obstaculos.Ladrillo;
import obstaculos.LadrilloPared;
import disparo.*;
import tanques.Enemigo;
import tanques.Jugador;

import juego.*;

public class VisitorJugador extends Visitor{
	
	public VisitorJugador(ObjetoMovil obj){
		super(obj);
	}

	@Override
	public boolean visitarLadrillo(Ladrillo l) {
		// TODO Auto-generated method stub
		return false;
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
	public boolean visitarDisparoJugador(DisparoJugador d) {
		// TODO Auto-generated method stub
		return true;
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
	public boolean visitarAgua(Agua a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visitarAcero(Acero a) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean visitarDisparoEnemigo(DisparoEnemigo d){
		objeto.destruir();
		d.destruir();
		return false;
	}

}