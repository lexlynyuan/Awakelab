package cl.awakelab.ejercicio;

public class Acumulador implements Actualización {
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
