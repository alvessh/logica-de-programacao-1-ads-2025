package br.com.av1.prova08;

public class Questao3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 8;
		int c = 5;

		a = a + b;
		b = b - c;
		c = a * b;
		a = c / 2;

		a += 2;
		b *= 3;
		c -= 4;
		a /= 2;

		String resultado = "Resultado: " + a + ", " + b + ", " + c;
		System.out.println(resultado);
	}
}