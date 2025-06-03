package lacos;

public class Tabuada {
	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			for (int y = 1; y <= 10; y++) {
				int resultado = i * y;
				System.out.println(i + " * " + y + " = " + resultado);
			}
		}
	}
}