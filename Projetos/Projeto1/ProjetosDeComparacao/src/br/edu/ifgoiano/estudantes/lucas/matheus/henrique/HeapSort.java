package br.edu.ifgoiano.estudantes.lucas.matheus.henrique;

public class HeapSort {

    //Precisa ser consertado
    private int comparacoes = 0;
    private int trocas = 0;
    private long tempoExecucao;

    // Método principal que ordena o array usando HeapSort
    public int[] heapSort(int[] arrayParaOrdenar) {
        // Reseta as contagens de comparações e trocas
        comparacoes = 0;
        trocas = 0;

        long inicio = System.nanoTime(); // Início do cálculo de tempo

        int size = arrayParaOrdenar.length;

        // Constrói o heap (rearranja o array)
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(arrayParaOrdenar, size, i);
        }

        // Extrai um elemento do heap um por um
        for (int i = size - 1; i >= 0; i--) {
            // Move o maior elemento (raiz) para o final
            int temp = arrayParaOrdenar[0];
            arrayParaOrdenar[0] = arrayParaOrdenar[i];
            arrayParaOrdenar[i] = temp;
            trocas++; // Conta a troca

            // Chama heapify na árvore reduzida
            heapify(arrayParaOrdenar, i, 0);
        }

        tempoExecucao = System.nanoTime() - inicio; // Fim do cálculo de tempo
        return arrayParaOrdenar;
    }

    // Função para reorganizar o heap (heapify)
    private void heapify(int[] array, int size, int i) {
        int max = i; // Inicializa max como a raiz
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Se o filho da esquerda é maior que a raiz
        if (left < size) {
            comparacoes++; // Conta a comparação
            if (array[left] > array[max]) {
                max = left;
            }
        }

        // Se o filho da direita é maior que o max atual
        if (right < size) {
            comparacoes++; // Conta a comparação
            if (array[right] > array[max]) {
                max = right;
            }
        }

        // Se o max não é a raiz
        if (max != i) {
            // Troca a raiz com o maior filho
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
            trocas++; // Conta a troca

            // Chama heapify recursivamente para o sub-heap afetado
            heapify(array, size, max);
        }
    }

    // Método que exibe o relatório de comparações, trocas e tempo de execução
    public void relatorioHeapSort() {
        System.out.println("HeapSort:");
        System.out.println("Comparações feitas: " + comparacoes);
        System.out.println("Trocas feitas: " + trocas);
        System.out.println("Tempo de execução (ns): " + tempoExecucao + "\n");
    }
}
