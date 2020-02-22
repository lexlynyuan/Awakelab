package clases17.feb;

public class Perecedero extends Producto {
	public int diasCaduca;
	public double valor;

	public Perecedero(String nombre, double precio, int cantidad, int diasCaduca) {
		super(nombre, precio, cantidad);
		this.diasCaduca = diasCaduca;
	}

	public int getDiasCaduca() {
		return diasCaduca;
	}

	public void setDiasCaduca(int diasCaduca) {
		this.diasCaduca = diasCaduca;


	switch (diasCaduca){
	case 1:
		valor = super.getPrecio()/4;
		break;
	case 2:
		valor = super.getPrecio()/3;
		break;
	case 3:
		valor =  super.getPrecio()/2;
		break;
	default:
		valor = super.getPrecio();
		}
	}
}


	
	
	
