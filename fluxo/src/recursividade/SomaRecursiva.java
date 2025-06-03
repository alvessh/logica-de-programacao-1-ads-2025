package recursividade;

public class SomaRecursiva {
	public static void main(String[] args) {
        int numero = 15; 
        int resultado = somaAteN(numero);

        System.out.println("A soma dos números: ");
        imprimirSequencia(numero);
        System.out.println(" é: " + resultado);
    }
	
    public static int somaAteN(int n) {
        if (n <= 1) {
            return n;
        }
        return n + somaAteN(n - 1); // chamada recursiva
    }
    
    public static void imprimirSequencia(int n) {
        if (n > 1) {
            System.out.print(n + " + ");
            imprimirSequencia(n - 1);
        } else {
            System.out.print(n); // não imprime o "+" no final
        }
    }
}
