package PruebaInd;

public class Electrodomesticos {
//declaracion de las constantes 
	
	final static double PRECIOBASE = 100000;
	final static double PESO = 5;
	final static String COLOR_DEF="blanco";
	final static char CONS_ENERG_DEF= 'F';
	//PRECIOBASE, PESO, COLOR_DEF, CONS_ENERG_DEF

// declaracion de los atributos
	private double precioBase;
	private String color; 
	private char consumoEnergetico;
	private int peso;
	public double consultaPrecio; 
	
//getters de los atributos
	
	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}
// constructores 
	public Electrodomesticos(double precioBase, int peso) { 
		this.peso = peso;
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);
		
	}
	
	public Electrodomesticos(String color, char consumoEnergetico, int peso) {
		super();
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
	public Electrodomesticos() {
	}
	
//comprueba que la letra que ingresa esta dentro de los existentes,
	// de lo contrario da la letra por defecto F
	
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
		
//comprobar que el color esta dentro de los que hay disponibles, de caso contrario
	//indica que no esta el color, y da por defecto el blanco.
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
		
//calculo del preciofinal dependiendo del consumo energetico y peso que tenga 

	public void PrecioFinal() {
		double ValorLetra =0;
		double ValorPeso =0;
		if (getConsumoEnergetico() == 'A') {
			ValorLetra = 100;
		} else if (getConsumoEnergetico() == 'B') {
			ValorLetra = 80;
		  } else if (getConsumoEnergetico() == 'C') {
			  ValorLetra = 60;
		    } else if (getConsumoEnergetico() == 'D') {
		    	ValorLetra = 50;
		      } else if (getConsumoEnergetico() == 'E') {
		    	 ValorLetra = 30;
		        } else if (getConsumoEnergetico() == 'F') {
		        	ValorLetra = 10;
		        } else {
		        	ValorLetra=10;
		          }
		  if (getPeso()>0 && getPeso()<20) {
		        	ValorPeso = 10;
		        } else if (getPeso()>=20 && getPeso()<50) {
		        		ValorPeso = 50;	
		        	} else if (getPeso()>=50 && getPeso()<80 ) {
		        			ValorPeso = 80;
		        		} else if (getPeso()>=80) {
		        				ValorPeso= 100;
		        		}else { 
		        			ValorPeso=100;
    }
	   consultaPrecio = ValorPeso + ValorLetra;
	   setPrecioBase(consultaPrecio);
	  	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	
}

	
