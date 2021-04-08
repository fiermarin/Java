package semana1.actividad1;

import java.util.Date;

public class Principal{
	public static void main(String[ ] arg) {
		int i=3;
		int j=4;
		int suma = i+j;
		int multiplicacion = i*j;
		String myName = "Matías Fiermarín";
		Date fecha = new Date();
		System.out.println ("Yo soy: "+ myName);
		System.out.println ("Hoy es: " + fecha);
		System.out.println ("Valor de (i,j): ( " +i+","+j+")");
		System.out.println ("Suma de i+j:"+suma);
		System.out.println ("Mult de i*j:"+multiplicacion);
	}
} 