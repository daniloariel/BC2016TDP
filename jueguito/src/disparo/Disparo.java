package disparo;
import juego.*;
import mapa.Celda;
import javax.swing.*;

public abstract class Disparo extends ObjetoMovil{
	
	protected ObjetoMovil tanque;
	
	protected int velocidad_disparo;
	protected boolean disparo_simultaneo;
	
	protected Disparo(Celda c, int x, int y,ObjetoMovil t,GUI gui,int vd, boolean ds){
		super(c,x,y);
		
		tanque = t;
		
		pos=3;
		
		

		imagenes[0]= new ImageIcon(this.getClass().getResource("/sources/disparo0.png"));
		imagenes[1]= new ImageIcon(this.getClass().getResource("/sources/disparo1.png"));
		imagenes[2]= new ImageIcon(this.getClass().getResource("/sources/disparo2.png"));
		imagenes[3]= new ImageIcon(this.getClass().getResource("/sources/disparo3.png"));
		
		gui.add(this.getGrafico());
		
		
		
		//direccion = tanque.getDireccion();
		
		
		
	}
	
	public int getPos(){
		return pos;
	}
	
	public int recibirDisparo(){
		destruir();
		
		return 0;
	}
	
}
