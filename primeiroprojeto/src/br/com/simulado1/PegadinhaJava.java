package br.com.simulado1;

public class PegadinhaJava {
	public static void corrigePegadinha() {
		int a;
		int b;
		int c;
		int d;
		int e;

		a = 2;
		b = 3;
		c = 5;
		d = 7;
		e = 10;

		String resultado1;
		resultado1 = a + b + "";
		resultado1 = resultado1 + (c - d);
		resultado1 = resultado1 + d;

		String resultado2;
		resultado2 = "";
		resultado2 = resultado2 + (a * b);
		resultado2 = resultado2 + c;
		resultado2 = resultado2 + (d / e);

		String resultado3;
		resultado3 = (a + b) + "";
		resultado3 = resultado3 + (c + d - e);
		resultado3 = resultado3 + (b * d);

		a = a * b;
		b = b - c;
		c = c + d;
		d = d + 2;
		e = e / 2;

		String resultado4;
		resultado4 = "";
		resultado4 = resultado4 + a;
		resultado4 = resultado4 + b;
		resultado4 = resultado4 + c;
		resultado4 = resultado4 + d;
		resultado4 = resultado4 + e;

		String resultado5;
		resultado5 = "Total: ";
		resultado5 = resultado5 + (a + b);
		resultado5 = resultado5 + c;
		resultado5 = resultado5 + (d * e);

		String resultado6;
		resultado6 = "Final: ";
		resultado6 = resultado6 + (a - b);
		resultado6 = resultado6 + (b * c);
		resultado6 = resultado6 + (d + e);

		int x;
		int y;
		int z;

		x = 8;
		y = 4;
		z = 12;

		x = x + y * 2;
		y = y - z / 3;
		z = z - x;

		String resultado7;
		resultado7 = "";
		resultado7 = resultado7 + x;
		resultado7 = resultado7 + y;
		resultado7 = resultado7 + z;

		String resultado8;
		resultado8 = "X: ";
		resultado8 = resultado8 + x;
		resultado8 = resultado8 + ", Y: ";
		resultado8 = resultado8 + y;
		resultado8 = resultado8 + ", Z: ";
		resultado8 = resultado8 + z;

		String resultado9;
		resultado9 = "Soma: ";
		resultado9 = resultado9 + (x + y);
		resultado9 = resultado9 + (y * z);
		resultado9 = resultado9 + (x - z);

		double valor1;
		double valor2;
		double soma;
		double diferenca;
		double produto;

		valor1 = 6.5;
		valor2 = 3.5;

		soma = valor1 + valor2;
		diferenca = valor1 - valor2;
		produto = valor1 * valor2;

		String resultado10;
		resultado10 = "";
		resultado10 = resultado10 + soma;

		String resultado11;
		resultado11 = soma + "";

		String resultado12;
		resultado12 = "";
		resultado12 = resultado12 + valor1;
		resultado12 = resultado12 + valor2;

		String resultado13;
		resultado13 = "Operações: ";
		resultado13 = resultado13 + "Soma = ";
		resultado13 = resultado13 + soma;
		resultado13 = resultado13 + ", Diferença = ";
		resultado13 = resultado13 + diferenca;
		resultado13 = resultado13 + ", Produto = ";
		resultado13 = resultado13 + produto;

		System.err.println("Resultado 1: " + resultado1);
		System.err.println("Resultado 2: " + resultado2);
		System.err.println("Resultado 3: " + resultado3);
		System.err.println("Resultado 4: " + resultado4);
		System.err.println("Resultado 5: " + resultado5);
		System.err.println("Resultado 6: " + resultado6);
		System.err.println("Resultado 7: " + resultado7);
		System.err.println("Resultado 8: " + resultado8);
		System.err.println("Resultado 9: " + resultado9);
		System.err.println("Resultado 10: " + resultado10);
		System.err.println("Resultado 11: " + resultado11);
		System.err.println("Resultado 12: " + resultado12);
		System.err.println("Resultado 13: " + resultado13);
	}
}