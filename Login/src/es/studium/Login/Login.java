package es.studium.Login;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.TextField;


public class Login extends Frame
{
	
	private static final long serialVersionUID = 1L;
	public Login()
	{
		setTitle("Ejemplo GridBagLayout");
		setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		
		//Label Acceso
		Label lblAcceso = new Label("Acceso");
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridwidth = 2;
		constraints.gridheight = 1;
		add(lblAcceso,constraints);
		
		//Label Nombre 
		Label lblNombre = new Label ("Nombre");
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		add(lblNombre, constraints);
		//TextField para Nombre
		TextField txtNombre = new TextField ();
		constraints.gridx = 2;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weighty = 1.0; 
		add(txtNombre, constraints);
		//Label Clave 
		Label lblClave = new Label ("Clave");
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		add(lblClave, constraints);
		//TextField para Clave
		TextField txtClave = new TextField ("");
		constraints.gridx = 2;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weighty = 1.0; 
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weighty = 1.0; 
		add(txtClave, constraints);
		
		//Boton Aceptar
		Button btnAceptar = new Button ("Aceptar");
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		add(btnAceptar, constraints);
		//Boton Cancelar
		Button btnCancelar = new Button ("Cancelar");
		constraints.gridx = 2;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		add(btnCancelar, constraints);
		
		
		
		
		setSize(230,150);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Login();
	}

}
