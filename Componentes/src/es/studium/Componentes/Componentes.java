package es.studium.Componentes;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;

public class Componentes extends Frame{
	private static final long serialVersionUID = 1L;
	//Crear Componentes
	Button btnBoton = new Button("Aceptar");
	Label lblEtiqueta = new Label("Esto es una etiqueta");
	TextField txtCampo = new TextField(20);
	TextArea txaTexto = new TextArea(5,20);
	Checkbox chkComprobacion = new Checkbox("Amoto");
	Checkbox chkComprobacion2 = new Checkbox("Avión");
	CheckboxGroup grupoSexo = new CheckboxGroup();
	Checkbox chkMujer = new Checkbox("Mujer",false, grupoSexo);
	Checkbox chkHombre = new Checkbox("Hombre",false, grupoSexo);
	CheckboxGroup grupoEdad = new CheckboxGroup();
	Checkbox chkMenor18 = new Checkbox("Menor 18",false, grupoEdad);
	Checkbox chkIgualMayor18 = new Checkbox("Mayor o igual 18",false, grupoEdad);
	List lstLista = new List(5,true);
	Choice chcListaDesplegable = new Choice();
	Scrollbar srcVertical = new Scrollbar(Scrollbar.VERTICAL);
	Scrollbar srcHorizontal = new Scrollbar(Scrollbar.HORIZONTAL);
	
	
	Componentes(String t){
		//Características de la ventana 
		this.setTitle(t);
		this.setLayout(new FlowLayout());
		this.setSize(500,400);
		
		//Añadir Componentes
		this.add(btnBoton);
		this.add(lblEtiqueta);
		this.add(txtCampo);
		this.add(txaTexto);
		this.add(chkComprobacion);
		this.add(chkComprobacion2);
		this.add(chkMujer);
		this.add(chkHombre);
		this.add(chkMenor18);
		this.add(chkIgualMayor18);
		//Rellenar lista
		lstLista.add("Almería");
		lstLista.add("Cádiz");
		lstLista.add("Córdoba");
		lstLista.add("Granada");
		lstLista.add("Huelva");
		lstLista.add("Jaén");
		lstLista.add("Málaga");
		lstLista.add("Murcia");
		lstLista.add("Sevilla");
		this.add(lstLista);
		//Rellenar Lista Desplegable
		chcListaDesplegable.add("(Elige una opción)");
		chcListaDesplegable.add("Almería");
		chcListaDesplegable.add("Cádiz");
		chcListaDesplegable.add("Córdoba");
		chcListaDesplegable.add("Granada");
		chcListaDesplegable.add("Huelva");
		chcListaDesplegable.add("Jaén");
		chcListaDesplegable.add("Málaga");
		chcListaDesplegable.add("Murcia");
		chcListaDesplegable.add("Sevilla");
		this.add(chcListaDesplegable);
		this.add(srcVertical);
		this.add(srcHorizontal);
		
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Componentes("Título");
	}

}
