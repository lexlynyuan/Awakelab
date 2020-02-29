package PruebaInd;

public class Television extends Electrodomesticos {
	//declaracion de la cte.
	final static int RES_DEF = 20;
	//declaración de los atributos
	private int resolucion;
	private boolean sintonizadorTDT; 

	//constructores 
	
	public Television() {
	}
	
	public Television(double precioBase, int peso) {
		super.getPrecioBase();
		super.getPeso();
	}

	public Television(String color, char consumoEnergetico, 
					int peso, int resolucion, boolean sintonizadorTDT ) {
		super( color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

//Getters del atributo 
	
	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	
	//calculo del precico con restriccion
	
	public void PrecioFinal() {
		super.PrecioFinal();
		if (resolucion > 40) {
			consultaPrecio+=consultaPrecio*0.3;
		}
		if (sintonizadorTDT) {
			consultaPrecio+=50;
		}
		setPrecioBase(consultaPrecio);
	}
}
