package disparo;

public class MoverDisparo implements Runnable {

	private Disparo disparo;
	private Thread t;
	
	public MoverDisparo(Disparo disp){
		disparo=disp;
		t = new Thread(this);
		t.start();
	}
	
	public void run(){
		boolean run = disparo.getRun();
		while(run){
			
			disparo.moverLogico(disparo.getDireccion());
			
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){e.printStackTrace();}
			
			run=disparo.getRun();
		
		}
		
		t.interrupt();
	}
	
}
