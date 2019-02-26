package es.studium.Aficiones;
import java.awt.Checkbox;
import java.awt.Dialog;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Aficiones extends Frame  implements WindowListener,
ActionListener, ItemListener
{
	private static final long serialVersionUID = 1L;
	Checkbox correr = new Checkbox("Correr");
	Checkbox nadar = new Checkbox("Nadar");
	Checkbox andar = new Checkbox("Andar");
	Checkbox leer = new Checkbox("Leer");
	Checkbox cine = new Checkbox("Ir al Cine");
	Checkbox bailar = new Checkbox("Bailar");
	Checkbox futbol = new Checkbox("Fútbol");
	Checkbox tenis = new Checkbox("Tenis");
	Checkbox baloncesto = new Checkbox("Baloncesto");
	Checkbox vela = new Checkbox("Deportes de Vela");
	Button btnAceptar = new Button("Aceptar");
	Dialog dlgUno = new Dialog(this, "Diálogo con mensaje", true);
	TextArea txtAficiones = new TextArea (10,30);
	public Aficiones()
	{
		setLayout(new FlowLayout());
		setTitle("Aficiones");
		add(correr);
		add(nadar);
		add(leer);
		add(cine);
		add(bailar);
		add(futbol);
		add(baloncesto);
		add(tenis);
		add(vela);
		add(andar);
		add(btnAceptar);
		setSize(350,150);
		dlgUno.setSize(500,300);
		dlgUno.setLayout(new FlowLayout());
		dlgUno.add(txtAficiones);
		
		//Listeners
		btnAceptar.addActionListener(this);
		addWindowListener(this);
		dlgUno.addWindowListener(this);

		correr.addItemListener(this);
		nadar.addItemListener(this);
		leer.addItemListener(this);
		cine.addItemListener(this);
		bailar.addItemListener(this);
		futbol.addItemListener(this);
		baloncesto.addItemListener(this);
		tenis.addItemListener(this);
		vela.addItemListener(this);
		andar.addItemListener(this);
		
		
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Aficiones();
	}
	public void actionPerformed(ActionEvent ae) 
	{
		dlgUno.setVisible(true);
	}
	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent wc) {}
	public void windowClosing(WindowEvent wcl) 
	{
		if(dlgUno.isActive())
		{
			dlgUno.setVisible(false);
			txtAficiones.setText("");
		}
		else
		{
			System.exit(0);
		}
	}
	
	public void windowDeactivated(WindowEvent wd) {}
	public void windowDeiconified(WindowEvent wdei) {}
	public void windowIconified(WindowEvent wi) {}
	public void windowOpened(WindowEvent wo) {}
	public void itemStateChanged(ItemEvent ie) 
	{
		//Comparamos mediante equals, una cadena con el elemento
		//que produjo el evento mediante getItem()
		if("Correr".equals(ie.getItem()))
		{
			if(ie.getStateChange()==ItemEvent.SELECTED)
			{
				txtAficiones.setText( txtAficiones.getText()+" "+correr.getLabel());
			}
				
				
		}
		else if("Nadar".equals(ie.getItem()))
		{
			if(ie.getStateChange()==ItemEvent.SELECTED)
			{
				txtAficiones.setText(txtAficiones.getText()+" "+nadar.getLabel()+" ");
			}

		}
		else if("Leer".equals(ie.getItem()))
		{
			if(ie.getStateChange()==ItemEvent.SELECTED)
			{
				txtAficiones.setText(txtAficiones.getText()+" "+leer.getLabel()+" ");
			}
				
		}
		else if("Ir al Cine".equals(ie.getItem()))
		{
			if(ie.getStateChange()==ItemEvent.SELECTED)
			{
				txtAficiones.setText(txtAficiones.getText()+" "+cine.getLabel()+" ");
			}
				
			
		}
		else if("Bailar".equals(ie.getItem()))
		{
			if(ie.getStateChange()==ItemEvent.SELECTED)
			{
				txtAficiones.setText(txtAficiones.getText()+" "+bailar.getLabel()+" ");
			}
				
	
		}
		else if("Fútbol".equals(ie.getItem()))
		{
			if(ie.getStateChange()==ItemEvent.SELECTED)
			{
				txtAficiones.setText(txtAficiones.getText()+" "+futbol.getLabel()+" ");
			}
				
		}
		else if("Baloncesto".equals(ie.getItem()))
		{
			if(ie.getStateChange()==ItemEvent.SELECTED)
			{
				txtAficiones.setText(txtAficiones.getText()+" "+baloncesto.getLabel()+" ");
			}
		
		}
		else if("Tenis".equals(ie.getItem()))
		{
			if(ie.getStateChange()==ItemEvent.SELECTED)
			{
				txtAficiones.setText(txtAficiones.getText()+" "+tenis.getLabel()+" ");
			}
			
		}
		else if("Deportes de Vela".equals(ie.getItem()))
		{
			if(ie.getStateChange()==ItemEvent.SELECTED)
			{
				txtAficiones.setText(txtAficiones.getText()+" "+vela.getLabel()+" ");
			}
				
		}
		else if("dar".equals(ie.getItem()))
		{
			if(ie.getStateChange()==ItemEvent.SELECTED)
			{
				txtAficiones.setText(txtAficiones.getText()+" "+andar.getLabel()+" ");
			}
			
		}
	}
}
