package TrabajoIntegrador4tobim;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TrabajoIntegrador4tobim {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		boolean salir = false;
		int Menu;
		char decision;

		try {

			while (salir == false) {
				System.out.println("Elija que operacion desea realizar? Suma,Resta,Multiplicacion o Dividir?");
				Menu = entrada.nextInt();
				switch (Menu) {

				case 1:
					int suma, numeros, numeros2;

					System.out.println("Eligio sumar, ahora digame que numero desea sumar?");
					numeros = entrada.nextInt();

					System.out.println("Elija el otro numero para sumar? ");
					numeros2 = entrada.nextInt();

					suma = numeros + numeros2;

					System.out.println("La suma total de los 2 numeros es de: " + suma);

					System.out.println("Desea salir?");
					decision = entrada.next().toLowerCase().charAt(0);

					if (decision == 's') {
						System.out.println("Hasta luego entonces!");
						salir = true;
					}

					break;

				case 2:
					int num1, num2, Resta;

					System.out.println("Eligio resta, ahora digame que numero desea restar?");
					num1 = entrada.nextInt();

					System.out.println("Digame el otro numero que desea restar? ");
					num2 = entrada.nextInt();

					Resta = num1 - num2;

					System.out.println("El resultado de la resta es de: " + Resta);

					System.out.println("Desea salir?");
					decision = entrada.next().toLowerCase().charAt(0);

					if (decision == 's') {
						System.out.println("Hasta luego entonces!");
						salir = true;
					}

					break;

				case 3:

					int nume1, nume2, Multi;

					System.out.println("Eligio multiplicacion, ingrese el primer numero : ");
					nume1 = entrada.nextInt();

					System.out.println("Ingrese el numero 2 :");
					nume2 = entrada.nextInt();

					Multi = nume1 * nume2;

					System.out.println("El resultado de la Multiplicacion : " + Multi);

					System.out.println("Desea salir?");
					decision = entrada.next().toLowerCase().charAt(0);

					if (decision == 's') {
						System.out.println("Hasta luego entonces!");
						salir = true;
					}

					break;

				case 4:

					int digito1, digito2, Division;

					System.out.println("Elgio division, ingrese el primer numero :");
					digito1 = entrada.nextInt();

					System.out.println("Ingrese el segundo numero: ");
					digito2 = entrada.nextInt();

					if (digito1 == 0 || digito2 == 0) {

						System.out.println("No se puede dividir por cero ");

						System.out.println("Elgiio division, ingrese el primer numero :");
						digito1 = entrada.nextInt();

						System.out.println("Ingrese el segundo numero: ");
						digito2 = entrada.nextInt();

					}

					Division = digito1 / digito2;

					System.out.println("El reusultado de la division es: " + Division);

					System.out.println("Desea salir?");
					decision = entrada.next().toLowerCase().charAt(0);

					if (decision == 's') {
						System.out.println("Hasta luego entonces!");
						salir = true;
					}

					break;

				}

			}
		} catch (ArithmeticException e) {
			System.out.println("Error");
		} catch (InputMismatchException e ) {
          System.out.println("Error tienes que ingresar un dato valido");
		} finally {
	       System.out.println("Programa finalizado ");
		}

	}
}