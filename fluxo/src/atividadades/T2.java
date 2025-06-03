package atividadades;
import java.util.Scanner;
public class T2 {
	public static void main (String []args) {
		Scanner teclado = new Scanner (System.in);

		System.out.println("Digite sua idade: ");
		int idade = teclado.nextInt();
		System.out.println("Está acompanhada? Escolha:(1) Sim (2) Não");
		int acomp = teclado.nextInt();
		System.out.println("Você tem autorização especial? EScolha:(1) Sim (2) Não");
		int auto =teclado.nextInt();
		if (idade >= 18) {
			System.out.println("Acesso autorizado");
		} else if (idade >= 16 && idade <= 17) {

			if(acomp == 1 || auto == 1) {
				System.out.println("Autorizado");

			}else
				System.out.println("Acesso negado");

		}else if (idade < 16) {
			System.out.println("Acesso negado");
		}
	}
}		