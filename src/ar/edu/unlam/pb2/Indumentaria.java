package ar.edu.unlam.pb2;

public class Indumentaria extends Producto {

	private String color;
	private String talle;
	
	public Indumentaria(Integer codigo, String descripcion,String talle, String marca,String color, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.color= color;
		this.talle= talle;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	@Override
	public int compareTo(Producto o) {
		// TODO Auto-generated method stub
		return this.getCodigo().compareTo(o.getCodigo());
	}

	
	
	
}
