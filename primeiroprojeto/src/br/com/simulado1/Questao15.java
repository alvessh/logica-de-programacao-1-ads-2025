package br.com.simulado1;

public class Questao15 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("15. Dado o trecho de código abaixo, qual será a saída exibida no console?\n"
				+ "public class Exemplo {\n"
				+ "	public static void main(String[] args) {\n"
				+ "    	int x = 4;\n"
				+ "    	int y = 2;\n"
				+ "    	int resultado = calcula(x, y);\n"
				+ "    	System.out.println(\"Resultado: \" + resultado);\n"
				+ "	}\n"
				+ "\n"
				+ "	public static int calcula(int a, int b) {\n"
				+ "    	int  = a + b;\n"
				+ "    	int multi = soma * b;\n"
				+ "    	return multi - a;\n"
				+ "	}\n"
				+ "}\n"
				+ "a) Resultado: 10\n"
				+ "b) Resultado: 8\n"
				+ "c) Resultado: 6\n"
				+ "d) Resultado: 12\n"
				+ "");

		System.out.println(sb.toString());

		int x = 4;
		int y = 2;
		int resultado = calcula(x, y);
		
		System.err.println("Resposta correta: b) " + resultado);
	}

	public static int calcula(int a, int b) {
		int soma = a + b;
		int multi = soma * b;
		return multi - a;
	}
}
