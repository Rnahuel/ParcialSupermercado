package ar.edu.unlam.pb2;

public class Electrodomestico extends Producto {

	private Integer garantia;
	
	public Electrodomestico(Integer codigo,Integer garantia, String descripcion, String marca, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.garantia=garantia;
		// TODO Auto-generated constructor stub
	}

	public Integer getGarantia() {
		return garantia;
	}

	public void setGarantia(Integer garantia) {
		this.garantia = garantia;
	}

	@Override
	public int compareTo(Producto o) {
		// TODO Auto-generated method stub
		return this.getCodigo().compareTo(o.getCodigo());
	}

	

}
