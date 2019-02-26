package es.studium.TallerElementosQuimicos;

import java.io.Serializable;

public class ElementoQuimico implements Serializable{
	int numeroElectrones;
	int numeroProtones;
	int numeroNeutrones;
	ElementoQuimico(int e, int p, int n)
	{
		numeroElectrones = e;
		numeroProtones = p;
		numeroNeutrones = n;
	}

	void setElectrones(int e) {
		numeroElectrones = e;
	}
	void setProtones (int p) {
		numeroProtones = p;
	}
	void setNeutrones(int n) {
		numeroNeutrones = n;
	}

	int getElectrones() {
		return numeroElectrones;
	}
	int getProtones() {
		return numeroProtones;
	}
	int getNeutrones() {
		return numeroNeutrones;
	}

	int capaValencia()
	{
		int n, resultado=0;
		n = this.getElectrones();
		if((n==1)||(n==2))
		{
			resultado = n;
		}
		if((n>=3)&&(n<=10))
		{
			resultado = n - 2;
		}
		if((n>=11)&&(n<=28))
		{
			resultado = n - 10;
		}
		if(n>=29)
		{
			resultado = n - 28;
		}
		return(resultado);
	}
	// Se aplica eq1.enlace(eq2)
	String enlace(ElementoQuimico e)
	{
		String resultado = "";
		int numeroCapaValenciaE, numeroCapaValenciaF;
		numeroCapaValenciaE = e.capaValencia();
		numeroCapaValenciaF = this.capaValencia();
		if((numeroCapaValenciaE - numeroCapaValenciaF <=
				2)&&(numeroCapaValenciaE - numeroCapaValenciaF >= -2))
		{
			resultado = "Covalente";
		}
		else
		{
			resultado = "Iónico";
		}
		return(resultado);
	}



}
