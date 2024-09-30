package br.edu.ifgoiano.estudantes.lucas.matheus.henrique;

public class BolhaOtimizado {

    private int contador = 0;       // Contagem de comparações
    private int contadorTroca = 0;  // Contagem de trocas

    // Método de ordenação Bolha Otimizado
    public int[] bolhaOtimizado(int[] vetor) {
        // Reseta as contagens para cada execução
        contador = 0;
        contadorTroca = 0;

        long inicio = System.nanoTime();
        int tamanho = vetor.length;
        boolean trocado;

        // Loop externo para percorrer o array
        for (int i = 0; i < tamanho - 1; i++) {
            trocado = false;

            // Loop interno para comparar e trocar os elementos
            for (int j = 0; j < tamanho - 1 - i; j++) {
                contador++;  // Contabiliza a comparação

                if (vetor[j] > vetor[j + 1]) {
                    // Realiza a troca
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    contadorTroca++;  // Contabiliza a troca
                    trocado = true;   // Marca que uma troca foi feita
                }
            }

            // Se nenhuma troca foi feita no loop interno, o vetor já está ordenado
            if (!trocado) {
                break;  // Sai do loop externo, pois o array já está ordenado
            }
        }

        long fim = System.nanoTime();
        long resultado = fim - inicio;

        // Exibe as estatísticas de ordenação
        System.out.println("Quantidade de comparações (Bolha Otimizado): " + contador);
        System.out.println("Quantidade de trocas: " + contadorTroca);
        System.out.println("Tempo de execução (ns): " + resultado);

        return vetor;
    }
}
