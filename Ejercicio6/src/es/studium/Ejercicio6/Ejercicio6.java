package es.studium.Ejercicio6;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;

public class Ejercicio6 extends Frame
{

	private static final long serialVersionUID = 1L;

	List lstLista = new List(18,true);

	Ejercicio6()
	{
		//Caracter�sticas de la ventana 
		this.setTitle("Interfaz grafico equipos ACB");
		this.setLayout(new FlowLayout());
		this.setSize(500,400);
		
		//Caracter�sticas de la lista y dem�s
		lstLista.add("Bar�a Lassa");
		lstLista.add("BAXI Manresa");
		lstLista.add("Caf�s Candelas Breog�n");
		lstLista.add("Delteco GBC");
		lstLista.add("Divina Seguros Joventut");
		lstLista.add("Herbalife Gran Canaria");
		lstLista.add("Iberostar Tenerife");
		lstLista.add("Kirolbet Baskonia");
		lstLista.add("Monbus Obradoiro");
		lstLista.add("Montakit Fuenlabrada");
		lstLista.add("MoraBanc Andorra");
		lstLista.add("Movistar Estudiantes");
		lstLista.add("Real Madrid");
		lstLista.add("San Pablo Burgos");
		lstLista.add("Unicaja");
		lstLista.add("Universidad Cat�lica de Murcia");
		lstLista.add("Valencia Basket");
		this.add(lstLista);
		this.setVisible(true);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new Ejercicio6();
	}

}
