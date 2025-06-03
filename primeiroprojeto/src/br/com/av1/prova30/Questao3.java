package br.com.av1.prova30;

public class Questao3 {
	public static void main(String[] args) {
		int a = 54;
		int b = 30;
		int c = 27;

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