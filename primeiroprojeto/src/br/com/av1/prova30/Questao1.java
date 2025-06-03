package br.com.av1.prova30;

public class Questao1 {
	public static void main(String[] args) {
		int i = 0;

		i = 50;
		
		int a = i;
		int b = a + i;

		double quartorze = 15.0 + i;

		String inteiro = "10";
		String output = "Batata frita é bacana.!";

		String concatena = output + "Tudo de bom!";

		String tudo_ok = concatena + "";
		double calculo = (2000 * 2) / (10 + 50);
		println(calculo);
	}
	
	private static void println(double b) {
		concatena(b + "");
	}

	public static void concatena(String texto) {
		System.out.println(texto);
	}
}