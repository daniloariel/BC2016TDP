package juego;

import javax.swing.JLabel;

import mapa.Celda;
import visitor.Visitor;

public abstract class GameObject implements Runnable {
	
	protected boolean run;
	protected boolean moviendo=false;
	
	protected int pos; //posicion en el arreglo de celda.
	
	protected JLabel grafico;
	protected Celda celda;
	
	protected Visitor visitor;
	
	public GameObject(int x, int y){
		grafico=new JLabel();
		grafico.setBounds(x*32,y*32,32, 32);
		grafico.setVisible(true);
	}
	
	public void destruir(){
		celda=null;
		run=false;
	}
	
	public JLabel getGrafico(){
		return grafico;
	}
	
	public void setCelda(Celda c){
		celda=c;
	}
	public Celda getCelda(){
		return celda;
	}
	
	public void run(){}
	
	public abstract boolean aceptar(Visitor vis);
	
	public abstract int getPos();
}
