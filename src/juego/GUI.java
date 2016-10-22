package juego;

import java.awt.Color;
import java.awt.EventQueue;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tanques.*;

public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	
	private Juego j;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} 
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				mover(arg0);
				
				
			}
		});
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.BLACK);
		
		this.setIconImage(new ImageIcon(this.getClass().getResource("/imagenes/up.png")).getImage());
		
		
		j = new Juego(this);
		
		
		
	}
		
	
	protected void mover(KeyEvent key){
		
		j.mover(key.getKeyCode());
	}
}