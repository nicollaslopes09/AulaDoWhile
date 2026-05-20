package doWhile;

import java.util.Scanner;

public class senhaCofre {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int senha = 1234, senha2;
		
		do {
			System.out.println("Digite a senha: ");
			senha2 = ler.nextInt();	
			
		
		}while(senha2 != senha);
		System.out.println("Senha incorreta");
		ler.close();
		
		if(senha ==senha2) {
			System.out.println("Senha correta!");
		}
			}
		
	}

