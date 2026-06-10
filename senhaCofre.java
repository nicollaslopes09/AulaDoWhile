package doWhile;

import java.util.Scanner;

public class senha {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int senhaCorreta = 1234;
		int senhaDigitada;

		do {
			System.out.print("Digite a senha de acesso: ");
			senhaDigitada = ler.nextInt();

			if (senhaDigitada != senhaCorreta) {
				System.out.println("Senha incorreta! Tente novamente.");
			}
		} while (senhaDigitada != senhaCorreta);

		System.out.println("Acesso Liberado");
		ler.close();

	}

}
