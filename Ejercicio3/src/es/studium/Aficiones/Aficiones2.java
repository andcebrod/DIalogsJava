package es.studium.Aficiones;

import java.awt.Checkbox;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Aficiones2 extends Frame implements WindowListener,
ActionListener, ItemListener
{
	String resultado = "";
	private static final long serialVersionUID = 1L;
	Checkbox uno = new Checkbox("Correr");
	Checkbox dos = new Checkbox("Nadar");
	Checkbox tres = new Checkbox("Andar");
	Checkbox cuatro = new Checkbox("Leer");
	Checkbox cinco = new Checkbox("Ir al Cine");
	Checkbox seis = new Checkbox("Bailar");
	Checkbox siete = new Checkbox("Fútbol");
	Checkbox ocho = new Checkbox("Tenis");
	Checkbox nueve = new Checkbox("Baloncesto");
	Checkbox diez = new Checkbox("Deportes de Vela");
	Button btnAceptar = new Button("Aceptar");
	public Aficiones2()
	{
		setLayout(new FlowLayout());
		setTitle("Aficiones");
		add(uno);
		add(dos);
		add(tres);
		add(cuatro);
		add(cinco);
		add(seis);
		add(siete);
		add(ocho);
		add(nueve);
		add(diez);
		add(btnAceptar);
		setSize(350,150);
		addWindowListener(this);
		btnAceptar.addActionListener(this);
		
		setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		new Aficiones2();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		resultado = "";
		if(uno.getState()==true) {
			resultado = resultado+"Correr\n";
		}
		if(dos.getState()==true) {
			resultado = resultado+"Nadar\n";
		}
		if(tres.getState()==true) {
			resultado = resultado+"Andar\n";
		}
		if(cuatro.getState()==true) {
			resultado = resultado+"Leer\n";
		}
		if(cinco.getState()==true) {
			resultado = resultado+"Ir al cine\n";
		}
		if(seis.getState()==true) {
			resultado = resultado+"Bailar\n";
		}
		if(siete.getState()==true) {
			resultado = resultado+"Futbol\n";
		}
		if(ocho.getState()==true) {
			resultado = resultado+"Tenis\n";
		}
		if(nueve.getState()==true) {
			resultado = resultado+"Baloncesto\n";
		}
		if(diez.getState()==true) {
			resultado = resultado+"Deportes de vela\n";
		}
		
		System.out.println(resultado);

	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);

	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}
}