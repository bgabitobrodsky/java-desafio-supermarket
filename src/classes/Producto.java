package classes;

public abstract class Producto implements Comparable<Producto>{
	private String nombre;
	private Float cantidad;
	private Float precio;
	
	public Producto(String nombre, Float cantidad, Float precio) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	public Producto(String nombre, Float precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	// GETTERS
	public String getNombre() {
		return this.nombre;
	}
	public Float getCantidad() {
		return this.cantidad;
	}
	public Float getPrecio() {
		return this.precio;
	}
	
	// SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCantidad(Float cantidad) {
		this.cantidad = cantidad;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return String.format("Nombre: %s", this.getNombre());
	}
	
	@Override
	public int compareTo(Producto prod) {
		return this.precio.compareTo(prod.getPrecio());
	}
}
