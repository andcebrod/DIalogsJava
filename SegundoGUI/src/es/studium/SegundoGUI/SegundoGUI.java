package es.studium.SegundoGUI;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SegundoGUI  implements WindowListener{
	Frame miVentana = new Frame();
	Dialog miDialogo = new Dialog(miVentana,"Diálogo",false);
	
	SegundoGUI()
	{
		miVentana.setTitle("Segunda Ventana");
		miVentana.setSize(300,200);
		miVentana.setResizable(false);
		
		miVentana.addWindowListener(this);
		miDialogo.addWindowListener(this);
		
		miVentana.setVisible(true);
		miDialogo.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SegundoGUI();
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
		if(miDialogo.isActive())
		{
			miDialogo.setVisible(false);
		}
		else 
		{
			System.exit(0);
		}
		
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
