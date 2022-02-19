package questao03;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Classe Principal.
 */
public class Principal {

	/**
	 * metodo  main .
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Anagrama anagrama = new Anagrama();
		
		System.out.print("Escreva uma Palavra Qualquer: ");
		String palavra = scanner.nextLine();
		anagrama.criaVetor(palavra);
		
		System.out.println("SAIDA: "+anagrama.saida);
		
		
		scanner.close();

	}

}
