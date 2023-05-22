package repasoM03.ejemploPackage.tema1.ejer1;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 */
public class FuncionesMatematicas {

	public static double[] pedir3valores() {
		// Array para guardar 3 valores introducidos por el usuario
		double[] valores = new double[3];
		
		try {
			// Utilizando la clase escaner podre recoger los valores introducidos por el usuario
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce el primer valor:");
			// Primer valor
			double valor1 = sc.nextDouble();
			System.out.println("Introduce el segundo valor:");
			// Segundo valor
			double valor2 = sc.nextDouble(); 
			System.out.println("Introduce el tercer valor:");
			double valor3 = sc.nextDouble();
			
			// Introduzco los valores en el array
			valores[0] = valor1;
			valores[1] = valor2;
			valores[2] = valor3;
			
			// Recorro y muestro los valores introducidos por el usuario
			System.out.println("Valores introducidos:");
			
			for(int i = 0; i < valores.length; i++) {
				System.out.println("Valor -> " + i + ": " + valores[i]);
			}
			
			
		} catch(InputMismatchException e) { // Con la excepcion InputMismatchException controlo si el usuario no introduce un valor numerico
			System.out.println("Debes introducir valores decimales.");
		}
		
		return valores;
		
	}
	
	/**
	 * Metodo para poder multiplicar los 3 primeros valores de un array de decimales
	 * @param valores -> Numeros decimales
	 */
	public static void multiplicarLos3(double[] valores) {
		// Multiplico cada valor dentro del array
		double resultado = valores[0] * valores[1] * valores[2];
		// Muestro el resultado por consola
		System.out.println("El resultado de mutiplicar " + valores[0] + " x " + valores[1] + " x " + valores[2] + " es " + resultado + ".");
		
	}
	
	/**
	 * Metodo para sumar los 3 valores contenidos en un array de tipo double
	 * @param valores -> Array de decimales
	 */
	public static void sumar3Valores(double[] valores) {
		
		double resultado = valores[0] + valores[1] + valores[2];
		
		System.out.println("El resultado de sumar los 3 valores es : " + resultado + ".");
		
	}
	
	/**
	 * Metodo para comprobar si el primer valor de un array de decimales es mayor que el segundo valor
	 * @param valores -> Array de decimales
	 */
	public static void comprobarPrimerValorEsMayorQueSegundoValor(double[] valores) {
		// Compruebo si el primer valor es MAYOR al segundo valor del array
		if (valores[0] > valores[1]) {
			System.out.println("Correcto " + valores[0] + " es mayor que " + valores[1] + ".");
		} else {
			System.out.println("Falso " + valores[0] + " NO es mayor que " + valores[1] + ".");
		}
		
	}
	
	/**
	 * Metodo para comprobar si los 3 valores de un array de tipo double son iguales 
	 * @param valores -> Array de numeros decimales
	 */
	public static void comprobarSiLos3NumerosSonIguales(double[] valores) {
		// Compruebo si son iguales los 3 valores comparando los 2 ultimos valores con el primero
		if (valores[0] == valores[1] && valores[0] == valores[2]) {
			System.out.println("Los 3 valores son iguales.");
			
		} else {
			System.out.println("Los 3 valores NO son iguales.");
		}
	}
	
	public static void comprobarSiElPrimerValorEsMultiploDe2(double[] valores) {
		if (valores[0] % 2 == 0) {
			System.out.println("El número " + valores[0] + " es multiplo de 2.");
		}else {
			System.out.println("El número " + valores[0] + " NO es multiplo de 2.");
		}
	}
	
}
