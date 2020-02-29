package PruebaInd;

public class Lavadora extends Electrodomesticos {
	//declaracion de la cte.
	protected final static int CARGA = 5;
	//declaracion del atributo
	private int carga; 

//constructores
	
	public Lavadora() {
	//	this(PRECIOBASE, PESO, COLOR_DEF, CONS_ENERG_DEF);
	}
	
	public Lavadora(double precioBase, int peso) {
		super.getPrecioBase();
		super.getPeso();
	}
	
	public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
		super(color, consumoEnergetico, peso);
		this.carga = carga;
	}

// get del atributo carga
	
	public int getCarga() {
		return carga;
	}
// calculo del precio 
	
public void PrecioFinal(){
		super.PrecioFinal();
		if (carga>30){
		consultaPrecio+=50;		
		}
 setPrecioBase(consultaPrecio);

	}

}


