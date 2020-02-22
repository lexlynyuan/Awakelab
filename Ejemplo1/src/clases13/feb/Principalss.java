package clases13.feb;

public abstract class Principalss {

	 
	    /**Método concreto con implementación*/
	    public void metodoConcreto(){

	    }
	 
	    /**Método Abstracto sin implementación*/
	    public abstract void metodoAbstracto();
	   
	}
	 
	class subClase extends Principalss{
	 
	 @Override
	 public void metodoAbstracto() {
	  /**Implementación definida por la clase concreta*/
	 }
	  

	}

