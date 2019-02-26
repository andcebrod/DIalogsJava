package es.studium.AwtMenu;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class AwtMenu 
{
	
	Frame ventana = new Frame ("Programa con Men�");
	//En primer lugar, creamos la barra de men�
	MenuBar barraMenu = new MenuBar();
	
	//Crear elementos principales del men�
	Menu menuArchivo = new Menu("Archivo");
	Menu menuEdicion = new Menu("Edici�n");
	
	//Elementos de dentro de cada men�
	MenuItem mniArchivoAbrir = new MenuItem("Abrir");
	MenuItem mniArchivoGuardar = new MenuItem("Guardar");
	Menu menuArchivoNuevo = new Menu("Nuevo");
	MenuItem mniArchivoNuevoDialogo = new MenuItem ("Di�logo");
	MenuItem mniArchivoNuevoVentana = new MenuItem ("Ventana");
	MenuItem mniArchivoSalir = new MenuItem("Salir");
	MenuItem mniEdicionCopiar = new MenuItem("Copiar");
	MenuItem mniEdicionCortar = new MenuItem("Cortar");
	MenuItem mniEdicionPegar = new MenuItem("Pegar");
	
	AwtMenu()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setLocationRelativeTo(null);
		ventana.setSize(200,200);
		ventana.setMenuBar(barraMenu);
		
		// Primero a menuArchivoNuevo, le a�adimos su submenus
		menuArchivoNuevo.add(mniArchivoNuevoVentana);
		menuArchivoNuevo.add(mniArchivoNuevoDialogo);
		
		// Seguimos con los elementos de archivo
		menuArchivo.add(menuArchivoNuevo);
		menuArchivo.add(mniArchivoAbrir);
		menuArchivo.add(mniArchivoGuardar);
		
		// A�adimos un separador
		menuArchivo.addSeparator();
		menuArchivo.add(mniArchivoSalir);
		
		// Y ahora a edicion los suyos
		menuEdicion.add(mniEdicionCopiar);
		menuEdicion.add(mniEdicionPegar);
		menuEdicion.add(mniEdicionCortar);
		
		// Por �ltimo agregamos los elementos archivo y edici�n a la barra
		barraMenu.add(menuArchivo);
		barraMenu.add(menuEdicion);
		ventana.setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new AwtMenu();
	}

}
