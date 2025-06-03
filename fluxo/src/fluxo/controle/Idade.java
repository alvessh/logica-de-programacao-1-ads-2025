package fluxo.controle;

public class Idade {
	public static void main(String[] args) {
		Integer idade = 20;
		
		if (idade <= 0) {
			System.out.println("Idade é invalidade");
		} else if (idade >= 1 && idade < 18) {
			System.out.println("é de menor");
		} else {
			System.out.println("è de maior");
		}
	}
}
