package cl.awakelab.ejercicio;

public class Acumulador implements Actualizaci�n {
	private int valor;
	
	public Acumulador (int i) 
	{ 
		this.valor=i; 
	} 
	public int daValor() 
	{
		return this.valor; 
	}
	
	public void incremento (int a) {
		this.valor +=a;
		
	}
}
