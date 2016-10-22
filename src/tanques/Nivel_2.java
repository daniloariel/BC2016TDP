package tanques;

public class Nivel_2 extends Nivel
{
   
    
    public Nivel_2()
    {
    	 super(20,2,1,false);
    }
    
    public Nivel subir(){
    	return new Nivel_3();
    }
}
