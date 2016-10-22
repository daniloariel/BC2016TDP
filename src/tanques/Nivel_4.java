package tanques;

public class Nivel_4 extends Nivel
{

	 public Nivel_4()
	 {
	    super(30,3,4,true);
	 }
	 
	 public Nivel subir(){
		 return new Nivel_4();
	 }

}
