package tema5crud.ejercicio02;

/**
 * Crearemos una clase que represente las propiedades de un artículo.
 */
public class Articulo {
	
	/**
	 * Este atributo será el identificador o clave primaria
	 * de cada artículo. Es como el DNI de una persona.
	 */
	private int codigo;
	
	/**
	 * Atributo que serà la descripción de un artículo.
	 */
	private String descripcion;
	
	/**
	 * Atributo que será el precio por el cual la empresa compra
	 * el artículo para luego venderlo a un precio mayor.
	 */
	private float precioCompra;
	
	/**
	 * Atributo que será el precio por el que la empresa venderá
	 * el artículo.
	 */
	private float precioVenta;
	
	
	/**
	 * Atributo que será el stock de un artículo
	 */
	private int stock;
	
	
	/**
	 * Función get del código del artículo.
	 * @return Devuelve el código del artículo.
	 */
	public int getCodigo() {
		return this.codigo;
	}
	
	/**
	 * Función get de la descripción del artículo.
	 * @return Devuelve la descripción del artículo.
	 */
	public String getDescripcion() {
		return this.descripcion;
	}
	
	/**
	 * Función set para escribir un valor a la descripción del artículo.
	 * @param descripcion Se le pasa como parámetro la descripción del
	 * artículo que queremos escribir.
	 */
	public void setDescripcion(String descripcion) {
		if(descripcion != null && !descripcion.equals("")) {
			this.descripcion = descripcion;
		}
		
	}
	
	/**
	 * Función get que devuelve el precio de Compra de un
	 * artículo.
	 * @return Devuelve el precio de compra de un artículo.
	 */
	public float getPrecioCompra() {
		return this.precioCompra;
	}
	
	/**
	 * Función set para escribir un valor al precio de
	 * compra de un artículo.
	 * @param precioCompra Pasamos como parámetro el precio
	 * de compra que queremos establecer al producto.
	 */
	public void setPrecioCompra(float precioCompra) {
		if(precioCompra > 0) {
			this.precioCompra = precioCompra;
		}
	}
	
	/**
	 * Funcióhn get que devuelve el precio de venta
	 * de un artículo.
	 * @return Devuelve el precio de venta de un
	 * artículo.
	 */
	public float getPrecioVenta() {
		return this.precioVenta;
	}
	
	/**
	 * Función set para escribir un valor al precio de
	 * venta de un artículo.
	 * @param precioVenta Se le pasa como parámetro el
	 * precio de venta que queremos establecer al
	 * artículo.
	 */
	public void setPrecioVenta(float precioVenta) {
		if(precioVenta > 0) {
			this.precioVenta = precioVenta;
		}
	}
	
	/**
	 * Función get que devuelve el stock de un producto/artículo.
	 * @return Devuelve el stock del artículo.
	 */
	public int getStock() {
		return this.stock;
	}
	
	/**
	 * Función set que establece un valor al stock de
	 * un artículo.
	 * @param stock
	 */
	public void setStock(int stock) {
		if(stock >= 0) {
			this.stock = stock;
		}
	}
	
	
	public Articulo() {
		
	}
	
	public Articulo(int codigo, String descripcion, float precioCompra, float precioVenta, int stock) {
		if()
	}
}
