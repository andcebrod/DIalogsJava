package es.studium.Pantalla1;

import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;

public class Pantalla1 extends Frame{

	private static final long serialVersionUID = 1L;
	
	Label lblEtiqueta = new Label("Seleccionar");
	Choice chcListaDesplegable = new Choice();
	Button btnBotonMas = new Button("+");
	Button btnBotonMenos = new Button("-");
	TextArea txaTexto = new TextArea(5,20);
	Button btnBotonAceptar = new Button("Aceptar");
	Button btnBotonCancelar = new Button("Cancelar");
	
	Panel pnlPanel = new Panel();
	Panel pnlPanel2 = new Panel();
	Panel pnlPanel3 = new Panel();
	Panel pnlPanel4 = new Panel();
	
	Pantalla1(String t){
		this.setTitle(t);
		this.setLayout(new GridLayout(4,1));
		this.setSize(250,300);
		pnlPanel.setLayout(new FlowLayout());
		pnlPanel2.setLayout(new FlowLayout());
		pnlPanel3.setLayout(new FlowLayout());
		pnlPanel4.setLayout(new FlowLayout());
		
		pnlPanel.add(lblEtiqueta);
		chcListaDesplegable.add("(Elige una opción)");
		chcListaDesplegable.add("Teclado");
		chcListaDesplegable.add("Ratón");
		chcListaDesplegable.add("Pantalla");
		chcListaDesplegable.add("Torre");
		chcListaDesplegable.add("Cables");
		pnlPanel.add(chcListaDesplegable);
		this.add(pnlPanel);
		
		pnlPanel2.add(btnBotonMas);
		pnlPanel2.add(btnBotonMenos);
		this.add(pnlPanel2);
		
		pnlPanel3.add(txaTexto);
		this.add(pnlPanel3);
		
		pnlPanel4.add(btnBotonAceptar);
		pnlPanel4.add(btnBotonCancelar);
		this.add(pnlPanel4);
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Pantalla1("Pantalla 1");
	}

}
