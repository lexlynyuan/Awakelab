package cine;

public class Sala2D extends Sala {
	
	private int numSala=1;
	private int valorAsiento=2000;
	private int cantAsiento=40;

	public Sala2D(int numSala, int valorAsiento, int cantAsiento) {
		
		this.numSala=numSala;
		this.valorAsiento = valorAsiento;
		this.cantAsiento=cantAsiento;
		
	}
	
public Sala2D() {
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
