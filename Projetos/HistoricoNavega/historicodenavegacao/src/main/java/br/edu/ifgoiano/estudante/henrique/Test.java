package br.edu.ifgoiano.estudante.henrique;

public class Test {
    public static void main(String[] args) {
        
        HistoricoDeNavegacao hn = new HistoricoDeNavegacao();
        //hn.adicionarPagina(null); <= Tratar esse erro.
        hn.adicionarPagina("www.com.br.edu.br");
        hn.adicionarPagina("www.adicionar.com.br");
        hn.adicionarPagina("www.rua.com.br");

        System.out.println("----------------------------------------------");

        hn.exibirHistorico();

    
        hn.limparHistorico(); //<= Mexer nisso também.
    
    }
}
