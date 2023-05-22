package repasoM03.ejemploPackage.tema1.ejer1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 */
public class Ejemplo3Numeros {

	public static void main(String[] args) {
		
		System.out.println("Introduce 3 valores decimales para poder operar con ellos:");
		
		// Guardo el metodo dentro de un array para poder obtener los 3 valores y poder utilizarlos en las demas funciones
		double[] valoresUsuario = FuncionesMatematicas.pedir3valores();
		
		boolean control = true;
		
		while(control) {
			

			System.out.println("Menú:\n"
							+ "0 - Salir.\n"
							+ "1 - Multiplicar los 3 valores.\n"
							+ "2 - Sumar los 3 valores.\n"
							+ "3 - Mostrar si el 1er valor es mayor que el 2o.\n"
							+ "4 - Comprobar si los 3 numeros son iguales.\n"
							+ "5 - Comprobar si el primer número es multiplo de 2.\n");
			
			int opc;
			
			try {
				// Utilizo la clase BufferedReader para leer y guardar la opcion introducida por el usuario
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				// Leo y guardo la opcion introducida por el usuario
				opc = Integer.parseInt(br.readLine());
				
				// Compruebo que la opcion escogida este dentro del rango valido
				if (opc < 0 || opc > 6) {
					System.out.println("Estas fuera del rango numérico permitido.");
					continue; // Si el valor introducido esta fuera del rango volvemos a empezar la iteracion
 				}
				
			// Con una estructura de seleccion gestiono las diferentes opciones
			switch(opc) {
				case 0:
					control = false;
					System.out.println("Gracias por utilizar el programa. :-) ");
				break;
			
				case 1:
					FuncionesMatematicas.multiplicarLos3(valoresUsuario);
				break;
			
				case 2:
					FuncionesMatematicas.sumar3Valores(valoresUsuario);
				break;
				
				case 3:
					FuncionesMatematicas.comprobarPrimerValorEsMayorQueSegundoValor(valoresUsuario);
				break;
				
				case 4:
					FuncionesMatematicas.comprobarSiLos3NumerosSonIguales(valoresUsuario);
				break;
				
				case 5:
					FuncionesMatematicas.comprobarSiElPrimerValorEsMultiploDe2(valoresUsuario);
				break;

			}
				
				
			}catch(NumberFormatException nfe) {
				System.out.println("Debes introducir valores numéricos.");
			}catch(IOException e) {
				System.out.println("Ocurrio un error!!");
			}
			
			
			
			
		}
		
		
	}
	
}
