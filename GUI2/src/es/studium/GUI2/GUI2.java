package es.studium.GUI2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class GUI2 extends Frame{
	
	private static final long serialVersionUID = 1L;
	Label lblCalculadora = new Label("Iniciar Sesión");
	Label lblEuros = new Label("Correo Electrónico: ");
	Label lblPesetas = new Label("Contraseña:              ");
	
	
	Label lblOlvidePass = new Label ("Olvidé la contraseña");
	
	TextField txtEuros = new TextField(10);
	TextField txtPesetas = new TextField(10);
	Button btnBotonTransformar = new Button("Iniciar Sesión");
	Button caca = new Button("Limpiar");
	Panel pnlPanel = new Panel();
	Panel pnlPanel2 = new Panel();
	Panel pnlPanel3 = new Panel();
	Panel pnlPanel4 = new Panel();
	Panel pnlPanel5 = new Panel();
	
	GUI2(String t){
		this.setTitle(t);
		this.setLayout(new GridLayout(5,1));
		this.setSize(300,200);
		pnlPanel.setLayout(new FlowLayout());
		pnlPanel2.setLayout(new FlowLayout());
		pnlPanel3.setLayout(new FlowLayout());
		pnlPanel4.setLayout(new FlowLayout());
		pnlPanel5.setLayout(new FlowLayout());
		
		pnlPanel.add(lblCalculadora);
		this.add(pnlPanel);
		
		pnlPanel2.add(lblEuros);
		pnlPanel2.add(txtEuros);
		this.add(pnlPanel2);
		
		pnlPanel3.add(lblPesetas);
		pnlPanel3.add(txtPesetas);
		this.add(pnlPanel3);
		
		pnlPanel4.add(btnBotonTransformar);
		pnlPanel4.add(caca);
		this.add(pnlPanel4);
		
		pnlPanel5.add(lblOlvidePass);
		this.add(pnlPanel5);
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		
		new GUI2("GUI 2");
	
	}
}
