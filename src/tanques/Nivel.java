package tanques;

public abstract class Nivel {
	
	
	// atributos de instancia
		protected boolean disparos_simultaneos;
		protected int velocidad_disparo;
		protected int velocidad;
		protected int resistencia;
		
		public Nivel(int v, int vd, int r, boolean ds)
		{
			
			disparos_simultaneos=ds;
			velocidad=v;
			velocidad_disparo=vd;
			resistencia=r;
		}
		
		public int getVelocidad()
		{
			return velocidad;
		}
		
		public int getResistencia()
		{
			return resistencia;
		}
		public int getVelocidadDisparo()
		{
			return velocidad_disparo;
		}
		public boolean getDiparosSimultaneos()
		{
			return disparos_simultaneos;
		}
		
		public abstract Nivel subir();

}
