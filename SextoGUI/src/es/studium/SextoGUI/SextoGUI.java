package es.studium.SextoGUI;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class SextoGUI {

	Frame miVentana = new Frame();
	SextoGUI(){
		miVentana.setLayout(new GridLayout(6,5));
		miVentana.setTitle("Sexto GUI");
		miVentana.setSize(300,200);
		for (int i=0;i<30;i++) {
			miVentana.add(new Panel().add(new Button(i+"")));
		}
		miVentana.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SextoGUI();
	}
}
