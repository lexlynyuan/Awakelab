package clases21.feb;

public class Sala3D extends Sala {
	private int numSala=3;
	private int valorAsiento=3000;
	private int cantAsiento=35;

	public Sala3D(int numSala, int valorAsiento, int cantAsiento) {
		
		this.numSala=numSala;
		this.valorAsiento = valorAsiento;
		this.cantAsiento=cantAsiento;
		
	}

	public int getNumSala() {
		return numSala;
	}

	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}

	public int getValorAsiento() {
		return valorAsiento;
	}

	public void setValorAsiento(int valorAsiento) {
		this.valorAsiento = valorAsiento;
	}

	public int getCantAsiento() {
		return cantAsiento;
	}

	public void setCantAsiento(int cantAsiento) {
		this.cantAsiento = cantAsiento;
	}
	
	
}