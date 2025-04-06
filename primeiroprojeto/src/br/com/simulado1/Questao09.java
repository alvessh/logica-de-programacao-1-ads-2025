package br.com.simulado1;

import java.util.Scanner;

/*
 *09) Crie um programa em Java que peça o nome do usuário
 *  e exiba uma mensagem de boas-vindas como: 
 *  "Olá, Maria! Bem-vinda ao mundo da programação."
 */
public class Questao09 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Olá, digite seu nome por favor: ");
		String nome = teclado.nextLine();

		System.out.println("Olá, " + nome + "! Bem-vindo(a) ao mundo da programação.");
	}
}
