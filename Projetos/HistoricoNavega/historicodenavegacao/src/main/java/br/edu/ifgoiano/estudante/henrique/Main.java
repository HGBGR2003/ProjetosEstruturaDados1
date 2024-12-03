package br.edu.ifgoiano.estudante.henrique;

public class Main {

    public static void main(String[] args) {
        HistoricoNavegacao historico = new HistoricoNavegacao();

        historico.adicionarPagina("www.exemplo1.com");
        historico.adicionarPagina("www.exemplo2.com");
        historico.adicionarPagina("www.exemplo3.com");

        historico.exibirHistorico();

        String paginaAnterior = historico.voltar();
        System.out.println("Voltou para: " + paginaAnterior);

        String proximaPagina = historico.avancar();
        System.out.println("Avançou para: " + proximaPagina);

        historico.limparHistorico();
        historico.exibirHistorico();
    }
}
