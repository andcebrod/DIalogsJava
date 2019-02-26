package es.studium.Ejercicio2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
	
	public class Ejercicio2 extends Frame implements WindowListener, ActionListener
	{
		private static final long serialVersionUID = 1L;
		Label etiqueta = new Label("Cantidad: ");
		TextField txtCantidad = new TextField(5);
		Label etiqueta2 = new Label("Porcentaje :");
		TextField txtPorcentaje = new TextField(5);
		Button btnCalcular = new Button("Calcular IVA");
		TextField txtResultado = new TextField(5);
		
		public Ejercicio2()
		{
			setLayout(new GridLayout(4,2));
			txtResultado.setEnabled(false);
			setTitle("Calculador de Iva");
			add(etiqueta);
			add(txtCantidad);
			add(etiqueta2);
			add(txtPorcentaje);
			add(btnCalcular);
			add(txtResultado);
			setSize(450,150);
			addWindowListener(this);
			btnCalcular.addActionListener(this);
			setVisible(true);
		}
		public static void main(String[] args) {
			new Ejercicio2();
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			double cantidad = Double.parseDouble(txtCantidad.getText());
			
			int iva = Integer.parseInt(txtPorcentaje.getText());
			
			double resultado = cantidad * (iva/100.0);
			
			txtResultado.setText(resultado+"");
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
}
