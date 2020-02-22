package clases19.feb;

public class Repartidor extends Personal  {
	public String zona;

	public Repartidor(String nombre, int edad, int salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
 
	public void totalR(int edad, int salario) {
		
		
		int totalR;
		if (edad<25 && zona== "zona3") { 
		totalR = super.getSalario() + PLUS;
		} else {
		totalR = super.getSalario();
	}
	}
	}
