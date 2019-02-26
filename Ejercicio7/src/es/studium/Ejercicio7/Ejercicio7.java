package es.studium.Ejercicio7;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Ejercicio7 extends Frame
{
	private static final long serialVersionUID = 1L;

	//En primer lugar, creamos la barra de men�
	MenuBar barraMenu = new MenuBar();
	//Crear elementos principales del men�
	Menu menuArticulos = new Menu("Art�culos");
	Menu menuClientes = new Menu("Clientes");
	Menu menuFacturas = new Menu("Facturas");
	
	//Elementos de dentro de cada men�
	MenuItem mniArticulosNuevoArticulo = new MenuItem("Nuevo Art�culo");
	MenuItem mniArticulosEliminarArticulo = new MenuItem("Eliminar Art�culo");
	MenuItem mniArticulosConsultarArticulo = new MenuItem("Consultar Art�culo");
	
	MenuItem mniClientesNuevoCliente = new MenuItem("Nuevo Cliente");
	MenuItem mniClientesEliminarCliente = new MenuItem("Eliminar Cliente");
	MenuItem mniClientesConsultarCliente = new MenuItem("Consultar Cliente");
	
	MenuItem mniFacturasNuevaFactura = new MenuItem("Nueva Factura");
	MenuItem mniFacturasConsultarFactura = new MenuItem("Consultar Factura");
	
	Ejercicio7()
	{
		//Caracter�sticas de la Ventana
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		this.setSize(400,200);
		this.setMenuBar(barraMenu);
		//Creando Men�
		menuArticulos.add(mniArticulosNuevoArticulo);
		menuArticulos.add(mniArticulosEliminarArticulo);
		menuArticulos.add(mniArticulosConsultarArticulo);
		
		menuClientes.add(mniClientesNuevoCliente);
		menuClientes.add(mniClientesEliminarCliente);
		menuClientes.add(mniClientesConsultarCliente);
		
		menuFacturas.add(mniFacturasNuevaFactura);
		menuFacturas.add(mniFacturasConsultarFactura);
		
		barraMenu.add(menuArticulos);
		barraMenu.add(menuClientes);
		barraMenu.add(menuFacturas);
		
		
		
		this.setVisible(true);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new Ejercicio7();
	}

}
