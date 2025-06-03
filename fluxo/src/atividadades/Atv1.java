package atividadades;

import java.util.Scanner;


public class Atv1 {
	public static final String CATEGORIA_1 = "Batata";
	public static final String CATEGORIA_2 = "Arroz";
	public static final String CATEGORIA_3 = "Feijão";
	public static final String CATEGORIA_4 = "Marmita";
	
	public static final double PERCENTUAL_CATEGORIA_1 = 0.50;
	public static final double PERCENTUAL_CATEGORIA_2 = 0.25;
	public static final double PERCENTUAL_CATEGORIA_3 = 0.15;
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String nome= teclado.nextLine();
		System.out.println("Digite o número para a sua categoria: \n"
				+ "(1)" + CATEGORIA_1 + " \n"
				+ "(2) " + CATEGORIA_2 + " \n"
				+ "(3) " + CATEGORIA_3 + " \n"
				+ "(4)" + CATEGORIA_4);
		int categoria= teclado.nextInt();
		
		System.out.println("Qual o valor da sua compra?");
		double valor= teclado.nextDouble();

		double desconto = 0;

		if( categoria == 1) {
			calculaDesconto(valor, PERCENTUAL_CATEGORIA_1);
		} else if( categoria == 2) {
			calculaDesconto(valor, PERCENTUAL_CATEGORIA_2);
		}else if( categoria == 3) {
			calculaDesconto(valor, PERCENTUAL_CATEGORIA_3);
		} else {
			System.out.println("Não tem desconto");
		}

		double total = valor - desconto;
		
		System.out.println("Nome:" + nome);
		System.out.println("Categoria:" + buscaDescricaoCategoriaPorCodigo(categoria));
		System.out.println("Valor da compra:" + valor);
		System.out.println("Valor da compra com desconto: " + total);

	}
	
	
	private static double calculaDesconto(double valor, double percentual) {
		double valorDoDesconto = valor * percentual;
		return valorDoDesconto;
	}


	public static String buscaDescricaoCategoriaPorCodigo(int codigoCategoria) {
		String descricaoCategoria = "";
		if (codigoCategoria == 1) {
			descricaoCategoria = CATEGORIA_1;
		} else if (codigoCategoria == 2) {
			descricaoCategoria = CATEGORIA_2;
		} else if (codigoCategoria == 3) {
			descricaoCategoria = CATEGORIA_3;
		} else {
			//sem desconto
			descricaoCategoria = CATEGORIA_4;
		}
		
		return descricaoCategoria;
	}

}
