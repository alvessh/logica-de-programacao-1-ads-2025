package br.com.simulado1;

public class Questao08 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("8. Dado o trecho de código abaixo, qual será o valor final da variável total?\n"
				+ "\n"
				+ "int x = 10;\n"
				+ "x += 5;\n"
				+ "x *= 2;\n"
				+ "x -= 4;\n"
				+ "System.out.println(x);\n"
				+ "a) 22\n"
				+ "b) 30\n"
				+ "c) 24\n"
				+ "d) 26\n"
				+ "");

		int x = 10;
		x += 5;
		x *= 2;
		x -= 4;
		System.out.println(x);

		System.out.println(sb.toString());

		System.err.println("Resposta correta: d) " + x);
	}
}
