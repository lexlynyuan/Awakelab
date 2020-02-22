import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in); //Se crea el lector
	System.out.println("Por favor ingrese una cadena");//Se pide un dato al usuario
	String cadena = sc.nextLine();

	System.out.println(cadena.length()); //(1)
	

	System.out.println("Ingrese indice");
	int indice = sc.nextInt(); 
	
	String cadena_cortada = cadena.substring(indice);
	System.out.println(cadena_cortada);
	
	
	
	
	
	
	System.out.println(cadena.toLowerCase()); //Convertir a minuscula (8)
	
	System.out.println(cadena.toUpperCase()); //Convertir a mayuscula (9)

}
}