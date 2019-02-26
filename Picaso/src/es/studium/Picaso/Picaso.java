package es.studium.Picaso;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Picaso extends Frame{
	
	private static final long serialVersionUID = 1L;
	Panel pnlPanel = new Panel();
	Panel pnlPanel2 = new Panel();
	Panel pnlPanel3 = new Panel();
	Panel pnlPanel4 = new Panel();
	Panel pnlPanel5 = new Panel();
	
	Button btnBoton0 = new Button("Boton0");
	Button btnBoton1 = new Button("Boton1");
	Button btnBoton2 = new Button("Boton2");
	Button btnBoton3 = new Button("Boton3");
	Button btnBoton4 = new Button("Boton4");
	Button btnBoton5 = new Button("Boton5");
	Button btnBoton6 = new Button("Boton6");
	Button btnBoton7 = new Button("Boton7");
	Button btnBoton8 = new Button("Boton8");
	Button btnBoton9 = new Button("Boton9");
	
	
	Picaso(String t) {
		this.setTitle(t);
		this.setLayout(new GridLayout(5,1));
		this.setSize(350,300);
		pnlPanel.add(btnBoton0);
		pnlPanel.add(btnBoton1);
		pnlPanel.add(btnBoton2);
		pnlPanel.add(btnBoton3);
		pnlPanel.setLayout(new GridLayout(1,4));
		this.add(pnlPanel);
		
		pnlPanel2.add(btnBoton4);
		pnlPanel2.setLayout(new GridLayout(1,4));
		this.add(pnlPanel2);
		
		
		pnlPanel3.add(btnBoton5);
		pnlPanel3.add(btnBoton6);
		pnlPanel3.setLayout(new GridLayout(1,4));
		this.add(pnlPanel3);
		
		
		
		
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Picaso("Picaso");
		
		
	}

}
