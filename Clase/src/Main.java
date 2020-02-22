import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	System.out.println("Ingrese contraseña");
	Scanner sc = new Scanner(System.in);
	String Contrasena = sc.nextLine();
	System.out.println("Ingrese longitud");
	int Longitud = sc.nextInt();
	
	Password Pw = new Password(Contrasena, Longitud);
	System.out.println(Pw.Contrasena+ " " + Pw.Longitud);
}
}
