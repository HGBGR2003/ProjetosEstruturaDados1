package br.edu.ifgoiano.estudantes.lucas.matheus.henrique;

public class OrdenacaoPorInsercao {

    public int[] ordenacaoInsercao(int[] arrayParaOrdenar) {
        for (int i = 1; i < arrayParaOrdenar.length; i++) {
            int elementoAtual = arrayParaOrdenar[i];
            int auxiliar = i - 1;
            for (;auxiliar >= 0 && arrayParaOrdenar[auxiliar] > elementoAtual;) {
                arrayParaOrdenar[auxiliar + 1] = arrayParaOrdenar[auxiliar];
                auxiliar = auxiliar - 1;
            }
            arrayParaOrdenar[auxiliar + 1] = elementoAtual;
        }
        return arrayParaOrdenar;
    }
}
