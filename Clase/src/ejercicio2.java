public class ejercicio2 {
public static void main(String[] args) {

		String cadena = "casa blanca";
		// Esta ser� la cadena invertida, primero est� vac�a
		String invertida = "";
		// Recorremos la original del final al inicio
		for (int indice = cadena.length() - 1; indice >= 0; indice--) {
			// Y vamos concatenando cada car�cter a la nueva cadena
			invertida += cadena.charAt(indice);
		}
		System.out.println("Cadena original: " + cadena);
		System.out.println("Cadena invertida: " + invertida);

	}	
}

