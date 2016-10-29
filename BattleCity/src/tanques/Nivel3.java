package tanques;

public class Nivel3 extends Nivel{
	
	public Nivel3 (){
		super(true,25,2,2);
	}
	
	
	public Nivel subirNivel(){
		return new Nivel4();
	}

}
