package tanques;

import visitor.*;

import javax.swing.ImageIcon;
import juego.*;
import javax.swing.JLabel;

import visitor.Visitor;

public class Enemigo extends ObjetoMovil{
	
	public Enemigo (int velocidad, int x, int y){
		super(velocidad,x,y);
		
		pos=1;
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/up2.png"));
		this.imagenes[1] = new ImageIcon(this.getClass().getResource("/imagenes/down2.png"));
		this.imagenes[2] = new ImageIcon(this.getClass().getResource("/imagenes/left2.png"));
		this.imagenes[3] = new ImageIcon(this.getClass().getResource("/imagenes/right2.png"));
		
		grafico=new JLabel();
		grafico.setBounds(x*32, y*32, 32, 32);
		grafico.setIcon(this.imagenes[0]);	
		
		this.visitor = new VisitorEnemigo(this);
		
		
	}
	
	public boolean aceptar(Visitor vis){
		return vis.visitarEnemigo(this);
	}
	public int getPos(){
		return pos;
	}
}
