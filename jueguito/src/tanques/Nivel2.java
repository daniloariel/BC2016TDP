package tanques;



public class Nivel2 extends Nivel {
	
	public Nivel2 (){
		super(false,20,2,1);
	}
	
	
	public Nivel subirNivel(){
		return new Nivel3();
	}

}
