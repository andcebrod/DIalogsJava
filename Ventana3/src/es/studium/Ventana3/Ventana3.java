package es.studium.Ventana3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class Ventana3 extends Frame{
	
	private static final long serialVersionUID = 1L;
	
	Label lblEncuesta = new Label("Encuesta");
	Label lblSexo = new Label("Sexo: ");
	CheckboxGroup grupoSexo = new CheckboxGroup();
	Checkbox chkMujer = new Checkbox("Mujer",false, grupoSexo);
	Checkbox chkHombre = new Checkbox("Hombre",false, grupoSexo);
	Label lblEdad = new Label("Edad: ");
	Choice chcListaDesplegable = new Choice();
	Label lblAficiones = new Label("Aficiones: ");
	Label lblEspacios = new Label("										");
	Checkbox chkLeer = new Checkbox("Leer");
	Checkbox chkRRSS = new Checkbox("Redes Sociales");
	Button btnBotonAceptar = new Button("Aceptar");
	Button btnBotonCancelar = new Button("Cancelar");
	
	Panel pnlPanel = new Panel();
	Panel pnlPanel2 = new Panel();
	Panel pnlPanel3 = new Panel();
	Panel pnlPanel4 = new Panel();
	Panel pnlPanel5 = new Panel();
	Panel pnlPanel6 = new Panel();
	
	Ventana3(String t){
		this.setTitle(t);
		this.setLayout(new GridLayout(6,1));
		this.setSize(350,300);
		pnlPanel.setLayout(new FlowLayout());
		pnlPanel2.setLayout(new FlowLayout());
		pnlPanel3.setLayout(new FlowLayout());
		pnlPanel4.setLayout(new FlowLayout());
		pnlPanel5.setLayout(new FlowLayout());
		pnlPanel6.setLayout(new FlowLayout());
		pnlPanel.add(lblEncuesta);
		this.add(pnlPanel);
		pnlPanel2.add(lblSexo);
		pnlPanel2.add(chkMujer);
		pnlPanel2.add(chkHombre);
		this.add(pnlPanel2);
		pnlPanel3.add(lblEdad);
		pnlPanel3.add(chcListaDesplegable);
		chcListaDesplegable.add("(Elige una opción)");
		chcListaDesplegable.add("0-10");
		chcListaDesplegable.add("11-20");
		chcListaDesplegable.add("21-40");
		chcListaDesplegable.add(">40");
		this.add(pnlPanel3);
		pnlPanel4.add(lblAficiones);
		pnlPanel4.add(lblEspacios);
		this.add(pnlPanel4);
		pnlPanel5.add(chkLeer);
		pnlPanel5.add(chkRRSS);
		this.add(pnlPanel5);
		pnlPanel6.add(btnBotonAceptar);
		pnlPanel6.add(btnBotonCancelar);
		this.add(pnlPanel6);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Ventana3("Ventana 3");

	}

}
