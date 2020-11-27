package classes;

public class Bebida extends Producto{
	
	public Bebida(String nombre, Float cantidad, Float precio) {
		super(nombre,cantidad,precio);
	}
	
	@Override
	public String toString() {
		String str = super.toString();
		str += String.format(" /// Litros: %.1f", this.getCantidad());
		str += String.format(" /// Precio: $%.0f", this.getPrecio());
		
		return str;
	}
}
