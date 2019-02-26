package es.studiumBlocDeNotas;

import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BlocDeNotas implements WindowListener,
ActionListener, TextListener
{

	String datos="";
	String fichero="";
	char letra;
	int vocales;
	int palabras;
	int letras;

	Frame ventana = new Frame ("Programa con Menú");
	TextArea txaTexto = new TextArea(5,20);
	//En primer lugar, creamos la barra de menú
	MenuBar barraMenu = new MenuBar();

	//Crear elementos principales del menú
	Menu menuArchivo = new Menu("Archivo");
	Menu menuEdicion = new Menu("Gestión");

	//Elementos de dentro de cada menú
	MenuItem mniArchivoAbrir = new MenuItem("Abrir");
	MenuItem mniArchivoGuardar = new MenuItem("Guardar");
	MenuItem mniArchivoNuevo = new MenuItem("Nuevo");
	MenuItem mniArchivoSalir = new MenuItem("Salir");
	MenuItem mniGestionContarPalabras = new MenuItem("Contar Palabras");
	MenuItem mniGestionContarLetras = new MenuItem("Contar letras");
	MenuItem mniGestionContarVocales = new MenuItem("Contar vocales");

	BlocDeNotas()
	{

		ventana.setLocationRelativeTo(null);
		ventana.setSize(200,200);
		ventana.setMenuBar(barraMenu);
		ventana.add(txaTexto);
		// Primero a menuArchivoNuevo, le añadimos su submenus

		// Seguimos con los elementos de archivo
		menuArchivo.add(mniArchivoNuevo);
		mniArchivoNuevo.addActionListener(this);
		menuArchivo.add(mniArchivoAbrir);
		mniArchivoAbrir.addActionListener(this);
		menuArchivo.add(mniArchivoGuardar);
		mniArchivoGuardar.addActionListener(this);

		// Añadimos un separador
		menuArchivo.addSeparator();
		menuArchivo.add(mniArchivoSalir);
		mniArchivoSalir.addActionListener(this);

		// Y ahora a edicion los suyos
		menuEdicion.add(mniGestionContarPalabras);
		mniGestionContarPalabras.addActionListener(this);
		menuEdicion.add(mniGestionContarLetras);
		mniGestionContarLetras.addActionListener(this);
		menuEdicion.add(mniGestionContarVocales);
		mniGestionContarVocales.addActionListener(this);

		// Por último agregamos los elementos archivo y edición a la barra
		barraMenu.add(menuArchivo);
		barraMenu.add(menuEdicion);
		ventana.addWindowListener(this);
		ventana.setVisible(true);

	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new BlocDeNotas();
	}
	//TEXTLISTENER
	public void textValueChanged(TextEvent te) {}

	//ACTION LISTENER
	public void actionPerformed(ActionEvent ae) 
	{
		if (mniArchivoSalir.equals(ae.getSource())) 
		{
			System.exit(0);
		}
		else if (mniArchivoNuevo.equals(ae.getSource())) 
		{
			txaTexto.selectAll();
			txaTexto.setText("");
		}
		else if(mniArchivoGuardar.equals(ae.getSource())) 
		{
			//DIALOG DE ARCHIVOS PARA BUSCAR ARCHIVO
			FileDialog fd = new FileDialog(ventana, "Seleccionar archivo", FileDialog.SAVE);
			fd.setVisible(true);
			//Guardamos Directorio
			String ruta = fd.getDirectory();
			//Guardamos Fichero
			String fichero = fd.getFile();

			try 
			{
				FileWriter fw = new FileWriter(ruta+"/"+fichero);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter salida = new PrintWriter(bw);
				txaTexto.selectAll();
				salida.print(txaTexto.getText());
				salida.close();
				bw.close();	
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error de archivo.");
			}




		}
		else if (mniArchivoAbrir.equals(ae.getSource())) 
		{
			
			FileDialog fd = new FileDialog(ventana, "Seleccionar archivo", FileDialog.LOAD);
			fd.setVisible(true);
			//Guardamos Directorio
			String ruta = fd.getDirectory();
			//Guardamos Fichero
			String fichero = fd.getFile();
			try {
			FileReader fr = new FileReader(ruta+"/"+fichero);
			//Buffer de lectura
			BufferedReader entrada = new BufferedReader(fr);
			String cadena, datos="";
			//Bucle para sacar la información del archivo
			while((cadena=entrada.readLine())!=null)
			{
				datos = datos + cadena;
				
			}
			txaTexto.setText(datos);
			
			//Cerrando clases
			entrada.close();
			fr.close();
			}
			catch(FileNotFoundException e)
			{
				System.out.println("Archivo NO encontrado");
			}
			catch(IOException i)
			{
				System.out.println("Se produjo un error de Archivo");
			}
		}
		else if(mniGestionContarVocales.equals(ae.getSource())) 
		{
			for(int i=0;i<txaTexto.getText().length();i++) 
			{
				txaTexto.getText().charAt(i);
				if(letra==('a')||letra==('e')||letra==('i')||letra==('o')||letra==('u')||letra==('á')||letra==('é')||letra==('í')||letra==('ó')||letra==('ú')) {
					vocales++;
				}
			}
		}
		else if (mniGestionContarLetras.equals(ae.getSource())) 
		{
			for(int i=0;i<txaTexto.getText().length();i++) 
			{
				txaTexto.getText().charAt(i);
				if(letra==(',')||letra==('.')||letra==(' ')||letra==('-')||letra==('_')||letra==('?')||letra==('¿')||letra==('!')||letra==('¡')||letra==('=')||letra==('+')||letra==('&')||letra==('€')||letra==('$')||letra==('%')||letra==('#')||letra==('<')||letra==('>')) {
					letras++;
				}
			}
		}
		else if (mniGestionContarPalabras.equals(ae.getSource())) 
		{
			for(int i=0;i<txaTexto.getText().length();i++) 
			{
				txaTexto.getText().charAt(i);
				if(letra==(' ')) {
					palabras++;
				}
				
			}
			palabras = palabras+1;
		}

	}

	//WINDOW LISTENER
	public void windowActivated(WindowEvent arg0) {}
	public void windowClosed(WindowEvent arg0) {}
	public void windowClosing(WindowEvent arg0) 
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent arg0) {}
	public void windowDeiconified(WindowEvent arg0) {}
	public void windowIconified(WindowEvent arg0) {}
	public void windowOpened(WindowEvent arg0) {}

}