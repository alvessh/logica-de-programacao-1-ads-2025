package br.com.av1.prova15;

public class Questao1 {
	public static void main(String[] args) {
		int i = 0;

		i = 90 + 50;

		i = 0;

		i = 0 + i;

		i = i + i;

		i += 0 + 50;

		i = 50;

		double quartorze = 15.0 + i;


		String output = "Batata frita é bacana.!";

		String concatena = output + "Tudo de bom!";

		String tudo_ok = concatena + "";
		concatena("System.out.println((10 + 20) + concatena);");
	}

	public static void concatena(String texto) {
		System.out.println(texto);
	}
}