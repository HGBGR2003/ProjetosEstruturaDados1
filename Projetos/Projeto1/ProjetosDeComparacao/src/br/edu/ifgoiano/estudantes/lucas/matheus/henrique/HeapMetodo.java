package br.edu.ifgoiano.estudantes.lucas.matheus.henrique;

public class HeapMetodo {
    public void heapSort(int vetor[]){
        int n = vetor.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
           heapify(vetor, i, n);
        }

        for (int i = n - 1; i > 0; i--) {
            int aux = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = aux;

            heapify(vetor, i, 0);

        }



    }

    public void heapify(int vetor[], int n, int i){
        int maior = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < n && vetor[esquerda] > vetor[maior]){
            maior = esquerda;
        }

        if (direita < n && vetor[direita] > vetor[maior]){
            maior = direita;
        }

        if (maior != i){
            int auxiliar = vetor[i];
            vetor[i] = vetor[maior];
            vetor[maior] = auxiliar;
        }

        heapify(vetor, n, maior);

    }

    public void imprivirVetor(int vetor []){
        int n = vetor.length;
        for (int i = 0; i < n; i++) {
            System.out.println(vetor[i] + " ");
            System.out.println();
        }
    }

}
