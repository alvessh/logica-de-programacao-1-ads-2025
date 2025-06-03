package br.com.av1.prova06;

public class Questao3 {
	public static void main(String[] args) {
		int a = 6;
		int b = 6;
		int c = 3;

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