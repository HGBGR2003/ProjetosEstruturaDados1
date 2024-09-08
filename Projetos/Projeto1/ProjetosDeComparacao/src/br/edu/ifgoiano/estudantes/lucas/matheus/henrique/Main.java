package br.edu.ifgoiano.estudantes.lucas.matheus.henrique;

public class Main {
    public static void main(String[] args) {
        GeradorVetores novo = new GeradorVetores();

        OrdenacaoPorInsercao novaOrdenacaoPorInsercao = new OrdenacaoPorInsercao();
        novaOrdenacaoPorInsercao.ordenacaoInsercao(novo.vetorAleatorio(100));

        OrdenacaoPorSelecao novoOdP = new OrdenacaoPorSelecao();
        novoOdP.ordenandoPorSelecao(novo.vetorAleatorio(100));

        BolhaOtimizado bo = new BolhaOtimizado();
        bo.bolhaOtimizado(novo.vetorAleatorio(1000));

        Bolha bolha1 = new Bolha();
        bolha1.bolha(novo.vetorAleatorio(10000));
    }

    public static void exibeArray(int[] vetorMantado) {
        for (int i = 1; i <= vetorMantado.length - 1; i++) {
            System.out.println(vetorMantado[i]);
        }
        System.out.println("\b");
    }


}
