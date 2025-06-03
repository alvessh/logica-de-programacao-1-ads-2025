package br.com.simulado1;

public class Questao16 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("16. Dado o trecho de código abaixo, qual será a saída exibida no console?\n"
				+ "public class Teste {\n"
				+ "	public static void main(String[] args) {\n"
				+ "    	int num = 5;\n"
				+ "    	alteraValor(num);\n"
				+ "    	System.out.println(\"Valor final: \" + num);\n"
				+ "	}\n"
				+ "\n"
				+ "	public static void alteraValor(int valor) {\n"
				+ "    	valor = valor * 2;\n"
				+ "    	System.out.println(\"Valor dentro do método: \" + valor);\n"
				+ "	}\n"
				+ "}\n"
				+ "a) Valor dentro do método: 10 e Valor final: 10\n"
				+ "b) Valor dentro do método: 10 e Valor final: 5\n"
				+ "c) Valor dentro do método: 5 e Valor final: 10\n"
				+ "d) Valor dentro do método: 5 e Valor final: 5\n"
				+ "");

		System.out.println(sb.toString());

		int num = 5;
		alteraValor(num);
		System.out.println("Valor final: " + num);

		System.err.println("Resposta correta: b) Valor dentro do método: 10 e Valor final: 5\n");
	}

	public static void alteraValor(int valor) {
		valor = valor * 2;
		System.out.println("Valor dentro do método: " + valor);
	}

}
