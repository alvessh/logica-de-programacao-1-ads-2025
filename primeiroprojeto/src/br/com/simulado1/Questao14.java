package br.com.simulado1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 14. Desenvolva um programa em Java que siga os seguintes requisitos:
 * 
O programa deve solicitar ao usuário dois números do tipo double por meio do teclado (Scanner).

Deve conter três métodos auxiliares, além do main():

exibeCabecalho(): Exibe uma mensagem de boas-vindas e informações iniciais sobre o programa.

mostraOperacoesMatematicas(double n1, double n2): Recebe dois números e exibe os resultados das operações matemáticas básicas entre eles:
Soma (n1 + n2)
Subtração (n1 - n2)
Multiplicação (n1 * n2)
Divisão (n1 / n2)

exibeRodape(): Exibe uma mensagem de encerramento do programa.

Fluxo esperado do programa:

Exibir o cabeçalho.
Solicitar e capturar dois números do usuário.
Exibir os resultados das operações matemáticas.
Exibir o rodapé para finalizar o programa.
O código deve ser estruturado de forma clara, 
com boas práticas de formatação e nomes de variáveis intuitivos.

 */

public class Questao14 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		exibeCabecalho();

		System.out.println("Digite o primeiro número: ");
		Double numero1 = teclado.nextDouble();

		System.out.println("Digite o segundo número: ");
		Double numero2 = teclado.nextDouble();


		mostraOperacoesMatematicas(numero1, numero2);
		
		exibeRodape();
	}

	private static void exibeRodape() {
		System.out.println("===================================");
		System.out.println("Estamos finalizando o sistema tudo ok!");
		System.out.println("Volte sempre!");
		System.out.println("===================================");

		Date data = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
		String dataFormatada = formato.format(data);

		System.out.println("Data Atual: " + dataFormatada);
		System.out.println("===================================");
	}

	private static void mostraOperacoesMatematicas(Double numero1, Double numero2) {
		Double resultadoSoma = soma(numero1, numero2);
		System.out.println(numero1 + " + " + numero2 + " = " + resultadoSoma);
		
		Double resultadoSubtracao = subtrai(numero1, numero2);
		System.out.println(numero1 + " - " + numero2 + " = " + resultadoSubtracao);
		
		Double resultadoDivisao = divide(numero1, numero2);
		System.out.println(numero1 + " / " + numero2 + " = " + resultadoDivisao);
		
		Double resultadoMultiplicacao = multiplica(numero1, numero2);
		System.out.println(numero1 + " * " + numero2 + " = " + resultadoMultiplicacao);
	}

	private static void exibeCabecalho() {
		System.out.println("===================================");
		System.out.println("Seja bem vindo ao sistema tudo ok!");
		System.out.println("===================================");

		Date data = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
		String dataFormatada = formato.format(data);

		System.out.println("Data Atual: " + dataFormatada);
		System.out.println("===================================");
	}

	public static double soma(double numero1, double numero2) {
		double resultado = numero1 + numero2;
		return resultado;
	}

	public static double multiplica(double numero1, double numero2) {
		double resultado = numero1 * numero2;
		return resultado;
	}

	public static double divide(double numero1, double numero2) {
		double resultado = numero1 / numero2;
		return resultado;
	}

	public static double subtrai(double numero1, double numero2) {
		double resultado = numero1 - numero2;
		return resultado ;
	}
}
