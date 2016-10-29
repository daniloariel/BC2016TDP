package tanques;

import java.util.Random;

import mapa.*;
import disparo.*;

public class MoverEnemigo implements Runnable{
	
	private Enemigo enemigo;
	private Thread t;
	private int sleep;
	
	
	public MoverEnemigo(Enemigo e,int s){
		enemigo = e;
		t=new Thread(this);
		t.start();
		sleep=s;
	}
	
	public void run (){
		
		Random rnd = new Random();
		boolean isRun = enemigo.getIsRun();
		while(isRun){
			int dir = rnd.nextInt(5);
			if(dir < 4)
				enemigo.moverLogico(dir);
			else {
				
				Celda c = enemigo.getCelda();
				DisparoEnemigo disp = new DisparoEnemigo(c, c.getX(),c.getY(), enemigo,c.getMapa().getGUI(),enemigo.getDireccion());
			}
			
			try{
				Thread.sleep(sleep);
			}catch(InterruptedException e){e.printStackTrace();}
			
			isRun = enemigo.getIsRun();
		}
		t.interrupt();
		
	}

}