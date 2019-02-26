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
		
		//Caracter�sticas de la ventana 
		this.setTitle("Interfaz grafico provincias");
		this.setLayout(new FlowLayout());
		this.setSize(500,400);
		chcListaDesplegable.add("(Elige una provincia)");
		chcListaDesplegable.add("�lava");
		chcListaDesplegable.add("Albacete");
		chcListaDesplegable.add("Alicante");
		chcListaDesplegable.add("Almer�a");
		chcListaDesplegable.add("Asturias");
		chcListaDesplegable.add("�vila");
		chcListaDesplegable.add("Badajoz");
		chcListaDesplegable.add("Barcelona");
		chcListaDesplegable.add("Burgos");
		chcListaDesplegable.add("C�ceres");
		chcListaDesplegable.add("C�diz");
		chcListaDesplegable.add("Cantabria");
		chcListaDesplegable.add("Castell�n");
		chcListaDesplegable.add("Ciudad Real");
		chcListaDesplegable.add("C�rdoba");
		chcListaDesplegable.add("La Coru�a");
		chcListaDesplegable.add("Cuenca");
		chcListaDesplegable.add("Gerona");
		chcListaDesplegable.add("Granada");
		chcListaDesplegable.add("Guadalajara");
		chcListaDesplegable.add("Guip�zcoa");
		chcListaDesplegable.add("Huelva");
		chcListaDesplegable.add("Huesca");
		chcListaDesplegable.add("Baleares");
		chcListaDesplegable.add("Ja�n");
		chcListaDesplegable.add("Le�n");
		chcListaDesplegable.add("L�rida");
		chcListaDesplegable.add("Lugo");
		chcListaDesplegable.add("Madrid");
		chcListaDesplegable.add("M�laga");
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
		if("�lava".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Alav�s\nFemenino: Alavesa";
		}
		if("Albacete".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Albacete�o\nFemenino: Albacete�a";
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
		if("�vila".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Avil�s\nFemenino: Avilesa";
		}
		if("Badajoz".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Pacense\nFemenino: Pacensa";
		}
		if("Barcelona".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Barcelon�s\nFemenino: Barcelonesa";
		}
		if("Bilbao".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Bailbaino\nFemenino: Bilbaina";
		}
		if("Burgos".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Burgla�s\nFemenino: Burgalesa";
		}
		if("C�ceres".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Cacere�o\nFemenino: Cacere�a";
		}
		if("C�diz".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Gaditano\nFemenino: Gaditana";
		}
		if("Cantabria".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: C�ntabro\nFemenino: C�ntabra";
		}
		if("Castell�n".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Castellonense\nFemenino: Castellonesa";
		}
		if("Ciudad Real".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Ciudadreale�o\nFemenino: Ciudadreale�a";
		}
		if("C�rdoba".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Cordob�s\nFemenino: Cordobesa";
		}
		if("La Coru�a".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Coru�es\nFemenino: Coru�esa";
		}
		if("Cuenca".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Cuencano\nFemenino: Cuencana";
		}
		if("Gerona".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Giron�s\nFemenino: Gironesa";
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
		if("Ja�n".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Jienense\nFemenino: Jienensa";
		}
		if("Le�n".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Leon�s\nFemenino: Leonesa";
		}
		if("L�rida".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Ilerdense\nFemenino: Ilerdensa";
		}
		if("Lugo".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Lucense\nFemenino: Lucensa";
		}
		if("Madrid".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Madrile�o\nFemenino: Madrile�a";
		}
		if("M�laga".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Malage�o\nFemenino: Malague�a";
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
			resultado = "Masculino: Pontevedr�s\nFemenino: Pontevedresa";
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
			resultado = "Masculino: Tarragon�s\nFemenino: Tarragonesa";
		}
		if("Santa Cruz de Tenerife".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Tinerfe�o\nFemenino: Tinerfe�a";
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
			resultado = "Masculino: Vizca�no\nFemenino: Vizca�na";
		}
		if("Zamora".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Zamorano\nFemenino: Zamorana";
		}
		if("Zaragoza".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Zaragozano\nFemenino: Zaragozana";
		}
		if("Ceuta".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Ceut�\nFemenino: Ceutisa";
		}
		if("Melilla".equals(chcListaDesplegable.getSelectedItem())) {
			resultado = "Masculino: Melill�s\nFemenino: Melillesa";
		}
		System.out.println(resultado);
	}
}
