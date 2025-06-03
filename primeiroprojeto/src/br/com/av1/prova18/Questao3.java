package br.com.av1.prova18;

public class Questao3 {
	public static void main(String[] args) {
		int a = 30;
		int b = 18;
		int c = 15;

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