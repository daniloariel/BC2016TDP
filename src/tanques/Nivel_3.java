package tanques;

public class Nivel_3 extends Nivel
{
	
	 public Nivel_3()
	 {
	    super(25,2,2,true);
	 }
	 
	 public Nivel subir(){
		 return new Nivel_4();
	 }

}
