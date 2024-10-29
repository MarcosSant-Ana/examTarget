package exameTarget;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class teste3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// Caminho para o arquivo JSON
		String lerArquivo = "dados.json";

		// Arrays para armazenar os dias e valores
		int[] dias = new int[30];
		double[] valores = new double[30];

		BufferedReader br = new BufferedReader(new FileReader(lerArquivo));
			String linha;
			int indice = 0;

			while ((linha = br.readLine()) != null) {
				linha = linha.trim();

				if (linha.startsWith("\"dia\"")) {
					// Extrai o número do dia
					String[] parts = linha.split(":");
					dias[indice] = Integer.parseInt(parts[1].trim().replace(",", ""));
				} else if (linha.startsWith("\"valor\"")) {
					// Extrai o valor de faturamento
					String[] parts = linha.split(":");
					valores[indice] = Double.parseDouble(parts[1].trim().replace(",", ""));
					indice++;
				}
			}

			// Variáveis para cálculo
			double menorValor = Double.MAX_VALUE;
			double maiorValor = Double.MIN_VALUE;
			double soma = 0.0;
			int diasFaturamento = 0;

			// Calcula o menor e maior valor, e a soma dos faturamentos
			for (int i = 0; i < valores.length; i++) {
				if (valores[i] > 0) {
					if (valores[i] < menorValor) {
						menorValor = valores[i];
					}
					if (valores[i] > maiorValor) {
						maiorValor = valores[i];
					}
					soma += valores[i];
					diasFaturamento++;
				}
			}

			// Calcula a média mensal
			double mediaMensal = soma / diasFaturamento;
			int diasAcimaDaMedia = 0;

			// Conta os dias com faturamento acima da média
			for (int i = 0; i < valores.length; i++) {
				if (valores[i] > mediaMensal) {
					diasAcimaDaMedia++;
				}
			}

			// Imprime os resultados
			System.out.println("Menor valor de faturamento: " + menorValor);
			System.out.println("Maior valor de faturamento: " + maiorValor);
			System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
	}
}