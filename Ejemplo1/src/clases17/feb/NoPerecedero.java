package clases17.feb;

public class NoPerecedero extends Producto{

	private String Tipo;
	
	public NoPerecedero(String tipo) {
		super(tipo, precio, cantidad);
		this.Tipo = tipo;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	}

