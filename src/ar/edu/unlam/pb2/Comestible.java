package ar.edu.unlam.pb2;

public class Comestible extends Producto {

	private String fechaDeElaboracion;
	private String fechaDeVencimiento;
	
	public Comestible(Integer codigo, String descripcion, String fDE, String fDV, String marca, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.fechaDeElaboracion= fDE;
		this.fechaDeVencimiento= fDV;
		
	}

	public String getFechaDeElaboracion() {
		return fechaDeElaboracion;
	}

	public void setFechaDeElaboracion(String fechaDeElaboracion) {
		this.fechaDeElaboracion = fechaDeElaboracion;
	}

	public String getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}

	public void setFechaDeVencimiento(String fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}

	@Override
	public int compareTo(Producto o) {
		
		return this.getCodigo().compareTo(o.getCodigo());
	}

	
	
	


}
