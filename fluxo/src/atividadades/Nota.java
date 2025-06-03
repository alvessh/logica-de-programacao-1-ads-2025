package atividadades;

import java.util.Scanner;

public class Nota {
	public static void main(String[] args){
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Digite seu nome: ");
	String nome = teclado.nextLine();
	
	System.out.println("Digite sua nota 1: ");
	double nota1 = teclado.nextDouble();
	
	System.out.println("Digite sua nota 2: ");
	double nota2 = teclado.nextDouble();
	
	double media = (nota1 + nota2) / 2;
	
	System.out.println(nome);
	System.out.println(media);
	
	if (media>= 7) {
	System.out.println("Aprovado");
	} else if (media>=5 && media< 7) {
		System.out.println("Você está de recuperação");
	} else {
		System.out.println("Reprovado");
	}
	}
}
