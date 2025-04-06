package br.com.simulado1;

import java.util.Scanner;

/*
 *10) Crie um programa que peça dois números ao usuário 
 *e mostre a soma deles na tela.
 */
public class Questao10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Olá, digite o primeiro número: ");
		Double numero01 = teclado.nextDouble();

		System.out.println("Olá, digite o segundo número: ");
		Double numero02 = teclado.nextDouble();
		
		Double resultado = numero01 + numero02;
		
		System.out.println("Resultado da soma: " + resultado);
	}
}
