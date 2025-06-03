package br.com.simulado1;

public class Questao02 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("2. Qual das opções está correta para mostrar uma mensagem no console em Java?\n"
				+ "a) System.print(\"Olá!\");\n"
				+ "b) Console.Write(\"Olá!\");\n"
				+ "c) System.out.println(\"Olá!\");\n"
				+ "d) Exibir(\"Olá!\");\n"
				+ "");

		System.out.println(sb.toString());
		
		
		System.err.println("Resposta correta: c) System.out.println(\\\"Olá!\\\");");
	}
}
