package es.studium.CuartoGUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CuartoGUI implements WindowListener, ActionListener{

	Frame miVentana = new Frame();
	
	CuartoGUI(){
		miVentana.setLayout(new FlowLayout());
		miVentana.setTitle("Cuarto GUI");
		miVentana.setSize(300,200);
		
		for (int i=0;i<30;i++) {
			miVentana.add(new Button(i+""));
		}
		
		miVentana.addWindowListener(this);
		miVentana.setVisible(true);
	}
	public static void main(String[] args) {
		new CuartoGUI();
		
		
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
