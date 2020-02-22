import java.util.Scanner;
public class ej4 {
	public static void main(String[] args) {
		Scanner escaner= new Scanner(System.in);
		System.out.println("Ingrese Cadena");
		String cadena=escaner.nextLine();
		System.out.println("============");
		System.out.println("El total es: "+cadena.length());
		System.out.println("ingrese indice 1 a cortar");
		int s1=escaner.nextInt();
		String a=cadena.substring(s1);
		System.out.println("1 Indice: "+a);
		System.out.println("============");
		System.out.println("Indice 2");
		System.out.println("============");
		System.out.println("indice 2,1");
		int s2=escaner.nextInt();
		System.out.println("indice 2,2");
		int s3=escaner.nextInt();
		String s=cadena.substring(s2,s3);
		System.out.println("2 Indices: "+s);
		String totalCon=a+s;
		System.out.println(totalCon);
		System.out.println("============");
		System.out.println("La concatenacion es: "+totalCon);
		System.out.println("Ingrese indice de caracter a buscar de: "+totalCon);
		int char1=escaner.nextInt();
		System.out.println("el indice del caracter es: "+totalCon.charAt(char1));
		if (a.equals(s)) {
			System.out.println("Son Iguales");
		}
		else
		{
			System.out.println("No son iguales");
		}
		System.out.println("============");
		System.out.println("En Mayusculas: "+totalCon.toUpperCase());
		System.out.println("============");
		System.out.println("En Minusculas: "+totalCon.toLowerCase());
		System.out.println("============");
		System.out.println("Ingresa caracter a reemplazar");
		String charA=escaner.next();
		char C1 = charA.charAt(0);
		System.out.println("============");
		System.out.println("Ingresa caracter a reemplazar");
		String charB=escaner.next();
		char C2 = charB.charAt(0);
		System.out.println("============");
		System.out.println("============");
		System.out.println("El cambio es: "+totalCon.replace(C1,C2));
		escaner.close();
	}
}