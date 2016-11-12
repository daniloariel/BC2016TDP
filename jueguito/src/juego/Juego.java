package juego;

import tanques.*;
import java.awt.event.*;
import javax.swing.JLabel;
import mapa.*;

public class Juego implements Runnable{
	
	private Thread t;
	
	private Jugador jugador;
	
	private Mapa mapa;
	
	private GUI gui;
	
	private int puntos;
	
	private boolean perdi;
	
	public Juego (){
		
		perdi = false;
		
		puntos=0;
		
		gui = new GUI(this);
		
		mapa = new Mapa(gui);
		
		for(int i = 0; i<mapa.nroFilas();i++)
			for(int j = 0; j<mapa.nroColumnas(); j++){
				if(mapa.getObjeto(i, j, 1)!=null){
					JLabel grafico = mapa.getObjeto(i, j, 1).getGrafico();
					gui.add(grafico);
				}
			}
		
	
		
		
		agregarJugador();	
		
		t = new Thread(this);
		t.start();
		
		gui.repaint();
		gui.setVisible(true);
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
		jugador = new Jugador(mapa.getCelda(4, 17),4,17,this);
		gui.add(jugador.getGrafico());
	}		
	
	public void sumarPuntos(int puntos){
		this.puntos+=puntos;
		gui.sumarPuntos(puntos);
	}
	
	public int getPuntos(){
		return puntos;
	}
	
	public Mapa getMapa(){
		return mapa;
	}
	
	public GUI getGUI(){
		return gui;
	}
	
	public Jugador getJugador(){
		return jugador;
	}
	
	public void modificarVida(boolean perdi){
		gui.modificarVidas(perdi);
	}
	
	
	public static void main ( String args[] ){
		 new Juego();
	}
	
	public void reiniciarJugador(){
		
		int vidas = jugador.getVidas();
		
		jugador.destruir();
		
		agregarJugador();
		
		jugador.setVidas(vidas);
		
		gui.repaint();
		
	}
	
	public void gameOver(){
		
		perdi = true;
		jugador=null;
		t.interrupt();
		gui.gameOver();
		
		
	}
	
	public void reset(){
		
				perdi = false;
				
				puntos=0;
				
				gui = null;
				
				gui = new GUI(this);
				
				mapa = null;
				
				mapa = new Mapa(gui);
				
				for(int i = 0; i<mapa.nroFilas();i++)
					for(int j = 0; j<mapa.nroColumnas(); j++){
						if(mapa.getObjeto(i, j, 1)!=null){
							JLabel grafico = mapa.getObjeto(i, j, 1).getGrafico();
							gui.add(grafico);
						}
					}
				
				
				agregarJugador();
				
				t=new Thread(this);
				t.start();
				
				gui.setVisible(true);
	}
	
	public void run(){

		int cont =0;
		
		while(!perdi){		
			
			
			
			if(jugador.getVidas()==0){
				gameOver();
			}
			System.out.println(""+mapa.getEnemigos().size());
			
			
			if(mapa.getEnemigos().size()<4){	
				cont++;
				
				if(cont == 4){
					mapa.agregarPowerUp();
					cont=0;
				}
				
				try{
					Thread.sleep(5000);
					}catch(InterruptedException e){e.printStackTrace();}
				mapa.agregarEnemigo();
			}
				
			
			
			
		}
		
	}
	
	
	

}
