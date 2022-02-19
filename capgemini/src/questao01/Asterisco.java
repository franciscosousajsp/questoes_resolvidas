package questao01;

// TODO: Auto-generated Javadoc
/**
 * Classe Asterisco.
 *
 * @author Francisco José
 */

public class Asterisco {

	/**
	 * Método MostrarEscada, serve para montar a escada utilizando o laço FOR de
	 * acordo com os parametros recebido.
	 * 
	 * @param n é o parametro que determina o tamanho da escada
	 */

	public void mostrarEscada(int n) {
		int j;

		for (int i = 1; i <= n; i++) {
			for (j = n - i; j >= 1; j--)
				System.out.printf(" ");
			for (j = 1; j <= i; j++)
				System.out.printf("*");
			System.out.printf("\n");

		}

	}
}
