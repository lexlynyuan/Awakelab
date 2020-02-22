package clases19.feb;

public class Comercial extends Personal {
	public Comercial(String nombre, int edad, double salario) {
		super(nombre, edad, salario);
	}

	public double comision;

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	public void total(int edad, int salario) {
	
	
		int total;
		if (edad>=30 && comision<=200000) { 
		return super.getSalario() + PLUS;
		} else {
		return super.getSalario();
	}
	}

	
}
