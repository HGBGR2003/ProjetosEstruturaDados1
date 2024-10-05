package br.edu.ifgoiano.estudantes.lucas.matheus.henrique;

public class MergeSort {
    private int trocas = 0;
    private int comparacoes = 0;
    private long tempo = 0;

    public void mergeSort(int[] array, int inicio, int fim) {
        long inicioExecucao = System.nanoTime();

        this.comparacoes += 1;
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;

            mergeSort(array, inicio, meio);
            mergeSort(array, meio + 1, fim);

            merge(array, inicio, meio, fim);
        }
        this.tempo += System.nanoTime() - inicioExecucao;
    }

    public void merge(int[] array, int inicio, int meio, int fim) {
        long inicioExecucao = System.nanoTime();
        int[] esquerda = new int[meio - inicio + 1];
        int[] direita = new int[fim - meio];

        this.comparacoes++;
        for (int i = 0; i < esquerda.length; ++i) {
            if(i!=0)this.comparacoes++;
            esquerda[i] = array[inicio + i];
        }
        this.comparacoes++;
        for (int i = 0; i < direita.length; ++i) {
            if(i!=0)this.comparacoes++;
            direita[i] = array[meio + 1 + i];
        }

        int eIndex = 0;
        int dIndex = 0;
        int aIndex = inicio;

        this.comparacoes++;
        while (eIndex < esquerda.length && dIndex < direita.length) {
            this.comparacoes++;
            if (esquerda[eIndex] <= direita[dIndex]) {
                array[aIndex] = esquerda[eIndex];
                eIndex++;
            } else {
                array[aIndex] = direita[dIndex];
                dIndex++;
            }
            this.trocas++;
            aIndex++;
        }

        this.comparacoes++;//comparação verificação duplicada
        while (eIndex < esquerda.length) {
            this.comparacoes++;
            this.trocas++;
            array[aIndex++] = esquerda[eIndex++];
        }

        this.comparacoes++;
        while (dIndex < direita.length) {
            this.comparacoes++;
            this.trocas++;
            array[aIndex++] = direita[dIndex++];
        }
        this.tempo += System.nanoTime() - inicioExecucao;
    }

    public void relatorioMergeSort() {
        System.out.println("MergeSort:");
        System.out.println("Comparações feitas: " + this.comparacoes);
        System.out.println("Trocas feitas: " + this.trocas);
        System.out.println("Tempo de execução (ns): " + this.tempo + "\n");
    }

}
