package br.edu.ifgoiano.estudantes.lucas.matheus.henrique;

public class Main {
    public static void main(String[] args) {
        GeradorVetores novo = new GeradorVetores();

//        insercao(1000);
//        insercao(5000);
//        insercao(10000);
//        insercao(15000);
//        insercao(20000);
//        insercao(25000);
//        insercao(30000);
//        insercao(35000);
//        insercao(40000);
//        insercao(45000);
//        insercao(50000);

//        selecao(1000);
//        selecao(5000);
//        selecao(10000);
//        selecao(15000);
//        selecao(20000);
//        selecao(25000);
//        selecao(30000);
//        selecao(35000);
//        selecao(40000);
//        selecao(45000);
//        selecao(50000);

        BolhaOtimizado bo = new BolhaOtimizado();
        bo.bolhaOtimizado(novo.vetorAleatorio(1000));
    }

    public static void exibeArrayParaTeste(int[] vetorMantado) {
        for (int i = 1; i <= vetorMantado.length - 1; i++) {
            System.out.println(vetorMantado[i]);
        }
        System.out.println("\b");
    }

    public static void insercao (int tamanho){
        System.out.println("🔹 Tamanho do array: " + tamanho);
        GeradorVetores novo = new GeradorVetores();
        OrdenacaoPorInsercao ordenacaoPorInsercao = new OrdenacaoPorInsercao();
        System.out.println("\bVetor aleatório");
        ordenacaoPorInsercao.ordenacaoInsercao(novo.vetorAleatorio(tamanho));
        ordenacaoPorInsercao.relatorioOrdenacaoInsercao();
        System.out.println("\bVetor decrescente");
        ordenacaoPorInsercao.ordenacaoInsercao(novo.vetorDecrescente(tamanho));
        ordenacaoPorInsercao.relatorioOrdenacaoInsercao();
        System.out.println("\bVetor crescente");
        ordenacaoPorInsercao.ordenacaoInsercao(novo.vetorCrescente(tamanho));
        ordenacaoPorInsercao.relatorioOrdenacaoInsercao();
    }

    public static void selecao(int tamanho){
        System.out.println("🔹 Tamanho do array: " + tamanho);
        GeradorVetores novo = new GeradorVetores();
        OrdenacaoPorSelecao ordenacaoPorSelecao = new OrdenacaoPorSelecao();
        System.out.println("\bVetor aleatório");
        ordenacaoPorSelecao.ordenandoPorSelecao(novo.vetorAleatorio(tamanho));
        ordenacaoPorSelecao.relatorioOrdenacaoSelecao();
        System.out.println("\bVetor decrescente");
        ordenacaoPorSelecao.ordenandoPorSelecao(novo.vetorDecrescente(tamanho));
        ordenacaoPorSelecao.relatorioOrdenacaoSelecao();
        System.out.println("\bVetor crescente");
        ordenacaoPorSelecao.ordenandoPorSelecao(novo.vetorCrescente(tamanho));
        ordenacaoPorSelecao.relatorioOrdenacaoSelecao();
    }


}
