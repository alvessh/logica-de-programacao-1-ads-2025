package primeiroprojeto;

import java.util.Scanner;

public class Matematica {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número, por favor: ");
		double numero1 = teclado.nextDouble();
		
		System.out.println("Digite o segundo número, por favor: ");
		double numero2 = teclado.nextDouble();
		
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
