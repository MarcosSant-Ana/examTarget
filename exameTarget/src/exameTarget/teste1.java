package exameTarget;

public class teste1 {
	public static void main(String[] args) {
		int indice = 13;
		int soma = 0;
		int k = 0;

		// condição para acumular os atributos
		while (k < indice) {
			k += 1;
			soma += k;
		}
		System.out.println("O valor da soma é: " + soma);
	}
}
