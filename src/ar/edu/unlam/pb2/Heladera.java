package ar.edu.unlam.pb2;

public class Heladera extends Electrodomestico {

	private boolean isNoFrost;
	
	public Heladera(Integer codigo, String descripcion,boolean isNoFrost, Integer garantia, String marca, Double precio) {
		super(codigo, garantia, descripcion, marca, precio);
		// TODO Auto-generated constructor stub
		this.isNoFrost= isNoFrost;
	}

	public boolean getIsNoFrost() {
		return isNoFrost;
	}

	public void setNoFrost(boolean isNoFrost) {
		this.isNoFrost = isNoFrost;
	}

	

	
	

	
	
}
