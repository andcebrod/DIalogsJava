package es.studium.TercerGUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TercerGUI extends Frame implements WindowListener, ActionListener{

	private static final long serialVersionUID = 1L;
	Button btnAceptar = new Button("Aceptar");
	Button btnCancelar = new Button("Cancelar");

	TercerGUI(){
		setLayout(new FlowLayout());
		setTitle("Tercer GUI");
		setSize(300,200);
		setResizable(false);
		add(btnAceptar);
		add(btnCancelar);
		// Añadir Listeners
		addWindowListener(this);
		btnAceptar.addActionListener(this);
		btnCancelar.addActionListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TercerGUI();
		
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
		// TODO Auto-generated method stub
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

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Pulsando...");
		if(arg0.getSource().equals(btnAceptar))
		{
			System.out.println("Se pulsó ACEPTAR");
		} else 
		{
			System.out.println("Se pulsó CANCELAR");
		}
	}
	

}
