package visitor;
import obstaculos.*;
import disparo.*;
import juego.*;
import tanques.*;
import powerup.*;

public abstract class Visitor {
		
		protected GameObject objeto;
		
		public Visitor(GameObject g){
			objeto=g;
		}
		
		public abstract boolean visitarLadrillo(Ladrillo l);
		
		public abstract boolean visitarLadrilloPared(LadrilloPared lp);
		
		public abstract boolean visitarAguila (Aguila aguila);
		
		public abstract boolean visitarArbol(Arbol arbol);
		
		public abstract boolean visitarEnemigo(Enemigo enemigo);
		
		public abstract boolean visitarJugador(Jugador jug);
		
		public abstract boolean visitarAgua(Agua a);
		
		public abstract boolean visitarAcero(Acero a);
		
		public abstract boolean visitarPowerUp(PowerUp p);
		
		public abstract boolean visitarDisparoJugador(DisparoJugador d);
		
		public abstract boolean visitarDisparoEnemigo(DisparoEnemigo d);
		
	}



