package primeiroprojeto;

import java.util.Scanner;

//escrever um algoritmo onde vai solicitar um nome
//e o programa vai retornar "Olá, bem vindo! $NOME"
// tenha ótimo, bem vindo ao mundo de progrm..
// bons estudos
public class Apresentacao {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		String nome = teclado.nextLine();
		
		System.out.println("Olá, " + nome + " seja bem vindo"
				+ " ao mundo da programação, bons estudos!");
	}
}
