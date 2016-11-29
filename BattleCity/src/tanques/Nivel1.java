package tanques;

public class Nivel1 extends Nivel {

	public Nivel1 (){
		super(false,15,1,1);
		
	}
	
	
	public Nivel subirNivel(){
		return new Nivel2();
	}
	
	
}
