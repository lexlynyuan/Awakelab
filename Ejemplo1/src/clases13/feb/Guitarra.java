package clases13.feb;

public class Guitarra extends Instrumento {
	public String Cuerda;
	
	public Guitarra(String cuer){
		tipo="Guitarra"; 
		this.Cuerda=cuer;
	}

	public void tocar() {
	  System.out.println("Tocar La Guitarra");
	
	 }
	public void cuerda() {
		System.out.println(Cuerda);
	}
}