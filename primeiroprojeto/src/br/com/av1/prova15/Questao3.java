package br.com.av1.prova15;

public class Questao3 {
	public static void main(String[] args) {
		int a = 24;
		int b = 15;
		int c = 12;

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