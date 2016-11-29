package tanques;



public abstract class Nivel {
	
	protected boolean disparo_simultaneo;
	protected int resistencia;
	protected int velocidad;
	protected int velocidad_disparo;
	
	protected Nivel(boolean ds, int v, int r, int vd){
		disparo_simultaneo = ds;
		resistencia = r;
		velocidad = v;
		velocidad_disparo = vd;
	}
	
	public abstract Nivel subirNivel();
	
	public int getResistencia(){
		return resistencia;
	}
	
	public int getVelocidad(){
		return velocidad;
	}
	
	public int getVelocidadDisparo(){
		return velocidad_disparo;
	}
	
	public boolean getDisparoSimultaneo(){
		return disparo_simultaneo;
	}
	
	public void decrementarResistencia(){
		resistencia--;
	}
	
	

}
