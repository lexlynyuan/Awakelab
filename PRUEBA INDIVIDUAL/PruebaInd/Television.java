package PruebaInd;

public class Television extends Electrodomesticos {
	private int resolucion;
	private boolean sintonizadorTDT; 
	private final static int RES_DEF = 20;
	public Television() {
	}

	public Television(int precioBase, int peso) {
		super(precioBase, peso);
	}
	public Television(int precioBase, String color, char consumoEnergetico, 
					int peso, int resolucion, boolean sintonizadorTDT ) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public double precioFinal() {
		double precio =super.precioFinal();
		if (resolucion > 40) {
			precio+=precioBase*0.3;
		}
		if (sintonizadorTDT) {
			precio+=50;
		}
		return precio;
	}
}
