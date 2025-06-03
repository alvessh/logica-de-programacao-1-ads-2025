package br.com.av1.prova01;

public class Questao3 {
	public static void main(String[] args) {
		int a = 58;
		int b = 32;
		int c = 29;

		a = a + b;
		b = b - c;
		c = a * b;
		a = c / 2;

		a += 2;
		b *= 3;
		c -= 4;
		a /= 2;

    	String resultado = "Resultado:  " + a + ",  " + b + ",  " + c;
		System.out.println(resultado);
	}
}