package ar.edu.unlam.pb2;

public class Carne extends Comestible {

	private Double kilos;
	
	public Carne(Integer codigo, String descripcion, String fDE, String fDV,Double kg, String marca, Double precio) {
		super(codigo, descripcion, fDE, fDV, marca, precio);
		// TODO Auto-generated constructor stub
		this.kilos= kg;
	}

	public Double getKilos() {
		return kilos;
	}

	public void setKilos(Double kilos) {
		this.kilos = kilos;
	}

	

}
