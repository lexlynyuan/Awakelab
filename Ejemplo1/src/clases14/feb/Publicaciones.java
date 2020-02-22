package clases14.feb;

public class Publicaciones {

	private String tipo;
	private int ano;
	private boolean estado;
	public Publicaciones(String tipo, int ano, boolean estado) {
		
		this.tipo = tipo;
		this.ano = ano;
		this.estado = estado;
		
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
	

}
