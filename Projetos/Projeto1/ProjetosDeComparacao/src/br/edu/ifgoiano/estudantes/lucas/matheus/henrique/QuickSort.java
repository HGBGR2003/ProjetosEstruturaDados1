package br.edu.ifgoiano.estudantes.lucas.matheus.henrique;

public class QuickSort {

    private int comparacoes = 0;
    private int trocas = 0;
    private long tempoExecucao;

    // Método principal para ordenar o array usando QuickSort
    public int[] quickSort(int[] arrayParaOrdenar) {
        // Reseta as contagens de comparações e trocas
        comparacoes = 0;
        trocas = 0;

        long inicio = System.nanoTime(); // Marca o início do tempo de execução

        // Chama o método helper que implementa a lógica recursiva do QuickSort
        quickSortHelper(arrayParaOrdenar, 0, arrayParaOrdenar.length - 1);

        tempoExecucao = System.nanoTime() - inicio; // Marca o fim do tempo de execução
        return arrayParaOrdenar;
    }

    // Método recursivo que realiza a ordenação QuickSort
    private void quickSortHelper(int[] array, int startIndex, int endIndex) {
        // Verifica se o início e o fim ainda não se cruzaram
        if (startIndex < endIndex) {
            // Calcula o índice do pivô
            int pivotIndex = partition(array, startIndex, endIndex);

            // Ordena a sub-lista à esquerda do pivô
            quickSortHelper(array, startIndex, pivotIndex);

            // Ordena a sub-lista à direita do pivô
            quickSortHelper(array, pivotIndex + 1, endIndex);
        }
    }

    // Método que realiza a partição do array
    private int partition(int[] array, int startIndex, int endIndex) {
        int pivotIndex = (startIndex + endIndex) / 2;
        int pivotValue = array[pivotIndex];
        startIndex--;
        endIndex++;

        while (true) {
            // Avança o índice inicial até encontrar um valor maior que o pivô
            do {
                startIndex++;
                comparacoes++;
            } while (array[startIndex] < pivotValue);

            // Avança o índice final até encontrar um valor menor que o pivô
            do {
                endIndex--;
                comparacoes++;
            } while (array[endIndex] > pivotValue);

            if (startIndex >= endIndex) {
                return endIndex;
            }

            // Troca os valores nos índices encontrados
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            trocas++;  // Incrementa a contagem de trocas
        }
    }

    // Relatório que exibe as comparações, trocas e tempo de execução
    public void relatorioQuickSort() {
        System.out.println("QuickSort:");
        System.out.println("Comparações feitas: " + comparacoes);
        System.out.println("Trocas feitas: " + trocas);
        System.out.println("Tempo de execução (ns): " + tempoExecucao + "\n");
    }
}
