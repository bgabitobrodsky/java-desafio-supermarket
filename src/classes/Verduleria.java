package classes;

public class Verduleria extends Producto{
	
	private String unidad;
	
	public Verduleria(String nombre, Float precio, String unidad) {
		super(nombre,precio);
		this.unidad = unidad;
	}
	
	public String getUnidad() {
		return unidad;
	}
	
	@Override
	public String toString() {
		String str = super.toString();
		str += String.format(" /// Precio: $%.0f", this.getPrecio());
		str += String.format(" /// Unidad de venta: %s", this.getUnidad());
		
		return str;
	}
}
