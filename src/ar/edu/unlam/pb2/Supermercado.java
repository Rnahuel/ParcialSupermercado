package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Supermercado {

	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el número de venta)
	Integer contadorDeVentas; // Identificador del número de venta
	private List<Venta>agregarAlCarro;
	
	public Supermercado(String nombre) {
		// Constructor de la clase
		this.nombre = nombre;
		productosExistentes = new TreeSet<Producto>();
		productosDisponibles = new ArrayList<Producto>();
		ventasRealizadas = new HashMap<Integer, Venta>();
		contadorDeVentas = 0;
		agregarAlCarro= new ArrayList<Venta>();

	}

	public void ingresarProducto(Producto nuevo) {
		// Ingresa un nuevo producto
		productosExistentes.add(nuevo);
		productosDisponibles.add(nuevo);

	}

	public Set<Producto> getOfertaDeProductos() {
		// Devuelve el conjunto de productos que se comercializan
		return productosExistentes;

	}

	public Integer getStock(Integer codigo) {
		// Devuelve la cantidad de unidades de un producto determinado
		Integer cantidad = 0;
		for (Producto producto : productosDisponibles) {
			if (codigo.equals(producto.getCodigo())) {
				cantidad++;
			}
		}
		return cantidad;
	}

	private Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente {
		// Verifica si un producto existe
		Boolean existe = false;
		for (Producto producto : productosExistentes) {
			if (codigoDeProducto.equals(producto.getCodigo())) {
				existe = true;
				break;
			}
		}
		if (existe == false) {
			throw new ProductoInexistente();
		}

		return existe;
	}

	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock {
		// Busca la disponibilidad de un producto
		Producto productoDisponible = null;
		for (Producto producto : productosDisponibles) {
			if (producto.getCodigo().equals(codigoDeProducto)) {
				productoDisponible = producto;
				break;
			}
		}
		if(productoDisponible==null) {
			throw new ProductoSinStock();
		}
	return productoDisponible;

	}

	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}

	public Venta getVenta(Integer numeroDeVenta) {
		// Devuelve una venta en función de su número identificatorio
		return ventasRealizadas.get(numeroDeVenta);
		
	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto)
			throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras de la venta identificada por el
		// "numeroDeVenta", el producto identificado por el "codigoDeProducto"
		if(productoExiste(codigoDeProducto)) {
		Producto productito= getProductoPorCodigo(codigoDeProducto);
		Venta ventita= getVenta(numeroDeVenta);
		
		List<Producto> carrito= ventita.getCarrito();
		carrito.add(productito);
		productosDisponibles.remove(getProductoPorCodigo(codigoDeProducto));
		}
	}
	
	
	public int obtenerProductosComestibles() throws ProductoSinStock {
		int productoComestible= 0;
		for (Producto producto : productosDisponibles) {
			if(producto instanceof Comestible) {
				productoComestible++;
				
				
			}	
		}
		
		return productoComestible;
	}
	

}
