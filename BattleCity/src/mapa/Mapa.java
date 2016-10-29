package mapa;



import java.io.*;
import java.io.IOException;
import obstaculos.*;

import juego.*;

public class Mapa {
	
	private Celda[][] M;
	
	private GUI gui;
	
	public Mapa(GUI gui){
		M = new Celda[21][21];
		
		this.gui= gui;
		
		try{
			File archivo = new File(this.getClass().getResource("/sources/mapa.txt").getFile());
			FileReader fr= new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			
			String cadena;
		
		for(int i=0; i<21; i++){
			cadena=br.readLine();
			for(int j=0; j<21; j++){
				if(cadena.charAt(j)=='v')
					M[i][j]=new Celda(i,j,this);
				if(cadena.charAt(j)=='l'){
					Celda nueva = new Celda(i,j,this);
					nueva.setObjeto(new Ladrillo(nueva,i,j), 1);
					M[i][j]=nueva;
				}
				if(cadena.charAt(j)=='p'){
					Celda nueva = new Celda(i,j,this);
					nueva.setObjeto(new LadrilloPared(nueva,i,j), 1);
					M[i][j]=nueva;
				}
				if(cadena.charAt(j)=='a'){
					Celda nueva = new Celda(i,j,this);
					nueva.setObjeto(new Agua(nueva,i,j), 1);
					M[i][j]=nueva;
				}
				if (cadena.charAt(j)=='h'){
					Celda nueva = new Celda (i,j,this);
					nueva.setObjeto(new Acero(nueva,i,j), 1);
					M[i][j]=nueva;
				}
			}
		}
		br.close();
		}catch(IOException e){e.printStackTrace();}
	
	}
	
	public void setObjeto(GameObject obj, int x, int y,int pos){
		M[x][y].setObjeto(obj, pos);
	}
	
	public GameObject getObjeto(int x, int y ,int pos){
		return M[x][y].getObjeto(pos);
	}
	
	public Celda getCelda(int x, int y){
		return M[x][y];
	}
	
	
	public int nroFilas(){
		return M.length;
	}
	
	public int nroColumnas(){
		return M[0].length;
	}
	
	public GUI getGUI(){
		return gui;
	}	

}