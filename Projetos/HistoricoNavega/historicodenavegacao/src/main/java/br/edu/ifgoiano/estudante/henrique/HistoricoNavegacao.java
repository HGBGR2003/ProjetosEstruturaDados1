package br.edu.ifgoiano.estudante.henrique;

import java.util.Stack;

public class HistoricoNavegacao {

    private Stack<String> historico;
    private Stack<String> pilhaAvancar;

    public HistoricoNavegacao() {
        historico = new Stack<>();
        pilhaAvancar = new Stack<>();
    }

    public void adicionarPagina(String url) {
        historico.push(url);
        pilhaAvancar.clear();
    }

    public String voltar() {
        if (historico.size() > 1) {
            String paginaAtual = historico.pop(); 
            pilhaAvancar.push(paginaAtual);
            return historico.peek(); 
        } else if (historico.size() == 1) { 
            return "Nenhuma página para voltar"; 
        } else { 
            return "Nenhuma página para voltar";
        }
    }

    public String avancar() {
        if (!pilhaAvancar.isEmpty()) {
            String proximaPagina = pilhaAvancar.pop();
            historico.push(proximaPagina);
            return proximaPagina;
        } else {
            return "Nenhuma página para avançar";
        }
    }

    public void exibirHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Histórico vazio");
        } else {
            System.out.println("Histórico de navegação:");
            int posicao = historico.size();
            for (int i = historico.size() - 1; i >= 0; i--) {
                System.out.println(posicao-- + ". " + historico.get(i));
            }
        }
    }

    public void limparHistorico() {
        historico.clear();
        pilhaAvancar.clear();
    }
}
