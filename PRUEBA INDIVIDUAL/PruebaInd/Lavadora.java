package PruebaInd;

public class Lavadora extends Electrodomesticos {
	private int carga; 
	static final int CARGA = 5;
	
	public Lavadora() {
	
	}
	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
	}
	public Lavadora(int precioBase, String color, char consumoEnergetico, 
					int peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}


	public int getCarga() {
		return carga;
	}

public double precioFinal(){
		double precio =super.precioFinal();
		if (carga>30){
		precio+=50;		
		}
return precio;

	}

}


