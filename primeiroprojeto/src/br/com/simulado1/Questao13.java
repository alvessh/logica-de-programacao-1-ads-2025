package br.com.simulado1;

import java.util.Scanner;

/*
 * 13. Crie um programa completo em Java que:
- Solicite o nome do cliente
- Solicite o valor de um produto
- Solicite a quantidade do produto
- Calcule o valor total da compra
- Exiba uma mensagem final formatada com nome, 
valor unitário, quantidade e total da compra.
 */

public class Questao13 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o seu nome, pfv: ");
		String nome = teclado.nextLine();
		
		System.out.println("Digite o valor do produto, pfv: ");
		Double valorProduto = teclado.nextDouble();
		
		System.out.println("Digite o quantidade do produto, pfv: ");
		Double quantidadeProduto = teclado.nextDouble();
		
		Double valorTotal = valorProduto * quantidadeProduto;
		
		System.out.println("Olá " + nome + ", Tudo bem?");
		System.out.println("Sua compra ficou no valor total de : R$ " + valorTotal);
		System.out.println("Você comprou : " + quantidadeProduto + " produtos.");
		System.out.println("e pagou : R$ " + valorProduto + " por cada.");
		System.out.println("Volte sempre!");
		
		
		
	}
}
