package br.edu.ifgoiano.estudantes.lucas.matheus.henrique;

public class Main {
    public static void main(String[] args) {
        GeradorVetores novo = new GeradorVetores();

        OrdenacaoPorInsercao ordenacaoPorInsercao = new OrdenacaoPorInsercao();
        ordenacaoPorInsercao.ordenacaoInsercao(novo.vetorAleatorio(100));
        //Exibindo relatório
        ordenacaoPorInsercao.relatorioOrdenacaoInsercao();

        OrdenacaoPorSelecao ordenacaoPorSelecao = new OrdenacaoPorSelecao();
        ordenacaoPorSelecao.ordenandoPorSelecao(novo.vetorAleatorio(100));
        //Exibindo relatório
        ordenacaoPorSelecao.relatorioOrdenacaoSelecao();

        BolhaOtimizado bo = new BolhaOtimizado();
        bo.bolhaOtimizado(novo.vetorAleatorio(1000));
    }

    public static void exibeArray(int[] vetorMantado) {
        for (int i = 1; i <= vetorMantado.length - 1; i++) {
            System.out.println(vetorMantado[i]);
        }
        System.out.println("\b");
    }


}
