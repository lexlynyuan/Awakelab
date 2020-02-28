package PruebaInd;

public class Electrodomesticos {

	protected int precioBase;
	private String color; 
	private char consumoEnergetico;
	private int peso;
	static final int PRECIOBASE = 100000;
	static final int PESO = 5;
	protected final static String COLOR_DEF="blanco";
	protected final static char CONS_ENERG_DEF= 'F';
	protected final static double PBASE_DEF=100;
	
	public Electrodomesticos() {
	}
	
	public Electrodomesticos(int precioBase, int peso) { 
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	public Electrodomesticos(int precioBase, String color, char consumoEnergetico, int peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}

	private void comprobarConsumoEnergetico(char consumoEnergetico) {
		char letrasConsumo[]={'A','B','C','D','E','F'};
		boolean encontrado=false;

		for(int i=0;i<letrasConsumo.length && !encontrado;i++){
  
			if(letrasConsumo[i] == consumoEnergetico){
				encontrado=true;
			}
  
		}

			if(encontrado){
				this.consumoEnergetico=consumoEnergetico;
			}else{
				this.consumoEnergetico=CONS_ENERG_DEF;
			}


	}	
		

	private void comprobarColor(String color) {
		
		String colores[]={"blanco", "negro", "rojo", "azul", "gris",
							"BLANCO","NEGRO","ROJO","AZUL","GRIS"};
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){
              
            if(colores[i].equals(color)){
                encontrado=true;
            }
              
        }
          
        if(encontrado){
            this.color=color;
        }else{
            this.color=COLOR_DEF;
        }
          
          
    }	
		
	
	public double precioFinal() {
		double precio = 0;
		switch (consumoEnergetico) {
		case 'A':
            precio+=100;
            break;
        case 'B':
            precio+=80;
            break;
        case 'C':
            precio+=60;
            break;
        case 'D':
            precio+=50;
            break;
        case 'E':
            precio+=30;
            break;
        case 'F':
            precio+=10;
            break;
    }

    if(peso>=0 && peso<19){
        precio+=10;
    }else if(peso>=20 && peso<49){
        precio+=50;
    }else if(peso>=50 && peso<=79){
        precio+=80;
    }else if(peso>=80){
        precio+=100;
    }	
	return precioBase+precio;
	}
}
	
