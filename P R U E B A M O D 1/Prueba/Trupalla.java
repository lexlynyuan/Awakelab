package Prueba;

public class Trupalla extends Carro{

	private int nivelArmadura;
	private String Nombre;
	public Trupalla(int cantOcupantes, int fechaIng, int fila, int columna, int nivelArmadura, String nombre) {
		super(cantOcupantes, fechaIng, fila, columna);
		this.nivelArmadura = nivelArmadura;
		Nombre = nombre;
	}
	
	public Trupalla() {
		
	}
	
	public String[][] Posicion_Trupalla() {//entrega el punto final de un Caguano
		String [][] Arreglo_Trupalla = new String[1][3];
		Arreglo_Trupalla[0][0]=Integer.toString(getFila());
		Arreglo_Trupalla[0][1]=Integer.toString(getColumna());
		Arreglo_Trupalla[0][2]="[ T ]";
		
		return Arreglo_Trupalla;
	}
	
	public int getNivelArmadura() {
		return nivelArmadura;
	}
	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	} 
	
}
