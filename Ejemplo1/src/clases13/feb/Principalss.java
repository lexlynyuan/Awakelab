package clases13.feb;

public abstract class Principalss {

	 
	    /**M�todo concreto con implementaci�n*/
	    public void metodoConcreto(){

	    }
	 
	    /**M�todo Abstracto sin implementaci�n*/
	    public abstract void metodoAbstracto();
	   
	}
	 
	class subClase extends Principalss{
	 
	 @Override
	 public void metodoAbstracto() {
	  /**Implementaci�n definida por la clase concreta*/
	 }
	  

	}

