package powerups;

import mapa.Mapa;

public class ActivarPala implements Runnable{
	
	private Mapa mapa;
	
	public ActivarPala(Mapa m){
		mapa = m;
	}
	
	public void run(){
		mapa.baseAcero();
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mapa.baseLadrillo();
	}
}
