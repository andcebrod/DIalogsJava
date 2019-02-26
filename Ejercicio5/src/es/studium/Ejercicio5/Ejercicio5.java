package es.studium.Ejercicio5;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio5 extends Frame implements WindowListener,ItemListener
{
	private static final long serialVersionUID = 1L;
	Choice chcListaDesplegable = new Choice();
	String resultado = "";
	Ejercicio5(){
		
		//Características de la ventana 
		this.setTitle("Interfaz grafico provincias");
		this.setLayout(new FlowLayout());
		this.setSize(500,400);
		chcListaDesplegable.add("(Elige una provincia)");
		chcListaDesplegable.add("Álava");
		chcListaDesplegable.add("Albacete");
		chcListaDesplegable.add("Alicante");
		chcListaDesplegable.add("Almería");
		chcListaDesplegable.add("Asturias");
		chcListaDesplegable.add("Ávila");
		chcListaDesplegable.add("Badajoz");
		chcListaDesplegable.add("Barcelona");
		chcListaDesplegable.add("Burgos");
		chcListaDesplegable.add("Cáceres");
		chcListaDesplegable.add("Cádiz");
		chcListaDesplegable.add("Cantabria");
		chcListaDesplegable.add("Castellón");
		chcListaDesplegable.add("Ciudad Real");
		chcListaDesplegable.add("Córdoba");
		chcListaDesplegable.add("La Coruña");
		chcListaDesplegable.add("Cuenca");
		chcListaDesplegable.add("Gerona");
		chcListaDesplegable.add("Granada");
		chcListaDesplegable.add("Guadalajara");
		chcListaDesplegable.add("Guipúzcoa");
		chcListaDesplegable.add("Huelva");
		chcListaDesplegable.add("Huesca");
		chcListaDesplegable.add("Baleares");
		chcListaDesplegable.add("Jaén");
		chcListaDesplegable.add("León");
		chcListaDesplegable.add("Lérida");
		chcListaDesplegable.add("Lugo");
		chcListaDesplegable.add("Madrid");
		chcListaDesplegable.add("Málaga");
		chcListaDesplegable.add("Murcia");
		chcListaDesplegable.add("Navarra");
		chcListaDesplegable.add("Orense");
		chcListaDesplegable.add("Palencia");
		chcListaDesplegable.add("Las Palmas");
		chcListaDesplegable.add("Pontevedra");
		chcListaDesplegable.add("La Rioja");
		chcListaDesplegable.add("Salamanca");
		chcListaDesplegable.add("Segovia");
		chcListaDesplegable.add("Sevilla");
		chcListaDesplegable.add("Soria");
		chcListaDesplegable.add("Tarragona");
		chcListaDesplegable.add("Santa Cruz de Tenerife");
		chcListaDesplegable.add("Teruel");
		chcListaDesplegable.add("Toledo");
		chcListaDesplegable.add("Valencia");
		chcListaDesplegable.add("Valladolid");
		chcListaDesplegable.add("Vizcaya");
		chcListaDesplegable.add("Zamora");
		chcListaDesplegable.add("Zaragoza");
		chcListaDesplegable.add("Ceuta");
		chcListaDesplegable.add("Melilla");
		this.add(chcListaDesplegable);
		addWindowListener(this);
		chcListaDesplegable.addItemListener(this);
		
		this.setVisible(true);
		
		
	}
	
	

	public static void main(String[] args) 
	{
		new Ejercicio5();
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



	@Override
	public void itemStateChanged(ItemEvent e) {
		if("Álava".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Alavés\nFemenino: Alavesa";
		}
		if("Albacete".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Albaceteño\nFemenino: Albaceteña";
		}
		if("Alicante".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Alicantino\nFemenino: Alicantina";
		}
		if("Almeria".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Almeriense\nFemenino: Almeriensa";
		}
		if("Asturias".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Asturiano\nFemenino: Asturiana";
		}
		if("Ávila".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Avilés\nFemenino: Avilesa";
		}
		if("Badajoz".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Pacense\nFemenino: Pacensa";
		}
		if("Barcelona".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Barcelonés\nFemenino: Barcelonesa";
		}
		if("Bilbao".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Bailbaino\nFemenino: Bilbaina";
		}
		if("Burgos".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Burglaés\nFemenino: Burgalesa";
		}
		if("Cáceres".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Cacereño\nFemenino: Cacereña";
		}
		if("Cádiz".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Gaditano\nFemenino: Gaditana";
		}
		if("Cantabria".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Cántabro\nFemenino: Cántabra";
		}
		if("Castellón".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Castellonense\nFemenino: Castellonesa";
		}
		if("Ciudad Real".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Ciudadrealeño\nFemenino: Ciudadrealeña";
		}
		if("Córdoba".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Cordobés\nFemenino: Cordobesa";
		}
		if("La Coruña".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Coruñes\nFemenino: Coruñesa";
		}
		if("Cuenca".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Cuencano\nFemenino: Cuencana";
		}
		if("Gerona".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Gironés\nFemenino: Gironesa";
		}
		if("Granada".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Granadino\nFemenino: Granadina";
		}
		if("Guadalajara".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Caracense\nFemenino: Caracensa";
		}
		if("Guipuzcoa".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Guipuzcoano\nFemenino: Guipuzcoana";
		}
		if("Huelva".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Onubense\nFemenino: Onubensa";
		}
		if("Huesca".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Oscense\nFemenino: Oscensa";
		}
		if("Baleares".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Balear\nFemenino: Balear";
		}
		if("Jaén".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Jienense\nFemenino: Jienensa";
		}
		if("León".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Leonés\nFemenino: Leonesa";
		}
		if("Lérida".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Ilerdense\nFemenino: Ilerdensa";
		}
		if("Lugo".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Lucense\nFemenino: Lucensa";
		}
		if("Madrid".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Madrileño\nFemenino: Madrileña";
		}
		if("Málaga".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Malageño\nFemenino: Malagueña";
		}
		if("Murcia".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Murciano\nFemenino: Murciana";
		}
		if("Navarra".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Navarro\nFemenino: Navarra";
		}
		if("Orense".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Orensano\nFemenino: Orensana";
		}
		if("Palencia".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Palentino\nFemenino: Palentina";
		}
		if("Las Palmas".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Palmense\nFemenino: Palmensa";
		}
		if("Pontevedra".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Pontevedrés\nFemenino: Pontevedresa";
		}
		if("La Rioja".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Riojano\nFemenino: Riojana";
		}
		if("Salamanca".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Salamantino\nFemenino: Salamantina";
		}
		if("Segovia".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Segoviano\nFemenino: Segoviana";
		}
		if("Sevilla".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Sevillano\nFemenino: Sevillana";
		}
		if("Soria".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Soriano\nFemenino: Soriana";
		}
		if("Tarragona".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Tarragonés\nFemenino: Tarragonesa";
		}
		if("Santa Cruz de Tenerife".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Tinerfeño\nFemenino: Tinerfeña";
		}
		if("Teruel".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Turolense\nFemenino: Turolensa";
		}
		if("Toledo".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Toledano\nFemenino: Toledana";
		}
		if("Valencia".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Valenciano\nFemenino: Valenciana";
		}
		if("Valladolid".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Vallisoletano\nFemenino: Vallisoletana";
		}
		if("Sevilla".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Sevillano\nFemenino: Sevillana";
		}
		if("Vizcaya".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Vizcaíno\nFemenino: Vizcaína";
		}
		if("Zamora".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Zamorano\nFemenino: Zamorana";
		}
		if("Zaragoza".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Zaragozano\nFemenino: Zaragozana";
		}
		if("Ceuta".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Ceutí\nFemenino: Ceutisa";
		}
		if("Melilla".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Melillés\nFemenino: Melillesa";
		}
		System.out.println(resultado);
	}
}
