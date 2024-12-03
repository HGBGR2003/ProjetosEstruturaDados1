package br.edu.ifgoiano.estudante.henrique;

import java.util.Stack;

public class HistoricoNavegacao {

    private Stack<String> historico; // Pilha principal para armazenar o histórico de navegação
    private Stack<String> pilhaAvancar; // Pilha auxiliar para "Avançar"

    public HistoricoNavegacao() {
        historico = new Stack<>();
        pilhaAvancar = new Stack<>();
    }

    // Adiciona uma nova página ao histórico
    public void adicionarPagina(String url) {
        historico.push(url);
        pilhaAvancar.clear(); // Limpa a pilha de avançar, pois ao adicionar nova página não há páginas futuras
    }

    public String voltar() {
        if (historico.size() > 1) { // Certifica-se de que há pelo menos uma página anterior
            String paginaAtual = historico.pop(); // Remove a página atual
            pilhaAvancar.push(paginaAtual); // Move a página atual para a pilha de avançar
            return historico.peek(); // Retorna a página anterior
        } else if (historico.size() == 1) { // Apenas uma página no histórico
            return "Nenhuma página para voltar"; // Não há páginas anteriores
        } else { // Histórico está vazio
            return "Nenhuma página para voltar";
        }
    }

    // Avança para a próxima página
    public String avancar() {
        if (!pilhaAvancar.isEmpty()) {
            String proximaPagina = pilhaAvancar.pop();
            historico.push(proximaPagina);
            return proximaPagina;
        } else {
            return "Nenhuma página para avançar";
        }
    }

    // Exibe o histórico na ordem FILO
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

    // Limpa todo o histórico
    public void limparHistorico() {
        historico.clear();
        pilhaAvancar.clear();
    }
}
