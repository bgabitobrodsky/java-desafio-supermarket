package classes;

public class Shampoo extends Producto{
	public Shampoo(String nombre, Float cantidad, Float precio) {
		super(nombre,cantidad,precio);
	}
	
	@Override
	public String toString() {
		String str = super.toString();
		str += String.format(" /// Contenido: %.1fmL", this.getCantidad());
		str += String.format(" /// Precio: $%.0f", this.getPrecio());
		
		return str;
	}
}
