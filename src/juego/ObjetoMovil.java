package juego;

import javax.swing.Icon;
import javax.swing.JLabel;
import mapa.Celda;
import disparo.*;

public abstract class ObjetoMovil extends GameObject {
	
	
	protected Icon imagenes[];
	protected int velocidad;
	protected int direccion;
	
	private int x;
	private int y;
	
	protected  Thread t;
	
	public ObjetoMovil(int velocidad, int x, int y){
		super(x,y);
		
		this.imagenes = new Icon[4];
		
	}
	
	public JLabel getGrafico(){
		return grafico;
	}
	
	public int getDireccion(){
		return direccion;
	}
	
	
	public void run(){
		
		int x = this.x*32;
		int y= this.y*32;
		
		moviendo=true;
		for(int i=0;i<32;i++){
			switch(direccion){
			case 0: //arriba 
				grafico.setIcon(imagenes[0]);
				
				grafico.setBounds(x,y-1,32,32);
				break;
			case 1: //abajo
				grafico.setIcon(imagenes[1]);
				
				grafico.setBounds(x,y+1,32,32);
				break;
			
			case 2://izquierda
				grafico.setIcon(imagenes[2]);
				grafico.setBounds(x-1,y,32,32);
				break;
			case 3://derecha
				grafico.setIcon(imagenes[3]);
				grafico.setBounds(x+1,y,32,32);
				break;
			}
			try{
				Thread.sleep(13);
			}catch(InterruptedException e){ e.printStackTrace();}
		}
		moviendo=false;		
	}
	
	protected void moverGrafico(int dir){
		t=new Thread(this);
		t.start();
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
				aux=celda.getCelda(x, y-1);
				
				while(atravesable && i<4){
					if(aux.getObjeto(i)!=null)
						atravesable = false;
					else{
						atravesable=true; 
						i++;
					}
				}
				
				System.out.println(i+"");
				
				if(!atravesable){ //no es piso
					if(aux.getObjeto(i).aceptar(visitor)){
						aux.setObjeto(this,pos);
						celda.setObjeto(null,pos);
						celda=aux;
						moverGrafico(direccion);
						
					}
				}else{ //es piso
					aux.setObjeto(this,pos);
					celda.setObjeto(null,pos);
					celda=aux;
					moverGrafico(direccion);
				}
			}
			break;
		case 1: //abajo
			if(!moviendo){
				aux= celda.getCelda(x, y+1);
				
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
						moverGrafico(direccion);
					}
				}else{
					aux.setObjeto(this,pos);
					celda.setObjeto(null,pos);
					celda=aux;
					moverGrafico(direccion); 
				}
			}
			break;
		case 2: //izquierda
			if(!moviendo){
				aux= celda.getCelda(x-1,y);
				
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
						moverGrafico(direccion);
					}
				}else{
					aux.setObjeto(this,pos);
					celda.setObjeto(null,pos);
					celda=aux;
					moverGrafico(direccion);
				}
			}
			break;
			
		case 3: //derecha
			if(!moviendo){
				aux=celda.getCelda(x+1, y);
				
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
						moverGrafico(direccion);
					}
				}else{
					aux.setObjeto(this,pos);
					celda.setObjeto(null,pos);
					celda=aux;
					moverGrafico(direccion);
				}
			}
			break;			
		
		
		}
	

	}
}
