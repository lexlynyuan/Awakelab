
public class Ejercicio3 {
public static void main(String[] args) {
	String cad = "casa blanca";
	char car = 'a';
	int cont = 0;
	
	for (int i=0; i<cad.length(); i++) {
		char letra = cad.charAt(i);
		if(letra == car) {
			cont++;
		}
	}
	System.out.println("el caracter " + car + " se repite " + cont + " veces");
}
}
