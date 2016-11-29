package tanques;

import visitor.*;

	public class Invulnerable implements Runnable{
		
		private Thread t;
		private Jugador jug;
		
		public Invulnerable(Jugador j){
			jug = j;
			t = new Thread(this);
			t.start();
		}
		
		public void run(){
			
			jug.setInvulnerable(true);
			jug.setVisitor(new VisitorJugadorInvulnerable(jug));
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) { e.printStackTrace();}
			
			jug.setInvulnerable(false);
			jug.setVisitor(new VisitorJugador(jug));	
			
		}
		
	}
