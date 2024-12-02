package br.edu.ifgoiano.estudante.henrique;

import java.util.Stack;

public class HistoricoDeNavegacao {

    Stack <String> dados = new Stack<>();

  
    public void adicionarPagina(String url){
    
        if (url == null || url.isEmpty()) {
            System.out.println("Erro!");
        }else{
            dados.push(url);
        }
                    
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
        dados.removeAllElements();
    }
    
}

