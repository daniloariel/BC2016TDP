package juego;

import tanques.*;

import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JLabel;

import mapa.*;

import disparo.*;

public class Juego {
	
	protected  Jugador jugador;
	protected Mapa mapa;
	protected Enemigo [] enemigos;
	protected GUI gui;
	protected Enemigo e;
	
	public Juego(GUI gui){
		
		this.gui=gui;
		
		mapa = new Mapa();
		
		enemigos = new Enemigo[4];
		
		Celda[][] matriz = mapa.getMapa();
		
		for(int i=0; i<matriz.length;i++){
			for(int j=0; j<matriz[0].length;j++){
				if(matriz[i][j].getObjeto(1)!=null){
					JLabel grafico = matriz[i][j].getObjeto(1).getGrafico();
					gui.add(grafico);
				}
			}
			
		}
		
		
		agregarJugador();
		
		agregarEnemigo();
		
	}
	
	
	public void mover(int dir){
		
		int direccion = 0;
		switch (dir){
			case KeyEvent.VK_UP : //Arriba
				direccion = 0;
				break;
			case KeyEvent.VK_LEFT : //Izquierda
				direccion = 2;
				break;
			case KeyEvent.VK_DOWN : //Abajo
				direccion = 1;
				break;	
			case KeyEvent.VK_RIGHT : //Derecha
				direccion = 3;
				break;
				
			case KeyEvent.VK_SPACE : //disparo
				direccion = 4;
				Disparo disp=null;
				
				int a = jugador.getCelda().getX();
				int b = jugador.getCelda().getY();
				
				if(jugador.getDireccion()==0){
				  disp= new DisparoJugador(15,a, b-1,jugador);
				  disp.setCelda(mapa.getCelda(a,b-1));
				}
				if(jugador.getDireccion()==1){
					disp=new DisparoJugador(15,a, b+1,jugador);
					disp.setCelda(mapa.getCelda(a, b+1));
				}
				mapa.agregarTanque(disp.getCelda().getX(), disp.getCelda().getY(), jugador);
				gui.add(disp.getGrafico());
				break;
		}
		
		jugador.moverLogico(direccion);
	}
	
	public void agregarJugador(){
		jugador= new Jugador (15, 2,2);
		mapa.agregarTanque(2,2,jugador);
		jugador.setCelda(mapa.getCelda(2, 2));
		gui.add(jugador.getGrafico());
	}
	
	public void agregarEnemigo(){
		
		e = new Enemigo(5,1,1);
		mapa.agregarTanque(1, 1, e);
		e.setCelda(mapa.getCelda(1, 1));
		gui.add(e.getGrafico());
		
		
	}
	
	
}
