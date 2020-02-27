package Prueba;

import java.util.Scanner;

public class Huevo {
	private int lanzamiento;
	private int fila;
	private int columna; 
	private int puntaje;
	private int puntajeC = 0;
	private int puntajeK = 0;
	private int puntajeAdicional;
	private int puntajeTotal;
	
	public int getPuntajeTotal() {
		return puntajeTotal;
	}

	public void setPuntajeTotal(int puntajeTotal) {
		this.puntajeTotal = puntajeTotal;
	}

	public int getPuntajeC() {
		return puntajeC;
	}

	public void setPuntajeC(int puntajeC) {
		this.puntajeC = puntajeC;
	}

	public int getPuntajeK() {
		return puntajeK;
	}

	public void setPuntajeK(int puntajeK) {
		this.puntajeK = puntajeK;
	}

	public int getPuntajeAdicional() {
		return puntajeAdicional;
	}

	public void setPuntajeAdicional(int puntajeAdicional) {
		this.puntajeAdicional = puntajeAdicional;
	}
	private int[] posicion = new int[2];
	private String[][] matriz = new String[16][16];
	
	public Huevo(int lanzamiento, int puntaje, int[] posicion) {
		this.lanzamiento = lanzamiento;
		this.posicion = posicion;
		this.puntaje = puntaje;
	}
	
	public Huevo() {
		
	}
	
	public int getLanzamiento() {
		return lanzamiento;
	}
	public void setLanzamiento(int lanzamiento) {
		this.lanzamiento = lanzamiento;
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	public int getFila() {
		return posicion[0];
	}

	public void setFila(int valor) {
		posicion[0]=valor;
	}

	public int getColumna() {
		return posicion[1];
	}

	public void setColumna(int valor) {
		posicion[1]=valor;
	}

	public int[] getPosicion( ) {
		 posicion[0]=fila;
		 posicion[1]=columna;
		 return posicion;
	} 

	public void setPosicion(int fila, int columna) {
		posicion[0]=fila;
		posicion[1]=columna;
	}
	
	

//solicita al usuario la fila y la columna a la cual lanzar el huevo
	//VA AL MAIN
public void Lanzamiento(int fila, int columna) {
	setFila(fila);
	setColumna(columna);

}





	/*recorre la matriz y verificar si tiene algún carro para asignar puntaje,
	la cantidad del puntaje asignado depende de cada tipo de carro*/

public static String[][] Marcar(int fila, int columna, String [][]Matriz) {
			if(Matriz[columna][fila].equals("[ K ]")) {
				Matriz[columna][fila]="[ HK ]";
			} else if (Matriz[columna][fila].equals("[ C ]")) {
				Matriz[columna][fila]="[ HC ]";
			} else if (Matriz[columna][fila].equals("[ T ]")) {
				Matriz[columna][fila]="[ HT ]";
			} else { 
				Matriz[columna][fila]="[ H ]";
			}
			
			return Matriz;
		}
			
	
/*recorre la matriz y verifica en una posicion si hay kromi, 
en caso de que lo encuentre, busca en la filas siguientes o 
anteriores a modo de verificar si la kromi está destruida*/
public static int[] PuntajeAdicional( int fila, int columna, String [][]Matriz) {
	int[] Puntaje=new int[3];
	int puntajeK = 0;
	int puntajeC=0;
	int puntaje=0;
	
	if(Matriz[columna][fila].equals("[ K ]")) {
		puntaje = puntaje + 3;
	} else if (Matriz[columna][fila].equals("[ C ]")) {
		puntaje = puntaje + 2;
	} else if (Matriz[columna][fila].equals("[ T ]")) {
		puntaje = puntaje + 1;
	}
	
	
	for(int i = 0; i<15; i++) {
		for(int j = 0; j<15; j++) {	
			if (Matriz[i][j].equals("[ HK ]") && 
				Matriz [i][j+1].equals("[ HK ]") && 
				Matriz[i][j+2].equals("[ HK ]")) {
				puntajeK= 10;
			}
			if (Matriz[i][j].equals("[ HC ]") && 
					Matriz [i+1][j].equals("[ HC ]")) {
				puntajeC= 7;
				} 
				}
			}
		Puntaje[0]=puntajeK;
		Puntaje[1]=puntajeC;
		Puntaje[2]=puntaje;
	return Puntaje;
}
    
	public void Adicional() {
	setPuntajeAdicional( getPuntajeK() + getPuntajeK());
	}
		
	public void Total() {
	setPuntajeTotal( puntaje + getPuntajeAdicional());
	
		System.out.println("El puntaje obtenido es " + getPuntajeTotal() );
	}		
}
