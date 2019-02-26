package es.studium.Vehiculos;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Vehiculos extends Frame implements WindowListener,
ActionListener, ItemListener
{
	private static final long serialVersionUID = 1L;

	Panel panel1 = new Panel();
	Panel panel2 = new Panel();
	Panel panel3 = new Panel();
	Panel panel4 = new Panel();
	Label etiqueta = new Label ("¿Tipo de motorización?");
	CheckboxGroup grupoMotor = new CheckboxGroup();
	Checkbox uno = new Checkbox(" Gasolina", false, grupoMotor);
	Checkbox dos = new Checkbox("Diésel", false, grupoMotor);
	Checkbox tres = new Checkbox("Hibrido", false, grupoMotor);
	Checkbox cuatro = new Checkbox("Eléctrico", false, grupoMotor);
	Label etiqueta2 = new Label("¿Número de puertas?" );
	CheckboxGroup grupoPuertas = new CheckboxGroup();
	Checkbox cinco = new Checkbox("3 puertas", false, grupoPuertas);
	Checkbox seis = new Checkbox("4 puertas", false, grupoPuertas);
	Checkbox siete = new Checkbox("5 puertas", false, grupoPuertas);
	Label etiqueta3 = new Label("¿Pintura Metalizada?" );
	CheckboxGroup grupoMetal = new CheckboxGroup();
	Checkbox ocho = new Checkbox("Si", false, grupoMetal);
	Checkbox nueve = new Checkbox("No", false, grupoMetal);
	Button btnAceptar = new Button("Aceptar");
	int resultado = 0;
	
	public Vehiculos()
	{
		setLayout(new FlowLayout());
		setTitle("Vehículos");
		panel1.add(etiqueta);
		panel1.add(uno);
		panel1.add(dos);
		panel1.add(tres);
		panel1.add(cuatro);
		add(panel1);
		panel2.add(etiqueta2);
		panel2.add(etiqueta2);
		panel2.add(cinco);
		panel2.add(seis);
		panel2.add(siete);
		add(panel2);
		panel3.add(etiqueta3);
		panel3.add(ocho);
		panel3.add(nueve);
		add(panel3);
		panel3.add(btnAceptar);
		add(panel4);
		setSize(450,250);
		addWindowListener(this);
		btnAceptar.addActionListener(this);
		
		
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Vehiculos();
	}
	public void itemStateChanged(ItemEvent arg0) 
	{
		
	}
	public void actionPerformed(ActionEvent arg0) 
	{
		if(uno.getState()==true) {
			resultado = resultado +8000;
		}
		if(dos.getState()==true) {
			resultado = resultado +7000;
		}
		if(tres.getState()==true) {
			resultado = resultado +9000;
		}
		if(cuatro.getState()==true) {
			resultado = resultado +8500;
		}
		if(cinco.getState()==true) {
			resultado = resultado +2000;
		}
		if(seis.getState()==true) {
			resultado = resultado +3000;
		}
		if(siete.getState()==true) {
			resultado = resultado +2500;
		}
		if(ocho.getState()==true) {
			resultado = resultado+1500;
		}
		if(nueve.getState()==true) {
			resultado = resultado;
		}
		System.out.println("El presupuesto ascenderá a "+resultado);
		resultado = 0;
	}
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) 
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
}