package recursividade;

import java.util.Scanner;
public class PalavraIgual {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String palavra = scanner.nextLine();

		// \\s+ (espaços)
		palavra = palavra.replaceAll("\\s+", "").toLowerCase();

		if (ehPalindromo(palavra)) {
			System.out.println("É um palíndromo!");
		} else {
			System.out.println("Não é um palíndromo.");
		}

		scanner.close();
	}

	public static boolean ehPalindromo(String palavra) {
		int inicio = 0;
		int fim = palavra.length() - 1;

		while (inicio < fim) {
			if (palavra.charAt(inicio) != palavra.charAt(fim)) {
				return false; // não é
			}
			inicio++;
			fim--;
		}

		return true; // é
	}
}




