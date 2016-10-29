package disparo;
import juego.*;
import mapa.Celda;
import javax.swing.*;

public abstract class Disparo extends ObjetoMovil{
	
	private ObjetoMovil tanque;
	
	protected Disparo(Celda c, int x, int y,ObjetoMovil t,GUI gui){
		super(c,x,y);
		
		tanque = t;
		
		pos=3;
		
		gui.add(this.getGrafico());

		imagenes[0]= new ImageIcon(this.getClass().getResource("/sources/disparo0.png"));
		imagenes[1]= new ImageIcon(this.getClass().getResource("/sources/disparo1.png"));
		imagenes[2]= new ImageIcon(this.getClass().getResource("/sources/disparo2.png"));
		imagenes[3]= new ImageIcon(this.getClass().getResource("/sources/disparo3.png"));
		
		
		
		//direccion = tanque.getDireccion();
		
		
		
	}
	
	public int getPos(){
		return pos;
	}
}