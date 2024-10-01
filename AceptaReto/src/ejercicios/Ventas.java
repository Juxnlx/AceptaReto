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

		// Creamos la variable numMax como double para almacenar el número mayor del
		// array.
		double numMax = ventasBar[0];

		// Creamos la variable numMin como double para almacenar el número menor del
		// array.
		double numMin = 9999999;

		// Creamos esta variable indiceMax como int para almacenar el indice de
		// número mayor del array.
		int indiceMax = 0;

		// Creamos esta variable indiceMin como int para almacenar el indice de
		// número menor del array.
		int indiceMin = 0;

		// Creamos esta variable media como double para alamacenar las ventas de toda la
		// semana.
		double media = 0;

		// Variable en la que almacenaremos "SI" o "NO" dependiendo de si la media es
		// mayor o menor a la venta del domingo.
		String mediaSemanal = "";

		// Creamos el Scanner para pedir por teclado al usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos un for para recorrer la tabla e ir introduciendo las ventas de cada
		// dia de la semana.
		for (int i = 0; i < ventasBar.length; i++) {

			System.out.print("Introduce la venta del " + diasSemana(i) + " --> ");
			ventas = sc.nextDouble();
			ventasBar[i] = ventas;

			// Le asignamos a media la suma de todas las ventas de la semana.
			media += ventasBar[i];

			// Comprobamos una a una si la cantidad de la tabla es mayor que numMax, si es
			// así se le asigna esa cantidad de la tabla a numMax. Y el indice de ese número
			// se lo asignamos a indiceMax para luego sacar el día de la semana.
			if (ventasBar[i] > numMax) {
				numMax = ventasBar[i];
				indiceMax = i;
			}

			// Comprobamos una a una si la cantidad de la tabla es menor que numMin, si es
			// así se le asigna esa cantidad de la tabla a numMin. Y el indice de ese número
			// se lo asignamos a indiceMin para luego sacar el día de la semana.
			if (ventasBar[i] < numMin) {
				numMin = ventasBar[i];
				indiceMin = i;
			}
		}

		// A media le asignamos el total calculado anteriormente entre 6.
		media = media / 6;

		// Realizamos un ternario para comprobar si la media es mayor que la venta del
		// domingo y se almacena en mediaSemanal, "SI" o "NO".
		mediaSemanal = media > ventasBar[5] ? "NO" : "SI";

		// Imprimimos el día con mayor número de ventas, el menor y "SI" o "NO",
		// dependiendo si la media semanal es mayor que la venta del domingo.
		System.out.println(diasSemana(indiceMax) + ", " + diasSemana(indiceMin) + ", " + mediaSemanal);
		System.out.println(Arrays.toString(ventasBar));
		
		//Cierre de Scanner
		sc.close();
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
