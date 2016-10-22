package mapa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import obstaculos.*;
import juego.*;

public class Mapa {
	protected Celda[][]M;
	
	public Mapa(){
		try{
			File archivo = new File(this.getClass().getResource("/imagenes/mapa.txt").getFile());
			FileReader fr= new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			
			
			M = new Celda[20][20];
			
			String cadena;
			
			
			for(int i = 0 ; i<M.length; i++){
				cadena = br.readLine();
				for(int j=0; j< M[0].length ;j++){
					if(cadena.charAt(j)=='l'){
						M[i][j]= new Celda(i,j,this);
						GameObject ladrillo = new Ladrillo(i,j);
						M[i][j].setObjeto(ladrillo,ladrillo.getPos());
					}
					if(cadena.charAt(j)=='v'){
						M[i][j] = new Celda(i,j,this);
					}
					
					if(cadena.charAt(j)=='a'){
						
						M[i][j]= new Celda(i,j,this);
						GameObject aguila = new Aguila(i,j);
						M[i][j].setObjeto(aguila,aguila.getPos());
						
					}
					
					if(cadena.charAt(j)=='p'){
						M[i][j]=new Celda(i,j,this);
						GameObject lp= new LadrilloPared(i,j);
						M[i][j].setObjeto(lp,lp.getPos());
					}
					
					if(cadena.charAt(j)=='w'){
						M[i][j]=new Celda(i,j,this);
						GameObject agua = new Agua(i,j);
						M[i][j].setObjeto(agua,agua.getPos());
					}
				}
			}
			
			br.close();
		}catch(IOException e){e.printStackTrace();}
	}
	
	
	public Celda[][] getMapa(){
		return M;
	}
	
	public void eliminarTanque(int i, int j){
		M[i][j].setObjeto(null,0);
	}
	
	public void agregarTanque(int i, int j, GameObject obj){
		//el cliente tiene que pasar un tanque.
		M[i][j].setObjeto(obj,obj.getPos());
	}
	
	
	public Celda getCelda(int i , int j){
		return M[i][j];
	}
	
}
