package es.studium.PrimerGUI;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class PrimerGUI extends Frame implements WindowListener
{
	
	private static final long serialVersionUID = 1L;
	PrimerGUI(){
		setTitle("Primer GUI");
		setSize(300,200);
		setResizable(false);
		addWindowListener(this);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new PrimerGUI();
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Activando...");
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Cerrado...");
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Cerrando...");
		System.exit(0);
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Desactivando...");
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Restaurando...");
		
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Minimizando...");
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Abierto...");
	}
}
