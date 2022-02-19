/*
 * 
 */
package questao02;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 *  Classe Principal.
 */
public class Principal {

	/**
	 * metodo main.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Senha senha = new Senha();

		System.out.print("Digite o seu nome: ");
		String nome = scanner.nextLine();
		System.out.print("Crie a sua senha: ");
		String criaSenha = scanner.nextLine();

		senha.criacaoSenha(criaSenha);

		while (( senha.senhaIcompleta > 0) || (senha.senhaRequesitada == false)) {

			if (senha.numeroEncontrado == false) {
				System.out.println();
				System.out.println("ATENÇÃO: A senha deve conter pelo meno 1 DIGITO ");
			}
			if (senha.minusculoEncontrado == false) {
				System.out.println();
				System.out.println("ATENÇÃO: A senha deve conter pelo meno 1 LETRA EM MINÚSCULO ");
			}
			if (senha.maiusculaEncontrado == false) {
				System.out.println();
				System.out.println("ATENÇÃO: A senha deve conter pelo meno 1 LETRA EM MAIUSCULA ");
			}
			if (senha.simboloEncontrado == false) {
				System.out.println();
				System.out.println("ATENÇÃO: A senha deve conter pelo meno 1 CARACTERES ESPECIAL ");
			}
			if (senha.senhaIcompleta > 0) {
				System.out.println();
				System.out.println("ATENÇÃO: senha deve possui no minino 6 caracters ");
				System.out.println();
				System.out.println("Caracters restante: " + senha.senhaIcompleta);
			}

			System.out.println();
			System.out.print("Complete a sua senha para finalizar o cadastrado: " + senha.completaSenha);
			senha.aux = senha.completaSenha;
			criaSenha = scanner.nextLine();
			senha.criacaoSenha(criaSenha);

		}
		System.out.println();
		System.out.println("====CADASTRADO FINALIZADO====");
		System.out.println("Parabéns " + nome + " cadastrado criado com sucesso.");

		scanner.close();

	}

}


