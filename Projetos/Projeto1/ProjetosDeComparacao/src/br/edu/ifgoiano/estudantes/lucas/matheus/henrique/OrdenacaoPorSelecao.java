package br.edu.ifgoiano.estudantes.lucas.matheus.henrique;

public class OrdenacaoPorSelecao {

    private int comparacoes = 0;
    private int trocas = 0;
    private long tempoExecucao;

    // Método de ordenação por seleção
    public int[] ordenandoPorSelecao(int[] arrayParaOrdenar) {
        // Reseta as contagens para cada execução
        comparacoes = 0;
        trocas = 0;

        long inicio = System.nanoTime();

        for (int i = 0; i < arrayParaOrdenar.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arrayParaOrdenar.length; j++) {
                comparacoes++;
                if (arrayParaOrdenar[j] < arrayParaOrdenar[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                // Realiza a troca
                int temp = arrayParaOrdenar[i];
                arrayParaOrdenar[i] = arrayParaOrdenar[minIndex];
                arrayParaOrdenar[minIndex] = temp;
                trocas++;
            }
        }

        tempoExecucao = System.nanoTime() - inicio;
        return arrayParaOrdenar;
    }

    // Método que exibe o relatório de comparações, trocas e tempo de execução
    public void relatorioOrdenacaoSelecao() {
        System.out.println("Ordenação por Seleção:");
        System.out.println("Comparações feitas: " + comparacoes);
        System.out.println("Trocas feitas: " + trocas);
        System.out.println("Tempo de execução (ns): " + tempoExecucao + "\n");
    }
}
