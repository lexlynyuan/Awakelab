package cine;

public class Sala4Dx extends Sala {
	
	private int numSala=4;
	private int valorAsiento=7000;
	private int cantAsiento=30;

	public Sala4Dx(int numSala, int valorAsiento, int cantAsiento) {
		
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