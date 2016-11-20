package visitor;

import disparo.*;
import powerups.*;
import obstaculos.*;
import tanques.*;
import juego.*;

public class VisitorEnemigo extends Visitor{
	
	public VisitorEnemigo(ObjetoMovil obj){
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
		
		Enemigo e = (Enemigo) objeto;
		
		d.getJugador().getJuego().sumarPuntos(e.recibirDisparo());
		
		if(!e.estaVivo())
			d.getJugador().getJuego().incEnemigosMuertos();
		
		d.destruir();
		
		
		
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
		return true;
	}
	
	public boolean visitarPowerUp(PowerUp p){
		return true;
	}

}
