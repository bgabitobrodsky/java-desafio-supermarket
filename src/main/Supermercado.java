package main;

import classes.*;
import java.util.Arrays;
import java.util.List;

public class Supermercado {
	
	public static void main(String[] args) {
		List<Producto> listaDeProductos = Arrays.asList(
				new Bebida("Coca-Cola Zero", 1.5f, 20f),
				new Bebida("Coca-Cola Zero", 1.5f, 18f),
				new Shampoo("Shampoo Sedal", 500f, 19f),
				new Verduleria("Frutillas", 64f, "kilo")
				);
		
		for(Producto producto : listaDeProductos){
			System.out.println(producto.toString());
		}
		
		System.out.println("=============================");
		
		System.out.println("El producto mas caro: " + listaDeProductos.stream().max(Producto::compareTo).get().getNombre());
		System.out.println("El producto mas barato: " + listaDeProductos.stream().min(Producto::compareTo).get().getNombre());
	}
	
}
