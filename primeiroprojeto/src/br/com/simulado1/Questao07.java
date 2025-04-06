package br.com.simulado1;

public class Questao07 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("7. Dado o trecho de código abaixo, qual será o valor final da variável total?\n"
				+ "\n"
				+ "int a = 5;\n"
				+ "int b = 3;\n"
				+ "int c = 2;\n"
				+ "int total = a + b * c;\n"
				+ "a) 16\n"
				+ "b) 11\n"
				+ "c) 21\n"
				+ "d) 10\n"
				+ "");

		int a = 5;
		int b = 3;
		int c = 2;
		int total = a + b * c;

		System.out.println(sb.toString());

		System.err.println("Resposta correta: b) " + total);
	}
}
