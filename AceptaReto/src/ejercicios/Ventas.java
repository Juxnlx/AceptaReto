package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ventas {

	public static void main(String[] args) {

		// Creamos la tabla vestasBar como double para almacenar las ventas de toda la
		// semana.
		double ventasBar[] = new double[6];

		// Creamos la variable ventas para pedir las ventas de cada día de la semana
		double ventas;

		// Creamos la varible diaSemana como String para saber que dia de la semana es.
		String diaSemana = "";

		// Creamos el Scanner para pedir por teclado al usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos un for para recorrer la tabla e ir introduciendo las ventas de cada
		// dia de la semana.
		for (int i = 0; i < ventasBar.length; i++) {
			
			System.out.print("Introduce la venta del " + diasSemana(i) + " --> ");
			ventas = sc.nextDouble();
			ventasBar[i] = ventas;
		}
		
		System.out.println(Arrays.toString(ventasBar));
	}

	public static String diasSemana(int i) {
		String diaSemana = "";
		switch (i) {
		case 0:
			diaSemana = "MARTES";
			break;
		case 1:
			diaSemana = "MIERCOLES";
			break;
		case 2:
			diaSemana = "JUEVES";
			break;
		case 3:
			diaSemana = "VIERNES";
			break;
		case 4:
			diaSemana = "SABADO";
			break;
		case 5:
			diaSemana = "DOMINGO";
			break;
		}
		return diaSemana;
	}
}
