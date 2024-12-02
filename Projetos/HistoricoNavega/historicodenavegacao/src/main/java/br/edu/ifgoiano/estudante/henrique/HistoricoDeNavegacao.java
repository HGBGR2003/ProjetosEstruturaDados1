package br.edu.ifgoiano.estudante.henrique;

import java.util.Stack;

public class HistoricoDeNavegacao {

    Stack dados = new Stack<>();

    @SuppressWarnings("unchecked")
    public void adicionarPagina(String url){
    
            try {
                if (url == null || url.isEmpty()) {
                    System.out.println("Erro!");
                }
            } catch (Exception e) {
                System.out.println("Não Funcionou");
            }

            dados.push(url);
            System.out.println(dados);
    }

    public String voltar(){
        return "Voltei";
    }

    public String avancar(){
        return "Avançei";
    }

    public void exibirHistorico(){

    }

    public void limparHistorico(){
        dados.clear();
    }
    
}
