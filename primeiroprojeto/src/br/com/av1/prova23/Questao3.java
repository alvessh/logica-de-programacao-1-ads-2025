package br.com.av1.prova23;

public class Questao3 {
	public static void main(String[] args) {
		int a = 40;
		int b = 23;
		int c = 20;

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
