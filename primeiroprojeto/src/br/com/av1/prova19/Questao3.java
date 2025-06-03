package br.com.av1.prova19;

public class Questao3 {
	public static void main(String[] args) {
		int a = 32;
		int b = 19;
		int c = 16;

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