import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Clase1 {
	 public static void main(String[] args) throws IOException
	
	//public static void main(String args[]){
		int a1;
		int a2;
		int b1;
		int b2;
		int k;
		int tamano;
		char tipo;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Tipo de Lana");
		System.out.println("Tamaño");
		tamano = 5;
		System.out.println("Ingresar k");
		String k1 = br.readLine();
		System.out.println(k1);
		tipo='A';
		if (tipo=='A') {
			if (tamano==1) {
				a1 = 200*k1;
				System.out.println("el valor a pagar es "+a1);
			} else {
				a2 = 300*k1;
				System.out.println("el valor a pagar es "+a2);
			}
		} else {
			if (tamano==1) {
				b1 = -50*k1;
				System.out.println("el valor a pagar es "+b1);
			} else {
				b2 = 60*k1;
				System.out.println("el valor a pagar es "+b2);
			}
		}
	}
}