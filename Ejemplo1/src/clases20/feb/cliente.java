package clases20.feb;

import java.util.Scanner;

public class cliente {
	public static void main(String[] args) {
	
	private int adulto;
	private int nino;
	public int entrada;
	public double montoAdulto; 
	public int horario;
	public double montoNino;
	public double montoTotal;
	public String Sala;
	
	Scanner scanner = new Scanner(System.in);
	
	public void adultos() {

		System.out.println("Ingrese cantidad de adultos: ");
		this.adulto = scanner.nextInt();
	}
	
	public void ninos() {
		System.out.println("Ingrese cantidad de ninos: ");
		this.nino = scanner.nextInt();	
	}
	
	public void tipoSala(String Sala) {
		
		System.out.println("Ingrese la sala (2D - 3D - 4dx - Imax) ");
		this.Sala = scanner.nextLine();	

		switch (Sala){
        
        case "2D":
            entrada = 2000;
            break;
        case "3D":
            entrada = 3000;
            break;
        case "Imax":
            entrada = 5000;
        case "4dx":
            entrada = 7000;
            break;
        }
	}
	

	public void MontoAdulto (int horario) {
		if (horario == 1) {
		montoAdulto = adulto * entrada;
		}else {
		montoAdulto = (adulto * (entrada * 1.3));
		}
	}
/*public void MontoNino (int horario) {
	if (horario == 1) {
		montoNino = (nino * (entrada*0.8));
		}
		
	} */

	public void Total() {
		montoNino = (nino * (entrada*0.8));
		montoTotal = montoAdulto + montoNino;
		System.out.println("El monto total a pagar es: " + montoTotal);
	}
 }

	


