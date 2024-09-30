package br.edu.ifgoiano.estudantes.lucas.matheus.henrique;

public class OrdenacaoPorInsercao {

    private int comparacoesRealizadasOrdenacaoPorInsercao;
    private int trocasRealizadasOrdenacaoPorInsercao;
    private Long tempoExecucaoOrdenacaoPorInsercao;
    int comparacoes = 0;
    int trocas = 0;

    public int[] ordenacaoInsercao(int[] arrayParaOrdenar) {
        long inicioExecucao = System.nanoTime();
        comparacoes = 0;
        trocas = 0;
        for (int i = 1; i < arrayParaOrdenar.length; i++) {
            int elementoAtual = arrayParaOrdenar[i];
            int auxiliar = i - 1;
            for (; auxiliar >= 0 && arrayParaOrdenar[auxiliar] > elementoAtual;) {
                comparacoes++;
                trocas++;
                arrayParaOrdenar[auxiliar + 1] = arrayParaOrdenar[auxiliar];
                auxiliar = auxiliar - 1;
            }
            arrayParaOrdenar[auxiliar + 1] = elementoAtual;
        }
        this.comparacoesRealizadasOrdenacaoPorInsercao = comparacoes;
        this.trocasRealizadasOrdenacaoPorInsercao = trocas;
        this.tempoExecucaoOrdenacaoPorInsercao = System.nanoTime() - inicioExecucao;
        return arrayParaOrdenar;
    }

    public void relatorioOrdenacaoInsercao() {
        System.out.println("Ordenacao por insercao:");
        System.out.println("Comparações feitas: " + this.comparacoesRealizadasOrdenacaoPorInsercao);
        System.out.println("Trocas feitas: " + this.trocasRealizadasOrdenacaoPorInsercao);
        System.out.println("Tempo de ordenação: " + this.tempoExecucaoOrdenacaoPorInsercao + "\n");
    }
}
