package questao01;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * Classe Principal.
 */
public class Principal {

	/**
	 *  metodo main.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Asterisco asterico = new Asterisco();

		System.out.print("Escreva o valor de N: ");
		int n = scanner.nextInt();
		asterico.mostrarEscada(n);
		

		scanner.close();

	}

}


