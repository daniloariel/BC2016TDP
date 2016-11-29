package juego;

import javax.swing.*;
import mapa.*;

public abstract class ObjetoMovil extends GameObject {//implements Runnable {
	
	protected Thread t;
	
	
	
	protected Icon [] imagenes;
	protected int direccion;
	protected boolean moviendo = false;
	
	protected GUI gui;
	
	protected boolean isRun;
	
	protected int x;
	protected int y;
	
	protected int velocidad;
	
	protected ObjetoMovil(Celda c, int x, int y){
		super(c,x,y,c.getMapa());
		
		gui = c.getMapa().getGUI();
		
		c.setObjeto(this, pos);
		
		imagenes = new Icon[4];
		
		direccion=0;
		
		isRun=true;
		
	}
	
	public int getDireccion(){
		return direccion;
	}
	
	public void moverLogico(int direccion){
		
		this.direccion=direccion;
		
		Celda aux; 
		 x = celda.getX();
		 y = celda.getY();
		 
		boolean atravesable=true;
		
	    int i=0;
		
		switch(direccion){
		
		case 0 : //arriba
			
			if(!moviendo){
				aux=mapa.getCelda(x, y-1);
				
				while(atravesable && i<4){
					if(aux.getObjeto(i)!=null)
						atravesable = false;
					else{
						atravesable=true; 
						i++;
					}
				}
				
				
				
				if(!atravesable){ //no es piso
					if(aux.getObjeto(i).aceptar(visitor)){
						aux.setObjeto(this,pos);
						celda.setObjeto(null,pos);
						celda=aux;
						moverGrafico();
						
					}
				}else{ //es piso
					aux.setObjeto(this,pos);
					celda.setObjeto(null,pos);
					celda=aux;
					moverGrafico();
				}
			}
			break;
		case 1: //abajo
			if(!moviendo){
				aux= mapa.getCelda(x, y+1);
				
				while(atravesable && i<4){
					if(aux.getObjeto(i)!=null)
						atravesable = false;
					else{
						atravesable=true; 
						i++;
					}
				}
				
				if(!atravesable){
					if(aux.getObjeto(i).aceptar(visitor)){
						aux.setObjeto(this,pos);
						celda.setObjeto(null,pos);
						celda=aux;
						moverGrafico();
					}
				}else{
					aux.setObjeto(this,pos);
					celda.setObjeto(null,pos);
					celda=aux;
					moverGrafico(); 
				}
			}
			break;
		case 2: //izquierda
			if(!moviendo){
				aux= mapa.getCelda(x-1,y);
				
				while(atravesable && i<4){
					if(aux.getObjeto(i)!=null)
						atravesable = false;
					else{
						atravesable=true; 
						i++;
					}
				}
				
				if(!atravesable){
					if(aux.getObjeto(i).aceptar(visitor)){
						aux.setObjeto(this,pos);
						celda.setObjeto(null,pos);
						celda=aux;
						moverGrafico();
					}
				}else{
					aux.setObjeto(this,pos);
					celda.setObjeto(null,pos);
					celda=aux;
					moverGrafico();
				}
			}
			break;
			
		case 3: //derecha
			if(!moviendo){
				aux=mapa.getCelda(x+1, y);
				
				while(atravesable && i<4){
					if(aux.getObjeto(i)!=null)
						atravesable = false;
					else{
						atravesable=true; 
						i++;
					}
				}
				
				if(!atravesable){
					if(aux.getObjeto(i).aceptar(visitor)){
						
						aux.setObjeto(this,pos);
						celda.setObjeto(null,pos);
						celda=aux;
						moverGrafico();
					}
				}else{
					
					aux.setObjeto(this,pos);
					celda.setObjeto(null,pos);
					celda=aux;
					moverGrafico();
				}
				
				
			}
			break;
		
		}
	

	}
	

	
	
	public void moverGrafico(){
		moviendo=true;
			switch(direccion){
			case 0: //arriba 
				grafico.setIcon(imagenes[0]);
				
				grafico.setBounds(grafico.getX(),grafico.getY()-32,32,32);
				break;
			case 1: //abajo
				grafico.setIcon(imagenes[1]);
				
				grafico.setBounds(grafico.getX(),grafico.getY()+32,32,32);
				break;
			
			case 2://izquierda
				grafico.setIcon(imagenes[2]);
				grafico.setBounds(grafico.getX()-32,grafico.getY(),32,32);
				break;
			case 3://derecha
				grafico.setIcon(imagenes[3]);
				grafico.setBounds(grafico.getX()+32,grafico.getY(),32,32);
				break;
			}
		moviendo=false;	
	}
	
	public boolean getIsRun(){
		return isRun;
	}
	
	public void setIsRun(boolean b){
		isRun=b;
	}
	
	public void destruir(){
		grafico.setIcon(null);
	    celda.setObjeto(null, this.pos);
	    isRun=false;
	}
	
	public abstract int recibirDisparo();
	
	

}
