package lacos;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("Segue as opções: ");
			System.out.println("1 - Abrir menu de cadastro");
			System.out.println("99 - Fechar o programa.");
			opcao = scanner.nextInt();
			
			if (opcao == 1) {
				System.out.println("Segue as opções: ");
				System.out.println("1 - Cadastrar cliente");
				System.out.println("2 - Listar cliente.");
				System.out.println("99 - Fechar programa.");
				opcao = scanner.nextInt();
			}
			
		} while (!(opcao == 99));
	}
}