package br.com.simulado1;

/*
 *11) Crie um programa com métodos (funções) em Java 
 *que contenha os seguintes métodos:
- soma(double a, double b)
- subtrai(double a, double b)
- multiplica(double a, double b)
- divide(double a, double b)

Chame cada método passando valores e exiba os resultados no console.
 */
public class Questao11 {
	public static void main(String [] args) {

		double numero1 = 10.50;
		double numero2 = 15.0;

		System.out.println("A soma dos números é: " + soma(numero1, numero2));

		System.out.println("A multiplicação dos números é: " + multiplica(numero1, numero2));

		System.out.println("A divisão dos números é: " + divide(numero1, numero2));

		System.out.println("A subtração dos números é: " + subtrai(numero1, numero2));
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