package tanques;

public class Nivel4 extends Nivel{
	
	public Nivel4 (){
		super(true,30,3,4);
	}
	
	
	public Nivel subirNivel(){
		return new Nivel4();
	}

}
