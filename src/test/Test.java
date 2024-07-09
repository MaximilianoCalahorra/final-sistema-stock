package test;

import negocio.AlmacenABM;
import negocio.PedidoABM;
import negocio.ProductoABM;

///Clase Test:
public class Test
{
	public static void main(String[] args)
	{	
		//Test 1:
		System.out.println("Test 1:");
		System.out.println("Producto con el código #003:");
		System.out.println(ProductoABM.getInstance().traerProducto("003"));
	
		//Test 2:
		System.out.println("\nTest 2:");
		System.out.println("Almacen del Producto con el código #003:");
		System.out.println(AlmacenABM.getInstance().traerAlmacen(ProductoABM.getInstance().traerProducto("003")));
	
		//Test 3:
		System.out.println("\nTest 3:");
		System.out.println("Cantidad de productos existentes en el Almacen del Producto con el código #003: " + AlmacenABM.getInstance().traerAlmacen(ProductoABM.getInstance().traerProducto("003")).cantProductosExistentes());

		//Test 4:
		System.out.println("\nTest 4:");
		System.out.println("Pedido del Producto con el código #003:");
		System.out.println(PedidoABM.getInstance().traerPedido(ProductoABM.getInstance().traerProducto("003")));

		//Test 5:
		System.out.println("\nTest 5:");
		System.out.println("Cantidad de productos pendiente de entrega del Producto con código #003: " + PedidoABM.getInstance().calcularCantidadAPedir(ProductoABM.getInstance().traerProducto("003")));
	}
}
