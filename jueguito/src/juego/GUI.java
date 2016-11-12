package juego;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private boolean terminar = false;

	private JPanel contentPane;
	
	private LinkedList<JLabel> etiquetasVidas;
	
	private Juego juego;
	
	private int xvidas, yvidas;
	
	private Icon imagenVidas;
	
	
	private JLabel etiquetaNivel; 
	private JLabel etiquetaNumeroNivel;
	private Icon [] numeros ;
	private int numero;
	
	
	private JLabel etiquetaPuntos;
	private JLabel puntos;
	
 	
	/**
	 * Create the frame.
	 */
	public GUI(Juego j) {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				mover(arg0);
				
				
			}
		});
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.BLACK);
		
		this.setIconImage(new ImageIcon(this.getClass().getResource("/sources/up.png")).getImage());
		
		
		juego = j;
		
		
		JLabel etiquetaNombre = new JLabel();
		Icon imagenNombre = new ImageIcon(this.getClass().getResource("/sources/battlecity.png"));
		etiquetaNombre.setIcon(imagenNombre);		
		etiquetaNombre.setBounds(700,10,300,100);
		etiquetaNombre.setVisible(true);
		this.add(etiquetaNombre);
		
		
		
		JLabel etiquetaVida = new JLabel ();
		etiquetaVida.setText("VIDAS: ");
		etiquetaVida.setFont(new Font("Serif",Font.BOLD,14));
		etiquetaVida.setForeground(Color.ORANGE);
		etiquetaVida.setBounds(680,190,75,20);
		etiquetaVida.setVisible(true);
		add(etiquetaVida);
		
		 yvidas = 200;
		 xvidas = 750;
		
		etiquetasVidas = new LinkedList <JLabel>();
		
		etiquetasVidas.add(new JLabel());
		etiquetasVidas.add(new JLabel());
		etiquetasVidas.add(new JLabel());
		etiquetasVidas.add(new JLabel());
		
		imagenVidas = new ImageIcon(this.getClass().getResource("/sources/vida.png"));
		
		
		for(JLabel e : etiquetasVidas){
			e.setBounds(xvidas, yvidas, 15, 15);
			e.setIcon(imagenVidas);
			xvidas=xvidas+18;
			e.setVisible(true);
			add(e);
		}
		
		etiquetaNivel = new JLabel();
		etiquetaNivel.setText("NIVEL: ");
		etiquetaNivel.setBounds(680,300,75,20);
		etiquetaNivel.setFont(new Font("Serif",Font.BOLD,14));
		etiquetaNivel.setForeground(Color.ORANGE);
		etiquetaNivel.setVisible(true);
		add(etiquetaNivel);
		
		
		numeros = new Icon[4];
		
		numeros[0] = new ImageIcon(this.getClass().getResource("/sources/uno.png"));
		numeros[1] = new ImageIcon(this.getClass().getResource("/sources/dos.png"));
		numeros[2] = new ImageIcon(this.getClass().getResource("/sources/tres.png"));
		numeros[3] = new ImageIcon(this.getClass().getResource("/sources/cuatro.png"));
		
		
		etiquetaNumeroNivel = new JLabel ();
		etiquetaNumeroNivel.setBounds(750, 300, 32, 32);
		etiquetaNumeroNivel.setIcon(new ImageIcon(this.getClass().getResource("/sources/uno.png")));
		numero = 0;
		etiquetaNumeroNivel.setVisible(true);
		add(etiquetaNumeroNivel);
		
		
		etiquetaPuntos = new JLabel();
		etiquetaPuntos.setText("PUNTOS: ");
		etiquetaPuntos.setBounds(680,400,90, 20);
		etiquetaPuntos.setFont(new Font("Serif",Font.BOLD,14));
		etiquetaPuntos.setForeground(Color.ORANGE);
		etiquetaPuntos.setVisible(true);
		add(etiquetaPuntos);
		
		
		// AGREGAR BIEN LOS PUNTOS.
		puntos = new JLabel();
		puntos.setFont(new Font("Serif",Font.BOLD,14));
		puntos.setForeground(Color.ORANGE);
		puntos.setText("0");
		
		puntos.setBounds(790,400 ,200, 20);
		add(puntos);
		
		
	
		
		
		

		
	}
	
	
	public void sumarPuntos(int puntos){
		int p = Integer.parseInt(this.puntos.getText());
		p+=puntos;
		this.puntos.setText(""+p);
	}
	
	public void actualizarNivel(){
		numero++;
		etiquetaNumeroNivel.setIcon(numeros[numero]);
		repaint();
	}
	
	public void reiniciarNiveles(){
		numero= 0;
		etiquetaNumeroNivel.setIcon(numeros[numero]);
		repaint();
	}
	
	public void modificarVidas(boolean perdi){
		if(perdi){
			this.remove(etiquetasVidas.getLast());
			etiquetasVidas.remove(etiquetasVidas.getLast());
			xvidas-=18;
		}
		else{
			JLabel nueva = new JLabel();
			nueva.setIcon(imagenVidas);
			nueva.setBounds(xvidas,yvidas,15,15);
			nueva.setVisible(true);
			xvidas+=18;
			add(nueva);
			etiquetasVidas.add(nueva);
		}
		
		this.setVisible(true);
		repaint();
	}
	
	public void gameOver(){
		
		terminar = true;
		
		int opcion = (JOptionPane.showConfirmDialog(null, "¿Jugar de nuevo?"));
		
		
		
		if (JOptionPane.OK_OPTION == opcion){
			juego.reset();
		}
	        else{
	        	System.exit(0);	
	        }
		
		
	}
	

	
	protected void mover(KeyEvent key){
		
		if(!terminar)
			juego.mover(key.getKeyCode());
	}
}