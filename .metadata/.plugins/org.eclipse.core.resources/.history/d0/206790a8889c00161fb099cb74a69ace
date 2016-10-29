package disparo;


import juego.*;


public class MoverDisparo implements Runnable {
	
	private ObjetoMovil disparo;
	private Thread hilo;
	
	public MoverDisparo(Disparo disp){
		disparo = disp;
		
		hilo = new Thread(this);
		hilo.start();
	}
	
	public void run(){
		
		boolean run = disparo.getIsRun();
		while(run){
			disparo.moverLogico(disparo.getDireccion());
			
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){e.printStackTrace();}
			
			run=disparo.getIsRun();
		
		}
		
		hilo.interrupt();
	}
}
