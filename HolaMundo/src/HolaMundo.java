import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HolaMundo.java

	 public static void main(final String[] args) throws IOException
	    {
		 final BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"
		 System.out.println("Por favor ingrese su nombre");
		 final String nombre = br.readLine();
		 System.out.println("Bienvenido " + nombre + ". Por favor ingrese su edad");
		 final String edad = br.readLine();
		 System.out.println("Vaya! " + edad + " años, no los representas");
	}
}