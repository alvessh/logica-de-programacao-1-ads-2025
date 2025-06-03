package br.com.av1.prova03;

public class Questao3 {
	public static void main(String[] args) {
		int numero = 50;
		int operador = 2;
		int operador2 = 1;
		
		numero = 50 + operador;
		numero = 50 / 10;
		numero = 50 * operador;
		numero = 50 - operador;
		
		numero += operador2;
		numero *= operador2;
		numero /= operador2;
		numero -= 2;
		
		System.out.println(numero);
	}
}