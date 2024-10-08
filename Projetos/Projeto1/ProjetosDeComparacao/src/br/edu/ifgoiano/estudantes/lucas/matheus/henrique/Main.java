package br.edu.ifgoiano.estudantes.lucas.matheus.henrique;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Inicializa o gerador de vetores
        ArrayGenerator gerador = new ArrayGenerator();
        // Gera um array grande (por exemplo, 50.000 elementos)
        gerador.generateArray(50000);

        // Testes de seleção e bolha com diferentes tamanhos
        // selecao(1000, gerador);
        // bolha(1000, gerador);
        //quickSort(1000, gerador); //o QuickSort ainda pode realizar trocas mesmo se o array já estiver ordenado. Isso depende da forma como o pivô é escolhido e da implementação do algoritmo.
        int[] tamanhos = {1000, 5000, 10000, 15000, 20000, 25000, 30000, 35000, 40000, 45000, 50000};

        for (int tamanho : tamanhos) {
            quickSort(tamanho, gerador);
            mergeSort(tamanho, gerador);
            heapSort(tamanho, gerador);
        }

    }

    // Método para realizar os testes de ordenação por seleção
    public static void selecao(int tamanho, ArrayGenerator gerador) {
        OrdenacaoPorSelecao os = new OrdenacaoPorSelecao();

        System.out.println("\n--- Testando Ordenação por Seleção com vetor de tamanho " + tamanho + " ---");

        // Recorta os pedaços do array original gerado e faz uma cópia
        int[] originalArray = Arrays.copyOfRange(gerador.getOriginalArray(), 0, tamanho);
        int[] sortedArray = Arrays.copyOfRange(gerador.getSortedArray(), 0, tamanho);
        int[] reverseSortedArray = Arrays.copyOfRange(gerador.getReverseSortedArray(), 0, tamanho);

        // Vetor Aleatório (Original)
        System.out.println("\nVetor Aleatório: ");
        os.ordenandoPorSelecao(originalArray.clone());  // Clona o array para não modificar o original
        os.relatorioOrdenacaoSelecao();

        // Vetor Crescente (Ordenado)
        System.out.println("\nVetor Crescente: ");
        os.ordenandoPorSelecao(sortedArray.clone());
        os.relatorioOrdenacaoSelecao();

        // Vetor Decrescente (Ordenado de forma reversa)
        System.out.println("\nVetor Decrescente: ");
        os.ordenandoPorSelecao(reverseSortedArray.clone());
        os.relatorioOrdenacaoSelecao();
    }

    // Método para realizar os testes de ordenação por bolha otimizado
    public static void bolha(int tamanho, ArrayGenerator gerador) {
        BolhaOtimizado bolha1 = new BolhaOtimizado();

        System.out.println("\n--- Testando Bolha Otimizado com vetor de tamanho " + tamanho + " ---");

        // Recorta os pedaços do array original gerado e faz uma cópia
        int[] originalArray = Arrays.copyOfRange(gerador.getOriginalArray(), 0, tamanho);
        int[] sortedArray = Arrays.copyOfRange(gerador.getSortedArray(), 0, tamanho);
        int[] reverseSortedArray = Arrays.copyOfRange(gerador.getReverseSortedArray(), 0, tamanho);

        // Vetor Aleatório (Original)
        System.out.println("\nVetor Aleatório: ");
        bolha1.bolhaOtimizado(originalArray.clone());  // Clona o array para não modificar o original

        // Vetor Crescente (Ordenado)
        System.out.println("\nVetor Crescente: ");
        bolha1.bolhaOtimizado(sortedArray.clone());

        // Vetor Decrescente (Ordenado de forma reversa)
        System.out.println("\nVetor Decrescente: ");
        bolha1.bolhaOtimizado(reverseSortedArray.clone());
    }

    // Método para realizar os testes de ordenação com QuickSort
    public static void quickSort(int tamanho, ArrayGenerator gerador) {
        QuickSort qs = new QuickSort();

        System.out.println("\n--- Testando QuickSort com vetor de tamanho " + tamanho + " ---");

        // Recorta os pedaços do array original gerado e faz uma cópia
        int[] originalArray = Arrays.copyOfRange(gerador.getOriginalArray(), 0, tamanho);
        int[] sortedArray = Arrays.copyOfRange(gerador.getSortedArray(), 0, tamanho);
        int[] reverseSortedArray = Arrays.copyOfRange(gerador.getReverseSortedArray(), 0, tamanho);

        // Vetor Aleatório (Original)
        System.out.println("\nVetor Aleatório: ");
        qs.quickSort(originalArray.clone());
        qs.relatorioQuickSort();

        // Vetor Crescente (Ordenado)
        System.out.println("\nVetor Crescente: ");
        qs.quickSort(sortedArray.clone());
        qs.relatorioQuickSort();

        // Vetor Decrescente (Ordenado de forma reversa)
        System.out.println("\nVetor Decrescente: ");
        qs.quickSort(reverseSortedArray.clone());
        qs.relatorioQuickSort();
    }

    //Precisa Ser Consertado
    public static void heapSort(int tamanho, ArrayGenerator gerador) {
        HeapSort hs = new HeapSort();

        System.out.println("\n--- Testando HeapSort com vetor de tamanho " + tamanho + " ---");

        // Recorta os pedaços do array original gerado e faz uma cópia
        int[] originalArray = Arrays.copyOfRange(gerador.getOriginalArray(), 0, tamanho);
        int[] sortedArray = Arrays.copyOfRange(gerador.getSortedArray(), 0, tamanho);
        int[] reverseSortedArray = Arrays.copyOfRange(gerador.getReverseSortedArray(), 0, tamanho);

        // Vetor Aleatório (Original)
        System.out.println("\nVetor Aleatório: ");
        hs.heapSort(originalArray.clone());
        hs.relatorioHeapSort();

        // Vetor Crescente (Ordenado)
        System.out.println("\nVetor Crescente: ");
        hs.heapSort(sortedArray.clone());
        hs.relatorioHeapSort();

        // Vetor Decrescente (Ordenado de forma reversa)
        System.out.println("\nVetor Decrescente: ");
        hs.heapSort(reverseSortedArray.clone());
        hs.relatorioHeapSort();
    }

    public static void mergeSort(int tamanho, ArrayGenerator gerador) {
        MergeSort mergeSort = new MergeSort();

        System.out.println("\n--- Testando MergeSort com vetor de tamanho " + tamanho + " ---");

        // Recorta os pedaços do array original gerado e faz uma cópia
        int[] originalArray = Arrays.copyOfRange(gerador.getOriginalArray(), 0, tamanho);
        int[] sortedArray = Arrays.copyOfRange(gerador.getSortedArray(), 0, tamanho);
        int[] reverseSortedArray = Arrays.copyOfRange(gerador.getReverseSortedArray(), 0, tamanho);

        // Vetor Aleatório (Original)
        System.out.println("\nVetor Aleatório: ");
        mergeSort.mergeSort(originalArray.clone(), 0, originalArray.clone().length - 1);
        mergeSort.relatorioMergeSort();

        // Vetor Crescente (Ordenado)
        System.out.println("\nVetor Crescente: ");
        mergeSort.mergeSort(sortedArray.clone(), 0, sortedArray.clone().length - 1);
        mergeSort.relatorioMergeSort();

        // Vetor Decrescente (Ordenado de forma reversa)
        System.out.println("\nVetor Decrescente: ");
        mergeSort.mergeSort(reverseSortedArray.clone(), 0, reverseSortedArray.clone().length - 1);
        mergeSort.relatorioMergeSort();

        // Merge Sort não faz trocas, faz inserções de forma ordenada em um novo array
    }

}
