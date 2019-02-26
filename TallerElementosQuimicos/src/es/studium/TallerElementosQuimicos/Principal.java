package es.studium.TallerElementosQuimicos;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Principal implements WindowListener, ActionListener, TextListener 
{

	Frame ventana = new Frame ("Programa Elementos Químicos");
	MenuBar barraMenu = new MenuBar();
	Menu menuArchivo = new Menu("Archivo");
	Menu menuOperaciones = new Menu("Operaciones");

	MenuItem mniArchivoAbrir = new MenuItem("Abrir");
	MenuItem mniArchivoGuardar = new MenuItem("Guardar");
	MenuItem mniArchivoSalir = new MenuItem("Salir");

	MenuItem mniOperacionesCapaDeValencia = new MenuItem("Capa de valencia");
	MenuItem mniOperacionesTipoDeEnlace = new MenuItem("Tipo de enlace");
	
	
	public Principal() 
	{
		ventana.setLocationRelativeTo(null);
		ventana.setSize(500,300);
		ventana.setMenuBar(barraMenu);
		//Añadir a la barra de menu el menu Archivo
		menuArchivo.add(mniArchivoAbrir);
		mniArchivoAbrir.addActionListener(this);
		menuArchivo.add(mniArchivoGuardar);
		mniArchivoGuardar.addActionListener(this);
		// Añadimos un separador
		menuArchivo.addSeparator();
		menuArchivo.add(mniArchivoSalir);
		mniArchivoSalir.addActionListener(this);
		
		//Añadir a la barra de menu el menu Operaciones
		menuOperaciones.add(mniOperacionesCapaDeValencia);
		mniOperacionesCapaDeValencia.addActionListener(this);
		menuOperaciones.add(mniOperacionesTipoDeEnlace);
		mniOperacionesTipoDeEnlace.addActionListener(this);
		
		barraMenu.add(menuArchivo);
		barraMenu.add(menuOperaciones);
		
	
		
		
		ventana.addWindowListener(this);
		ventana.setVisible(true);

	}

	public static void main(String[] args) 
	{

		new Principal();
	}

	@Override
	public void textValueChanged(TextEvent te) {}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		if (mniArchivoSalir.equals(ae.getSource())) 
		{
			System.exit(0);
		}
		else if(mniArchivoAbrir.equals(ae.getSource()))
		{
			FileDialog fd = new FileDialog(ventana, "Seleccionar archivo", FileDialog.LOAD);
			fd.setVisible(true);
			//Guardamos Directorio
			String ruta = fd.getDirectory();
			//Guardamos Fichero
			String fichero = fd.getFile();
			
		}
		else if(mniArchivoGuardar.equals(ae.getSource())) 
		{
			new MenuGuardar();
		}
	}

	@Override
	public void windowActivated(WindowEvent we) {}

	@Override
	public void windowClosed(WindowEvent we) {}

	@Override
	public void windowClosing(WindowEvent we) 
	{
		System.exit(0);
	}
	@Override
	public void windowDeactivated(WindowEvent wd) {}
	@Override
	public void windowDeiconified(WindowEvent wdei) {}
	@Override
	public void windowIconified(WindowEvent wi) {}
	@Override
	public void windowOpened(WindowEvent wo) {}

}
