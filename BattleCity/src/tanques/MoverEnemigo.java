package tanques;

import java.util.Random;

import mapa.*;
import disparo.*;

public class MoverEnemigo implements Runnable{
	
	private Enemigo enemigo;
	private static Thread t;
	private int sleep;
	private volatile boolean stopped = false;
	
	
	public MoverEnemigo(Enemigo e,int s){
		
		enemigo = e;
		t=new Thread(this);
		sleep=s;
		t.start();
		
	}
	
	public void run (){
		
		Random rnd = new Random();
		boolean isRun = enemigo.getIsRun();
		while(isRun){
			if(!stopped ){
				int dir = rnd.nextInt(5);
				if(dir < 4)
					enemigo.moverLogico(dir);
				else {
					
					Celda c = enemigo.getCelda();
					 new DisparoEnemigo(c, c.getX(),c.getY(), enemigo,c.getMapa().getGUI(),enemigo.getDireccion(),15,false);
				}
					try{
						Thread.sleep(sleep);
					}catch(InterruptedException e){e.printStackTrace();}
					
				isRun = enemigo.getIsRun();
			}else{
				try {
					Thread.sleep(70);
				} catch (InterruptedException e) {
					e.printStackTrace();
				  }
          }
		}
		
		
	}
	
	public void stop(){
		stopped = true;
	}
	
	public void start(){
		stopped = false;
	}
}