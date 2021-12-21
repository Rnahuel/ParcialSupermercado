package ar.edu.unlam.pb2;

public class Televisor extends Electrodomestico {

	private Integer pulgadas;
	
	public Televisor(Integer codigo,String descripcion,Integer pulgadas, Integer garantia,  String marca, Double precio) {
		super(codigo, garantia, descripcion, marca, precio);
		// TODO Auto-generated constructor stub
		this.pulgadas= pulgadas;
	}

	public Integer getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(Integer pulgadas) {
		this.pulgadas = pulgadas;
	}
	
	

}
