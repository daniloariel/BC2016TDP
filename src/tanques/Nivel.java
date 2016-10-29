package tanques;

public abstract class Nivel {
	
	public boolean disparos_simultaneos;
	public int resistencia;
	public int velocidad;
	public int velocidad_disparo;
	
	protected Nivel(boolean ds, int r, int v, int vd){
		disparos_simultaneos = ds;
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
	
	

}