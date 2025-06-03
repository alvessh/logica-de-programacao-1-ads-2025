package br.com.av1.prova18;

public class Questao1 {
	public static void main(String[] args) {
		int i = 0;

		i = 50;

		double quartorze = 15.0 + i;


		String output = "Batata frita é bacana.!";

		String concatena = output + "Tudo de bom!";

		String tudo_ok = concatena + "";
		concatena("output");
	}
	
	public static void concatena(String texto) {
		System.out.println(texto);
	}
}