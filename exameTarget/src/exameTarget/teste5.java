package exameTarget;

public class teste5 {
	public static void main(String[] args) {
		// Definindo uma string para inverter
		String naoInvertida = "Exemplo de string";

		// Chama a função para inverter a string, passando a string original como parametro
		String invertida = inverterString(naoInvertida);

		// Imprime a string invertida
		System.out.println("String original: " + naoInvertida);
		System.out.println("String invertida: " + invertida);
	}

	public static String inverterString(String texto) {
		// Constrói a string invertida manualmente
		String invertida = " ";
		for (int i = texto.length() - 1; i >= 0; i--) {;//percorro o texto de tras pra frente, enquanto for maior ou igual a 0, decremento ate a ultima posicao
			invertida += texto.charAt(i);				//armazeno a letra de tras pra frente a cada loop
		}
		return invertida;								//retorno a string
	}
}
