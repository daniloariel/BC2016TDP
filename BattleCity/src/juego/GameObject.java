package juego;

import javax.swing.JLabel;

import mapa.*;

import visitor.*;

public abstract class GameObject {
	
	protected Visitor visitor;
	
	protected JLabel grafico;
	protected Celda celda;
	protected int pos;
	protected Mapa mapa;
	
	protected GameObject (Celda c, int x, int y,Mapa map){
		
		celda=c;		
		grafico = new JLabel();
		grafico.setBounds(x*32, y*32, 32, 32);
		grafico.setVisible(true);
		mapa=map;
	}
	
	public void setCelda(Celda c){
		celda=c;
	}
	
	public void setGrafico(JLabel g){
		grafico=g;
	}
	
	public JLabel getGrafico(){
		return grafico;
	}
	
	public Celda getCelda(){
		return celda;
	}
	
	public void destruir(){
		celda.setObjeto(null, this.pos);
		grafico.setIcon(null);
	   
	}
	
	public abstract int getPos();
	
	public abstract boolean aceptar(Visitor vis);

}
