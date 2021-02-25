package prueba;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		System.out.println("Hola Mundo");
		System.out.println("Esto es un proyecto de prueba");
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		System.out.println("Hora actual: " + dateFormat.format(date));
	}
}
