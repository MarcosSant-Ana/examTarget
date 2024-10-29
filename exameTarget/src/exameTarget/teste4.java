package exameTarget;

public class teste4 {
	public static void main(String[] args) {
		// Valores de faturamento por estado
		double sp = 67836.43;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double outros = 19849.53;

		// soma todo o faturamento da empresa
		double faturamentoTotal = sp + rj + mg + es + outros;

		// Tendo o faturamento total, calculamos a porcentagem de cada estado
		double percentualSP = (sp / faturamentoTotal) * 100;
		double percentualRJ = (rj / faturamentoTotal) * 100;
		double percentualMG = (mg / faturamentoTotal) * 100;
		double percentualES = (es / faturamentoTotal) * 100;
		double percentualOutros = (outros / faturamentoTotal) * 100;

		// Imprime os resultados no formato de ate 2 casas decimais
		System.out.printf("Percentual de SP: %.2f%%\n", percentualSP); //%% imprime o simbolo '%' no final do print
		System.out.printf("Percentual de RJ: %.2f%%\n", percentualRJ);
		System.out.printf("Percentual de MG: %.2f%%\n", percentualMG);
		System.out.printf("Percentual de ES: %.2f%%\n", percentualES);
		System.out.printf("Percentual de Outros: %.2f%%\n", percentualOutros);
	}
}
