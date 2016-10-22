package tanques;

import java.util.Random;

public class MoverEnemigo implements Runnable{
	
	private Enemigo enemigo;
	private Thread t;
	
	public MoverEnemigo(Enemigo e){
		enemigo = e;
		t=new Thread(this);
		t.start();
	}
	
	public void run (){
		
		Random rnd = new Random();
		
		while(true){
			int dir = rnd.nextInt(4);
			enemigo.moverLogico(dir);
			
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){e.printStackTrace();}
			
		}
		
	}

}