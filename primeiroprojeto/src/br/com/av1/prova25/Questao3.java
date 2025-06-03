package br.com.av1.prova25;

public class Questao3 {
	public static void main(String[] args) {
		int a = 44;
		int b = 25;
		int c = 22;

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