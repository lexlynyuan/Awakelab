package clases17.feb;
import java.util.Scanner;
public class Ejecutable {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Producto perecedero [] = new Producto[4];
	
		for (int i=0; i<5; i++) {
			
			System.out.println("Introduzca nombre del producto perecedero: ");
			String nom = teclado.next();
			perecedero[i].setNombre(nom);
        
			System.out.print("Introduzca precio del producto perecedero: ");
			double valor = teclado.nextDouble();
			perecedero[i].setPrecio(valor);
        
			System.out.print("Introduzca cantidad del producto perecedero: ");
			int cant = teclado.nextInt();
			perecedero[i].setCantidad(cant);
			
			System.out.print("Introduzca días de caducidad del producto perecedero: ");
			int cad = teclado.nextInt();
			diasCaducar=entradaPerecedero.nextInt();
			
			productos[i] = new Perecedero(nombre,precio,diasCaducar);
		}
		
		Producto Noperecedero [] = new Producto[4];
		
		for (int i=0; i<5 ; i++) {
		
			System.out.println("Introduzca nombre del producto No perecedero: ");
			String nom = teclado.next();
			Noperecedero[i].setNombre(nom);	
		
			System.out.print("Introduzca precio del producto No perecedero: ");
			double valor = teclado.nextDouble();
			Noperecedero[i].setPrecio(valor);
	        
			System.out.print("Introduzca cantidad del producto No perecedero: ");
			int cant = teclado.nextInt();
			Noperecedero[i].setCantidad(cant);
		}
		
		
	}
}


