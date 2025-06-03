package br.com.simulado1;

public class Questao05 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("5. Observe o código abaixo. Qual será o valor final da variável resultado?\n"
				+ "\n"
				+ "int a = 20;\n"
				+ "int b = 10;\n"
				+ "int resultado = a + b;\n"
				+ "a) 10\n"
				+ "b) 20\n"
				+ "c) 30\n"
				+ "d) 210\n"
				+ "");

		System.out.println(sb.toString());
		
		int a = 20;
		int b = 10;
		int resultado = a + b;
		
		System.err.println("Resposta correta: c) " + resultado);
	}
}
