package mapa;

import juego.*;

public class Celda {
	
	private GameObject []objetos;
	private int x;
	private int y;
	
	private Mapa mapa;

	
	public Celda(int x, int y, Mapa map){
		objetos= new GameObject[4];
		for(int i=0; i<4;i++)
			objetos[i]=null;
		
		mapa=map;
		
		this.x=x;
		this.y=y;
		
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public GameObject getObjeto(int pos){
		return objetos[pos];
	}
	
	public void setObjeto(GameObject obj, int pos){
		objetos[pos]=obj;
	}
	
	public Mapa getMapa(){
		return mapa;
	}
}
