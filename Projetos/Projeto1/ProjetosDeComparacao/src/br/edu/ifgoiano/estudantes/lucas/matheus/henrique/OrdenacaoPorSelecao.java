package br.edu.ifgoiano.estudantes.lucas.matheus.henrique;

public class OrdenacaoPorSelecao {
    private int comparacoesRealizadasOrdenacaoPorSelecao;
    private int trocasRealizadasOrdenacaoPorSelecao;
    private Long tempoExecucaoOrdenacaoPorSelecao;
    int comparacoes = 0;
    int trocas = 0;

    public int [] ordenandoPorSelecao(int[] arrayParaOrdenar) {
        long inicioExecucao = System.nanoTime();
        comparacoes = 0 ;
        trocas = 0;
        for (int i = 0; i < arrayParaOrdenar.length - 1; i++) {
            int auxi1 = i;
            for (int j = i + 1; j < arrayParaOrdenar.length; j++) {
                comparacoes++;
                if (arrayParaOrdenar[j] < arrayParaOrdenar[auxi1]) {
                    auxi1 = j;
                }
            }
            int auxi2 = arrayParaOrdenar[auxi1];
            arrayParaOrdenar[auxi1] = arrayParaOrdenar[i];
            arrayParaOrdenar[i] = auxi2;
            trocas++;
        }
        this.comparacoesRealizadasOrdenacaoPorSelecao = comparacoes;
        this.trocasRealizadasOrdenacaoPorSelecao = trocas;
        this.tempoExecucaoOrdenacaoPorSelecao = System.nanoTime() - inicioExecucao;
        return arrayParaOrdenar;
    }
    public void relatorioOrdenacaoSelecao() {
        System.out.println("Ordenacao por seleção:");
        System.out.println("Comparações feitas: " + this.comparacoesRealizadasOrdenacaoPorSelecao);
        System.out.println("Trocas feitas: "+ this.trocasRealizadasOrdenacaoPorSelecao);
        System.out.println("Tempo de ordenação: " + this.tempoExecucaoOrdenacaoPorSelecao + "\n");
    }
}
