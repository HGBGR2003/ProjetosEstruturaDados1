package br.edu.ifgoiano.estudantes.lucas.matheus.henrique;

public class Main {
    public static void main(String[] args) {
        GeradorVetores novo = new GeradorVetores();

  insercao(1000);
       insercao(5000);
       insercao(10000);
       insercao(15000);
       insercao(20000);
       insercao(25000);
       insercao(30000);
       insercao(35000);
       insercao(40000);
       insercao(45000);
       insercao(50000);

       selecao(1000);
       selecao(5000);
       selecao(10000);
       selecao(15000);
       selecao(20000);
       selecao(25000);
       selecao(30000);
       selecao(35000);
       selecao(40000);
       selecao(45000);
       selecao(50000);

bolha(1000);
       bolha(5000);
       bolha(10000);
       bolha(15000);
       bolha(20000);
       bolha(25000);
       bolha(30000);
       bolha(35000);
       bolha(40000);
       bolha(45000);
       bolha(50000);

       bolhaOtimizado(1000);
       bolhaOtimizado(5000);
       bolhaOtimizado(10000);
       bolhaOtimizado(15000);
       bolhaOtimizado(20000);
       bolhaOtimizado(25000);
       bolhaOtimizado(30000);
       bolhaOtimizado(35000);
       bolhaOtimizado(40000);
       bolhaOtimizado(45000);
       bolhaOtimizado(50000);



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

        System.out.println("\bVetor crescente");
        ordenacaoPorInsercao.ordenacaoInsercao(novo.vetorCrescente(tamanho));
        ordenacaoPorInsercao.relatorioOrdenacaoInsercao();

        System.out.println("\bVetor decrescente");
        ordenacaoPorInsercao.ordenacaoInsercao(novo.vetorDecrescente(tamanho));
        ordenacaoPorInsercao.relatorioOrdenacaoInsercao();
        
        System.out.println("\bVetor aleatório");
        ordenacaoPorInsercao.ordenacaoInsercao(novo.vetorAleatorio(tamanho));
        ordenacaoPorInsercao.relatorioOrdenacaoInsercao();
        
       
    }

    public static void selecao(int tamanho){
        System.out.println("🔹 Tamanho do array: " + tamanho);
        GeradorVetores novo = new GeradorVetores();
        OrdenacaoPorSelecao ordenacaoPorSelecao = new OrdenacaoPorSelecao();

        System.out.println("\bVetor crescente");
        ordenacaoPorSelecao.ordenandoPorSelecao(novo.vetorCrescente(tamanho));
        ordenacaoPorSelecao.relatorioOrdenacaoSelecao();

        System.out.println("\bVetor decrescente");
        ordenacaoPorSelecao.ordenandoPorSelecao(novo.vetorDecrescente(tamanho));
        ordenacaoPorSelecao.relatorioOrdenacaoSelecao();

        System.out.println("\bVetor aleatório");
        ordenacaoPorSelecao.ordenandoPorSelecao(novo.vetorAleatorio(tamanho));
        ordenacaoPorSelecao.relatorioOrdenacaoSelecao();
        
        
    }

    public static void bolha(int tamanho){
        Bolha bolha1 = new Bolha();
        GeradorVetores novo = new GeradorVetores();

        System.out.println("\nVetor Crescente: ");
        bolha1.bolha(novo.vetorCrescente(tamanho));

        System.out.println("\nVetor Decrescente: ");
        bolha1.bolha(novo.vetorDecrescente(tamanho));

        System.out.println("\nVetor Aleatorio: ");
        bolha1.bolha(novo.vetorAleatorio(tamanho));


    }

    public static void bolhaOtimizado(int tamanho){
        BolhaOtimizado bo = new BolhaOtimizado();
        GeradorVetores novo = new GeradorVetores();

        System.out.println("\nVetor Crescente: ");
        bo.bolhaOtimizado(novo.vetorCrescente(tamanho));

        System.out.println("\nVetor Decrescente: ");
        bo.bolhaOtimizado(novo.vetorDecrescente(tamanho));

        System.out.println("\nVetor Aleatorio: ");
        bo.bolhaOtimizado(novo.vetorAleatorio(tamanho));


    }

    public static void HeapSort(int tamanho){
        HeapMetodo hm = new HeapMetodo();
        GeradorVetores novo = new GeradorVetores();

        System.out.println("\nVetor Crescente: ");
        int[] crescente = novo.vetorCrescente(tamanho);
        hm.heapSort(crescente);
        hm.imprivirVetor(crescente);

        System.out.println("Ola Mundo");

        //Algo

        /* Continua mais tarde.
           System.out.println("\nVetor Decrescente: ");
        hm.heapSort(novo.vetorDecrescente(tamanho));

        System.out.println("\nVetor Aleatorio: ");
        hm.heapSort(novo.vetorAleatorio(tamanho));
        */


    }


}
