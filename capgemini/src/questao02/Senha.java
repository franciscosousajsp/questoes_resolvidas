package questao02;

// TODO: Auto-generated Javadoc
/**
 * Classe Senha.
 *
 * @author Francisco José
 */
public class Senha {

	/**
	 * variavel senhaIncompleta controla a quantidade de caracteres digitada pelo o usuarios .
	 * as variaveis completaSenha e Aux controla os caracteres separados 
	 * as variaveis senhaRequesitada,numeroEncontrado,maiusculaEncontrado,minusculoEncontrado,
	 * simboloEncontrado controla os critérios na criaçao da senha;
	 */

	int senhaIcompleta = 6;
	
	/**  completa senha. */
	String completaSenha;
	
	/** aux. */
	String aux;
	
	/** senha requesitada. */
	boolean senhaRequesitada = false;
	
	/** numero encontrado. */
	boolean numeroEncontrado = false;
	
	/**  maiuscula encontrado. */
	boolean maiusculaEncontrado = false;
	
	/**  minusculo encontrado. */
	boolean minusculoEncontrado = false;
	
	/**  simbolo encontrado. */
	boolean simboloEncontrado = false;

	/**
	 * Método criacaoSenha, é utilizado para concatenar duas String no caso que a senha
	 * não estiver completa, também chama o método testar senha.
	 *
	 * @param senha e o parametro da String pra criacao da senha
	 */ 
	public void criacaoSenha(String senha) {

		completaSenha = senha;
		senhaIcompleta -= senha.length();

		testaSenha(senha);
		if (aux != null) {
			String juntaString = aux.concat(completaSenha);
			senha = juntaString;
		}

		completaSenha = senha;

	}

	/**
	 * Método testaSenha é utilizado para testar todos as condições na criação da
	 * senha;.
	 *
	 * @param senha e a String recebido pelo o metodo testaSenha.
	 */
	private void testaSenha(String senha) {

		for (char s : senha.toCharArray()) {
			if (s >= '0' && s <= '9') {
				numeroEncontrado = true;
			} else if (s >= 'A' && s <= 'Z') {
				maiusculaEncontrado = true;
			} else if (s >= 'a' && s <= 'z') {
				minusculoEncontrado = true;
			} else {
				simboloEncontrado = true;
			}
		}

		if (numeroEncontrado && maiusculaEncontrado && minusculoEncontrado && simboloEncontrado) {
			senhaRequesitada = true;
		}

	}
}
