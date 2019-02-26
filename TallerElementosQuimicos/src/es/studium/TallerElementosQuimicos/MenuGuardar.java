package es.studium.TallerElementosQuimicos;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MenuGuardar  implements WindowListener, ActionListener, TextListener {
	Frame ventanaG = new Frame ("Guardar Elemento");
	Label lblNombre = new Label("Nombre");
	
	TextField txtNombre = new TextField ("");

	Label lblProtones = new Label("Protones");
	TextField txtProtones = new TextField ("");

	Label lblNeutrones = new Label("Neutrones");
	TextField txtNeutrones = new TextField ("");

	Label lblElectrones = new Label("Electrones");
	TextField txtElectrones = new TextField ("");

	Button btnGuardar = new Button ("Guardar");
	Button btnLimpiar = new Button ("Limpiar");

	Dialog exito = new Dialog(ventanaG, "Elemento creado");
	Label lblExito = new Label("Elemento creado con éxito");

	MenuGuardar()
	{
		ventanaG.setLocationRelativeTo(null);
		ventanaG.setSize(300,200);
		ventanaG.setLayout(new GridLayout(5,2));
		
		ventanaG.add(lblNombre);
		
		ventanaG.add(txtNombre);

		ventanaG.add(lblElectrones);
		ventanaG.add(txtElectrones);

		ventanaG.add(lblProtones);
		ventanaG.add(txtProtones);

		ventanaG.add(lblNeutrones);
		ventanaG.add(txtNeutrones);

		ventanaG.add(btnGuardar);
		btnGuardar.addActionListener(this);
		ventanaG.add(btnLimpiar);
		btnLimpiar.addActionListener(this);

		ventanaG.addWindowListener(this);
		ventanaG.setVisible(true);

		exito.setLocationRelativeTo(null);
		exito.setSize(170,100);
		exito.add(lblExito);
		exito.addWindowListener(this);
		exito.setVisible(false);
		exito.setLayout(new GridLayout(1,1));

	}

	public static void main(String[] args) 
	{
		new MenuGuardar();
	}
	@Override
	public void textValueChanged(TextEvent arg0) 
	{

	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		if(btnGuardar.equals(ae.getSource())) {
			int electrones = Integer.parseInt(txtElectrones.getText());
			int protones = Integer.parseInt(txtProtones.getText());
			int neutrones = Integer.parseInt(txtNeutrones.getText());

			ElementoQuimico elm = new ElementoQuimico(electrones, protones,neutrones);
			exito.setVisible(true);
			try 
			{

				FileOutputStream fos = new FileOutputStream(txtNombre.getText()+".eq");
				BufferedOutputStream bos = new BufferedOutputStream (fos);
				//Necesitamos un objeto de la clase DataOutputStream
				ObjectOutputStream salidaO = new ObjectOutputStream(bos);

				salidaO.writeObject(elm);
				salidaO.close();
				bos.close();
				fos.close();

			}
			catch(IOException e) {
				System.out.println("Error de archivo.");
			}
		} else if(btnLimpiar.equals(ae.getSource())) {
			txtNombre.selectAll();
			txtNombre.setText("");
			txtElectrones.selectAll();
			txtElectrones.setText("");
			txtProtones.selectAll();
			txtProtones.setText("");
			txtNeutrones.selectAll();
			txtNeutrones.setText("");
		}
	}

	@Override
	public void windowActivated(WindowEvent arg0) {}
	@Override
	public void windowClosed(WindowEvent arg0) {}
	@Override
	public void windowClosing(WindowEvent arg0) {
		if(ventanaG.isActive()) {
			ventanaG.setVisible(false);
		}else {
			//System.exit(0);
		}
		if(exito.isActive()) {
			exito.setVisible(false);
		}
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {}
	@Override
	public void windowDeiconified(WindowEvent arg0) {}

	@Override
	public void windowIconified(WindowEvent arg0) {}

	@Override
	public void windowOpened(WindowEvent arg0) {}
}
