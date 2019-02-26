package es.studium.Ejercicio8;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Ejercicio8 extends Frame
{
	private static final long serialVersionUID = 1L;
	Panel pnlPanel1 = new Panel();
	Panel pnlPanel2 = new Panel();
	Panel pnlPanel3 = new Panel();
	Panel pnlPanel4 = new Panel();
	Panel pnlPanel5 = new Panel();

	//Articulo 1 
	Label lblArticulo1 = new Label("Artículo 1: ");
	TextField txtArticulo1 = new TextField(15);
	Label lblArticulo1Precio = new Label("Precio: ");
	TextField txtArticulo1Precio = new TextField(4);
	Label lblArticulo1Cantidad = new Label("Cantidad: ");
	TextField txtArticulo1Cantidad= new TextField(4);
	Button btnArticulo1 = new Button("Añadir Artículo");

	//Articulo 2 
	Label lblArticulo2 = new Label("Artículo 2: ");
	TextField txtArticulo2 = new TextField(15);
	Label lblArticulo2Precio = new Label("Precio: ");
	TextField txtArticulo2Precio = new TextField(4);
	Label lblArticulo2Cantidad = new Label("Cantidad: ");
	TextField txtArticulo2Cantidad= new TextField(4);
	Button btnArticulo2 = new Button("Añadir Artículo");
	
	//Articulo 3
	Label lblArticulo3 = new Label("Artículo 3: ");
	TextField txtArticulo3 = new TextField(15);
	Label lblArticulo3Precio = new Label("Precio: ");
	TextField txtArticulo3Precio = new TextField(4);
	Label lblArticulo3Cantidad = new Label("Cantidad: ");
	TextField txtArticulo3Cantidad= new TextField(4);
	Button btnArticulo3 = new Button("Añadir Artículo");

	//Articulo 4
	Label lblArticulo4 = new Label("Artículo 4: ");
	TextField txtArticulo4 = new TextField(15);
	Label lblArticulo4Precio = new Label("Precio: ");
	TextField txtArticulo4Precio = new TextField(4);
	Label lblArticulo4Cantidad = new Label("Cantidad: ");
	TextField txtArticulo4Cantidad= new TextField(4);
	Button btnArticulo4 = new Button("Añadir Artículo");

	//Articulo 5
	Label lblArticulo5 = new Label("Artículo 5: ");
	TextField txtArticulo5 = new TextField(15);
	Label lblArticulo5Precio = new Label("Precio: ");
	TextField txtArticulo5Precio = new TextField(4);
	Label lblArticulo5Cantidad = new Label("Cantidad: ");
	TextField txtArticulo5Cantidad= new TextField(4);
	Button btnArticulo5 = new Button("Añadir Artículo");
	
	Ejercicio8()
	{
		this.setTitle("Ejercicio 8: Facturas");
		this.setLayout(new GridLayout(5,1));
		this.setSize(600,300);
		pnlPanel1.setLayout(new FlowLayout());
		pnlPanel2.setLayout(new FlowLayout());
		pnlPanel3.setLayout(new FlowLayout());
		pnlPanel4.setLayout(new FlowLayout());
		pnlPanel5.setLayout(new FlowLayout());
		
		
		pnlPanel1.add(lblArticulo1);
		pnlPanel1.add(txtArticulo1);
		pnlPanel1.add(lblArticulo1Precio);
		pnlPanel1.add(txtArticulo1Precio);
		pnlPanel1.add(lblArticulo1Cantidad);
		pnlPanel1.add(txtArticulo1Cantidad);
		pnlPanel1.add(btnArticulo1);
		this.add(pnlPanel1);
		
		pnlPanel2.add(lblArticulo2);
		pnlPanel2.add(txtArticulo2);
		pnlPanel2.add(lblArticulo2Precio);
		pnlPanel2.add(txtArticulo2Precio);
		pnlPanel2.add(lblArticulo2Cantidad);
		pnlPanel2.add(txtArticulo2Cantidad);
		pnlPanel2.add(btnArticulo2);
		this.add(pnlPanel2);
		
		pnlPanel3.add(lblArticulo3);
		pnlPanel3.add(txtArticulo3);
		pnlPanel3.add(lblArticulo3Precio);
		pnlPanel3.add(txtArticulo3Precio);
		pnlPanel3.add(lblArticulo3Cantidad);
		pnlPanel3.add(txtArticulo3Cantidad);
		pnlPanel3.add(btnArticulo3);
		this.add(pnlPanel3);
		
		pnlPanel4.add(lblArticulo4);
		pnlPanel4.add(txtArticulo4);
		pnlPanel4.add(lblArticulo4Precio);
		pnlPanel4.add(txtArticulo4Precio);
		pnlPanel4.add(lblArticulo4Cantidad);
		pnlPanel4.add(txtArticulo4Cantidad);
		pnlPanel4.add(btnArticulo4);
		this.add(pnlPanel4);
		
		pnlPanel5.add(lblArticulo5);
		pnlPanel5.add(txtArticulo5);
		pnlPanel5.add(lblArticulo5Precio);
		pnlPanel5.add(txtArticulo5Precio);
		pnlPanel5.add(lblArticulo5Cantidad);
		pnlPanel5.add(txtArticulo5Cantidad);
		pnlPanel5.add(btnArticulo5);
		this.add(pnlPanel5);
		
		this.setVisible(true);
	}

	public static void main(String[] args) 
	{
		new Ejercicio8();
	}
}
