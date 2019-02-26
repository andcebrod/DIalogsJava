package es.studium.Ejercicio1;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Button;
public class Ejercicio1 extends Frame implements WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L;
	Label etiqueta = new Label("Celsius");
	TextField Celsius = new TextField(5);
	Label etiqueta2 = new Label("Fahrenheit");
	TextField Fahrenheit = new TextField(5);
	Button btnCelFah = new Button(" Celsius a Fahrenheit ");
	Button btnFahCel = new Button(" Fahrenheit a Celsius ");
	public Ejercicio1()
	{
		
		setLayout(new GridLayout(3,2));
		setTitle("Conversión de temperaturas");
		add(etiqueta);
		add(Celsius);
		add(etiqueta2);
		add(Fahrenheit);
		add(btnCelFah);
		add(btnFahCel);
		setSize(450,150);
		addWindowListener(this);
		btnCelFah.addActionListener(this);
		btnFahCel.addActionListener(this);
		setVisible(true);
	}
	

	
	public static void main(String[] args)
	{
		new Ejercicio1();
		
	}



	@Override
	public void windowActivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowClosed(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowClosing(WindowEvent arg0)
	{
		System.exit(0);
		
	}



	@Override
	public void windowDeactivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowDeiconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowIconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowOpened(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}



	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub
		
		Object botonPulsado = arg0.getSource();
		if(botonPulsado.equals(btnCelFah)) {
			
			float valor = Float.parseFloat(Celsius.getText());
			float resultado = (float)((valor * 9.0/5.0) +32.0);
			Fahrenheit.setText(resultado+"");
			
		}
		else {
			
			float valor = Float.parseFloat(Fahrenheit.getText());
			float resultado = (float)((valor -32.0)*5.0/9.0);
			Celsius.setText(resultado+"");
			
		}
	}
}