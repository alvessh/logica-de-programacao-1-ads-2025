package br.com.av1.prova24;

public class Questao1 {
	public static void main(String[] args) {
		int i = 0;

		i = 50;
		
		int a = i;
		int b = a + i;

		double quartorze = 15.0 + i;

		String inteiro = "10";
		String output = "Batata frita é bacana.!";
		println(inteiro);

		String concatena = output + "Tudo de bom!";

		String tudo_ok = concatena + "";
	}
	
	private static void println(int b) {
		System.out.println(b);
	}

	public static void concatena(String texto) {
		System.out.println(texto);
	}
}