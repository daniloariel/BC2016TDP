package tanques;
import juego.*;
import javax.swing.*;
import mapa.*;
import visitor.*;

public class Jugador extends Tanque{
	
	private Nivel nivel;
	private Juego juego;
	
	public Jugador(Celda c, int x , int y,Juego j){
		super(c,x,y);
		
		juego = j;
		
		pos=0;
		
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/sources/up.png"));
		this.imagenes[1] = new ImageIcon(this.getClass().getResource("/sources/down.png"));
		this.imagenes[2] = new ImageIcon(this.getClass().getResource("/sources/left.png"));
		this.imagenes[3] = new ImageIcon(this.getClass().getResource("/sources/right.png"));
		
		grafico.setIcon(imagenes[0]);
		
		nivel = new Nivel1();
		
		resistencia = nivel.getResistencia();
		velocidad = nivel.getVelocidad();
		
		
		visitor = new VisitorJugador(this);
	}
	
	public void subirNivel(){
		nivel = nivel.subirNivel();
	}
	
	public boolean aceptar(Visitor vis){
		return vis.visitarJugador(this);
	}
	
	public Juego getJuego(){
		return juego;
	}

}
