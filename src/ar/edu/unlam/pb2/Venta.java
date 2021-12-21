package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class Venta {

	
	private Integer dni;
	private String nombreDelComprador;
	private List<Producto> carrito;
	
	public Venta(Integer dniDelComprador, String nombreDelComprador) {
		// TODO Auto-generated constructor stub
		this.dni=dniDelComprador;
		this.nombreDelComprador=nombreDelComprador;
		this.carrito = new ArrayList<Producto>();
		
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombreDelComprador() {
		return nombreDelComprador;
	}

	public void setNombreDelComprador(String nombreDelComprador) {
		this.nombreDelComprador = nombreDelComprador;
	}

    public Double getImporte() {
        Double aux =   0.0;
        for (Producto producto : carrito) {
            aux += producto.getPrecio();
        }
        // TODO Auto-generated method stub
        return aux;
    }

    public List<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Producto> carrito) {
        this.carrito = carrito;
    }

    public void agregarAlCarrito(Producto producto) {
        carrito.add(producto);


    }
	
	

}
