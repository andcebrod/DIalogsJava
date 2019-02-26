package es.studium.EventoCanvas;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class EventoCanvas extends Frame implements WindowListener, KeyListener
{
	private static final long serialVersionUID = 1L;
	//Variable iteradora
	int indice = 0;
	//Declaraci�n de una tabla de colores (Tipo Color)
	Color colores[] = {Color.red, Color.green, Color.blue};
	//Creaci�n del Canvas
	Canvas cvCanvas = new Canvas ( );
	public EventoCanvas()
	{
		setLayout(new FlowLayout());
		setTitle("Canvas");
		add(cvCanvas);
		setSize(300,100);
		//Obtener el foco para el canvas para que al pulsar una
		//tecla se active el evento correspondiente del canvas
		cvCanvas.requestFocus();
		//A�adir el listener al frame
		addKeyListener(this);
		addWindowListener(this);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new EventoCanvas();
	}
	//Implementar el m�todo del canvas
	public void keyTyped(KeyEvent ke)
	{

	}
	public void keyPressed(KeyEvent ke) {
		indice++;
	//Comprobamos si hemos llegado al final de la tabla colores
	if(indice==colores.length)
	{
		indice=0;
	}
	//Cambiamos el color de fondo del Frame
	setBackground(colores[indice]); 	
	}
	public void keyReleased(KeyEvent ke) {
	
	}
	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
}
