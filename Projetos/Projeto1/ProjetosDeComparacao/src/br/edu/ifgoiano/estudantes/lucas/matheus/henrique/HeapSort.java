package br.edu.ifgoiano.estudantes.lucas.matheus.henrique;

public class HeapSort {

    private int comparacoes = 0;
    private int trocas = 0;
    private long tempoExecucao;

    public int[] heapSort(int[] arrayParaOrdenar) {
        long comecoInicio = System.nanoTime();  // Marca o início da execução
        int n = arrayParaOrdenar.length;

        // Constrói o heap (reorganiza o array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arrayParaOrdenar, n, i);
        }

        // Extrai um por um os elementos do heap
        for (int i = n - 1; i > 0; i--) {
            // Move a raiz atual para o final
            swap(arrayParaOrdenar, 0, i);

            // Chama heapify na raiz
            heapify(arrayParaOrdenar, i, 0);
        }
        tempoExecucao = System.nanoTime() - comecoInicio;
        return arrayParaOrdenar;
    }

    // Função para reorganizar o heap (heapify)
    private void heapify(int[] array, int size, int i) {
        int max = i; // Inicializa max como a raiz
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        comparacoes++;

        if (left < size && array[left] > array[max]) {
            max = left;
        }

        comparacoes++; // Conta a comparação

        if (right < size && array[right] > array[max]) {
            max = right;
        }

        if (max != i) {
            swap(array, i, max);
            heapify(array, size, max);
        }
    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        trocas++;
    }

    // Método que exibe o relatório de comparações, trocas e tempo de execução
    public void relatorioHeapSort() {
        System.out.println("HeapSort:");
        System.out.println("Comparações feitas: " + comparacoes);
        System.out.println("Trocas feitas: " + trocas);
        System.out.println("Tempo de execução (ns): " + tempoExecucao + "\n");
    }
}
