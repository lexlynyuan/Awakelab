package clases19.feb;

import java.util.Scanner;

import clases17.feb.Producto;

public class Ejecutable {

	public static void main(String[] args) {
	Personal empleado [] = new Personal [10];
	
	Scanner entradaempleado = new Scanner(System.in);
	String cargo; 
	 
	
	for (i=0; i>11 ; i++) {
		Scanner entradaempleado=new Scanner(System.in);
		System.out.println("Ingrese cargo del empleado: ");
		cargo = entradaempleado.nextLine();
	
		if cargo = "Comercial" {
		System.out.println("¿cuanto recibe de comisión?");
		comision = entradaempleado.nextLine();
		} else { 
		System.out.println("Cual es su zona de reparto? : ");
		zona = entradaempleado.nextLine();
		}
			
		System.out.println("Ingrese edad del empleado: ");
		edad = entradaempleado.nextLine();
	
		System.out.println("Ingrese sueldo del empleado ");
		sueldo = entradaempleado.nextInt();

		entradaempleado[i] = new Perecedero(cargo,comision,zona,edad,sueldo);

}
}

	private static int getSalario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	}

}

