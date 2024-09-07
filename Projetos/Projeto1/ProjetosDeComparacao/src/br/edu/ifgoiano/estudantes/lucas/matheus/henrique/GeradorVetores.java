package br.edu.ifgoiano.estudantes.lucas.matheus.henrique;

public class GeradorVetores {

    public int[] vetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = (int) (Math.random() * 1000000);
        }
        return vetor;
    }

    public int[] vetorDecrescente(int tamanho) {
        int[] vetorParaOrdenar = vetorAleatorio(tamanho);
        int tamanhoReferenciaVetor = vetorParaOrdenar.length;
        boolean trocaFeita;
        for (int i = 0; i < tamanhoReferenciaVetor - 1; i++) {
            trocaFeita = false;
            for (int j = 0; j < tamanhoReferenciaVetor - i - 1; j++) {
                if (vetorParaOrdenar[j] < vetorParaOrdenar[j + 1]) {
                    int auxi = vetorParaOrdenar[j];
                    vetorParaOrdenar[j] = vetorParaOrdenar[j + 1];
                    vetorParaOrdenar[j + 1] = auxi;
                    trocaFeita = true;
                }
            }
            if (!trocaFeita) {
                break;
            }
        }
        return vetorParaOrdenar;
    }

    OrdenacaoPorSelecao novoOrdenacao = new OrdenacaoPorSelecao();

    public int[] vetorCrescente(int tamanho) {
        int[] vetorAleatorioCriado = vetorAleatorio(tamanho);
        return novoOrdenacao.ordenandoPorSelecao(vetorAleatorioCriado);
    }
}

