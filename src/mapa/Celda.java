package mapa;

import juego.*;
import tanques.*;
import obstaculos.*;
import powerup.*;
import disparo.*;

public class Celda {
	
	protected Mapa mapa;
	
	protected GameObject [] objetos;
	
	protected int x,y;
	
	public Celda(int x, int y, Mapa map){
		
		objetos = new GameObject[4];
		for(int i=0; i<4;i++)
			objetos[i]=null;
		
		mapa=map;
		this.x=x;
		this.y=y;
	}
	
	public GameObject getObjeto(int pos){
		return objetos[pos];
	}
	
	public void setObjeto(GameObject obj, int pos){
		objetos[pos]=obj;
	}
	
	public Celda getCelda(int x, int y){
		return mapa.getCelda(x,y);
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	
}
