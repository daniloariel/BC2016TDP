package juego;

import tanques.*;

import java.awt.event.*;

import javax.swing.JLabel;

import mapa.*;

public class Juego {
	
	private Jugador jugador;
	private Enemigo[] enemigos;
	private Mapa mapa;
	private GUI gui;
	
	private int puntos;
	
	public Juego (GUI gui){
		
		this.gui = gui;
		
		puntos=0;
		
		mapa = new Mapa(this.gui);
		
		for(int i = 0; i<mapa.nroFilas();i++)
			for(int j = 0; j<mapa.nroColumnas(); j++){
				if(mapa.getObjeto(i, j, 1)!=null){
					JLabel grafico = mapa.getObjeto(i, j, 1).getGrafico();
					gui.add(grafico);
				}
			}
		
		enemigos = new Enemigo[4];
		for(int i=0; i<4; i++)
			enemigos[i]=null;
		
		
		agregarJugador();
		agregarEnemigos();
		
		
	}
	
	public void mover(int dir){
		
		if(jugador.getIsRun()){
			int direccion;
			switch (dir){
				case KeyEvent.VK_UP : //Arriba
					direccion = 0;
					jugador.moverLogico(direccion);
					break;
				case KeyEvent.VK_LEFT : //Izquierda
					direccion = 2;
					jugador.moverLogico(direccion);
					break;
				case KeyEvent.VK_DOWN : //Abajo
					direccion = 1;
					jugador.moverLogico(direccion);
					break;	
				case KeyEvent.VK_RIGHT : //Derecha
					direccion = 3;
					jugador.moverLogico(direccion);
					break;
				
				case KeyEvent.VK_SPACE : //disparo
					jugador.disparar();
					break;
			}
		}else{
			System.out.println("estoy muerto");
		}
		
		
	}
	
	public void agregarJugador(){
		jugador = new Jugador(mapa.getCelda(2, 16),2,16,this);
		gui.add(jugador.getGrafico());
	}
	
	public void agregarEnemigos(){
		enemigos[0]= new Enemigo(mapa.getCelda(1, 1),1,1,100);
		gui.add(enemigos[0].getGrafico());
		
		enemigos[1] = new Enemigo(mapa.getCelda(19, 1),19,1,100);
		gui.add(enemigos[1].getGrafico());
		
		enemigos[2] = new Enemigo (mapa.getCelda(19, 2),19,2,100);
		gui.add(enemigos[2].getGrafico());
		
		enemigos[3] = new Enemigo(mapa.getCelda(1, 2),1,2,100);
		gui.add(enemigos[3].getGrafico());
	}
	
	
	public void sumarPuntos(int puntos){
		this.puntos+=puntos;
	}
	
	public int getPuntos(){
		return puntos;
	}
	
	
	

}