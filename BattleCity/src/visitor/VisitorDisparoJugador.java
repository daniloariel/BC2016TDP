package visitor;

import juego.*;
import obstaculos.*;
import tanques.*;
import disparo.*;
import powerups.*;

public class VisitorDisparoJugador extends Visitor {

	public VisitorDisparoJugador(ObjetoMovil obj){
		super(obj);
	}

	@Override
	public boolean visitarLadrillo(Ladrillo l) {
		// TODO Auto-generated method stub
		l.destruir();
		this.objeto.destruir();		
		return false;
		
	}

	@Override
	public boolean visitarEnemigo(Enemigo enemigo) {
		// TODO Auto-generated method
		this.objeto.destruir();
		
		DisparoJugador d = (DisparoJugador) objeto;
		
		d.getJugador().getJuego().sumarPuntos(enemigo.recibirDisparo());
		
		if (!enemigo.estaVivo())
			d.getJugador().getJuego().incEnemigosMuertos();
		
		
		
		return false;
	}

	@Override
	public boolean visitarJugador(Jugador jug) {
		// TODO Auto-generated method stub
		
		return true;
	}

	@Override
	public boolean visitarDisparoJugador(DisparoJugador d) {
		// TODO Auto-generated method stub
		this.objeto.recibirDisparo();
		d.recibirDisparo();
		return false;
	}

	@Override
	public boolean visitarLadrilloPared(LadrilloPared lp) {
		this.objeto.destruir();
		return false;
	}

	@Override
	public boolean visitarAguila(Aguila aguila) {
		// TODO Auto-generated method stub
		//DisparoJugador d = (DisparoJugador)objeto;
		aguila.activar();
		this.objeto.destruir();
		aguila.destruir();
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
		return true;
	}

	@Override
	public boolean visitarAcero(Acero a) {
		// TODO Auto-generated method stub
		this.objeto.destruir();
		return false;
	}

	@Override
	public boolean visitarDisparoEnemigo(DisparoEnemigo d) {
		// TODO Auto-generated method stub
		objeto.recibirDisparo();
		d.recibirDisparo();
		return false;
	}
	
	public boolean visitarPowerUp(PowerUp p){
		return true;
	}
	
}
