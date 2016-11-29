package powerups;

import tanques.*;

public class ActivarTimer implements Runnable{
	
	private Enemigo enemigo;
	
	public ActivarTimer(Enemigo e){
		enemigo = e;
	}

	@Override
	public void run() {
		enemigo.stop();
		try{
		Thread.sleep(4000);
		}catch(InterruptedException e){e.printStackTrace();}
		
		enemigo.start();
	}

}
