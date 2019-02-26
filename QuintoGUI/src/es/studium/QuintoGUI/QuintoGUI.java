package es.studium.QuintoGUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class QuintoGUI extends Frame implements WindowListener, ActionListener{

	Button btnNorte = new Button("Norte");
	Button btnSur = new Button("Sur");
	Button btnEste = new Button("Este");
	Button btnOeste = new Button("Oeste");
	Button btnCentro = new Button("Centro");

	
	private static final long serialVersionUID = 1L;
	QuintoGUI(){
		this.setLayout(new BorderLayout());
		this.setTitle("Quinto GUI");
		this.setSize(300,200);
		this.add(btnSur,"South");
		this.add(btnNorte,"North");
		this.add(btnEste,"East");
		this.add(btnCentro,"Center");
		this.add(btnOeste,"West");
		addWindowListener(this);
		btnNorte.addActionListener(this);
		btnSur.addActionListener(this);
		btnEste.addActionListener(this);
		btnOeste.addActionListener(this);
		btnCentro.addActionListener(this);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new QuintoGUI();
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
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
		if(ae.getSource().equals(btnNorte)) 
		{
			System.out.println("Has pulsado el Norte.");
		}
		if(ae.getSource().equals(btnSur)) 
		{
			System.out.println("Has pulsado el Sur.");
		}
		if(ae.getSource().equals(btnEste)) 
		{
			System.out.println("Has pulsado el Este.");
		}
		if(ae.getSource().equals(btnOeste)) 
		{
			System.out.println("Has pulsado el Oeste.");
		} 
		if(ae.getSource().equals(btnCentro)) 
		{
			System.out.println("Has pulsado el Centro");
		}
	}
}
