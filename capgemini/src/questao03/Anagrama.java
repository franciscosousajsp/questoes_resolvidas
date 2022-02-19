package questao03;
// TODO: Auto-generated Javadoc

/**
 * Classe Anagrama.
 *
 * @author Francisco José
 */
public class Anagrama {

	/**
	 * saida. variavel que dará o resultado final do anagrama
	 */

	/**  saida. */
	int saida;

	/**
	 * Método criaVetor cria um vetor de char, e também confere se existe uma letra
	 * repetidas no vetor. dentro desse metodo há o método montandoAnagrama que
	 * recebe os parametros: vetor; j;
	 *
	 * @param palavra e parametro recebido pelo metodo criaVetor
	 */
	public void criaVetor(String palavra) {
		char vetor[] = new char[palavra.length()];
		char letra = 0;

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = palavra.charAt(i);
		}

		for (int i = 0; i < vetor.length; i++) {
			letra = palavra.charAt(i);
			for (int j = i + 1; j < vetor.length; j++) {
				if (letra == vetor[j]) {
					saida++;
					montandoAnagrama(vetor, j);

				}
			}
		}
	}

	/**
	 * método montandoAnagrama recebe os parametros para montar duas strings dentro
	 * desse há o metodo testarAnagrama que recebe essa String: string1 string2 j
	 * tamanho da string.
	 *
	 * @param vetor recebe a String ate aonde existiu uma variavel igual
	 * @param j  definir o tamanho o da String recebido pelo o metodo criaVetor
	 */
	private void montandoAnagrama(char vetor[], int j) {

		char string1;
		char string2;

		for (int i = 0; i < j; i++) {
			string1 = vetor[i];
			string2 = vetor[i + 1];

			if (testaAnagrama(string1, string2, j)) {
				saida++;
			}
		}

	}

	/**
	 * metodo testaAnagrama recebe duas String pra verificar se elas formam um
	 * anagrama .
	 *
	 * @param string1 recebe a primeira String
	 * @param string2 recebe a segunda String
	 * @param j  o tamanho da string
	 * @return o retorno true se caso as string formam anagram ou false caso não
	 *         formem
	 */
	private boolean testaAnagrama(char string1, char string2, int j) {

		int recebeChar = 0;
		for (int i = 0; i < j; i++) {
			recebeChar = recebeChar ^ string1;
		}

		for (int i = 0; i < j; i++) {
			recebeChar = recebeChar ^ string2;
		}

		return (recebeChar == 0);
	}
}
