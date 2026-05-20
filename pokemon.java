package doWhile;

import java.util.Scanner;

public class pokemon {
	public static void main(String[] args) {
		int escolha;

		Scanner ler = new Scanner(System.in);

		do {
			System.out.println("---Escolha seu pokemon---");
			System.out.println("1-Para charmander");
			System.out.println("2-Para Bulbassaur");
			System.out.println("3-Para squirtle");
			escolha = ler.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("Um pokemon de fogo! ótima escolha");
				break;
			case 2:
				System.out.println("Um tipo de planta! Muito resistente");
				break;
			case 3:
				System.out.println("Um tipo de agua! Otimo pra quem é quente!!");
				break;
			default:
				System.out.println("Escolha invalida!");
			}
		} while (escolha < 1 || escolha < 3);
		ler.close();
		System.out.println("Saindo do laboratorio com seu novo pokemon!!!");
	}
}
