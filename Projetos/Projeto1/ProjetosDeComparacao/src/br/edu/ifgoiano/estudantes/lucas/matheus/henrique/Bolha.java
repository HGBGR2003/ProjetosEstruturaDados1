package br.edu.ifgoiano.estudantes.lucas.matheus.henrique;

public class Bolha {

    
    public int[] bolha(int[] vetor) {
        int n = vetor.length;
        boolean troca;
        int comparacoes = 0; 
        int trocas = 0; 
        long startTime = System.currentTimeMillis(); 

        for (int i = 0; i < n - 1; i++) {
            troca = false;
            
            for (int j = 0; j < n - 1 - i; j++) {
                comparacoes++; 
                if (vetor[j] > vetor[j + 1]) {
                    
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    troca = true;
                    trocas++; 
                }
            }

            
            if (!troca) {
                break;
            }
        }

        long endTime = System.currentTimeMillis(); 
        long tempoExecucao = endTime - startTime; 

        // Print the metrics
        System.out.println("Quantidade de comparações: " + comparacoes);
        System.out.println("Quantidade de trocas: " + trocas);
        System.out.println("Tempo de execução (ms): " + tempoExecucao);

        return vetor;
    }
}