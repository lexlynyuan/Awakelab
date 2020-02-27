package Prueba;

public class Caguano extends Carro{
	private int alcanceTiro;
	private String colorConfeti;
	
	
	public Caguano(int cantOcupantes, int fechaIng, int fila, int columna, int alcanceTiro, String colorConfeti) {
		super(cantOcupantes, fechaIng, fila, columna);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
	}
	public Caguano(){
		
	}
	
	public String[][] Posicion_Caguano() {//entrega el punto final de un Caguano
		String [][] Matriz_caguano = new String[2][3];
		Matriz_caguano[0][0]=Integer.toString(getFila());
		Matriz_caguano[0][1]=Integer.toString(getColumna());
		Matriz_caguano[0][2]="[ C ]";
		Matriz_caguano[1][0]=Integer.toString(getFila());
		Matriz_caguano[1][1]=Integer.toString(getColumna()+1);
		Matriz_caguano[1][2]="[ C ]";
		return Matriz_caguano;
	}
	
	public int getAlcanceTiro() {
		return alcanceTiro;
	}
	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}
	public String getColorConfeti() {
		return colorConfeti;
	}
	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}
	
	
	
}
