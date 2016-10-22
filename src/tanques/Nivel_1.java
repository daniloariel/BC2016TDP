package tanques;

public class Nivel_1 extends Nivel
{
	// constructor
	public Nivel_1()
	{
	   super(15,1,1,false);
	}
	
	public Nivel subir(){
		return new Nivel_2();
	}

}
