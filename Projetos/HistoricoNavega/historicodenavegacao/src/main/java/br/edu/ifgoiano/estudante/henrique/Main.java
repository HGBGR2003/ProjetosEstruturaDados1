package br.edu.ifgoiano.estudante.henrique;

public class Main {

    public static void main(String[] args) {
        HistoricoNavegacao historico = new HistoricoNavegacao();

        historico.adicionarPagina("https://www.instagram.com/");
        historico.adicionarPagina("https://x.com/");
        historico.adicionarPagina("https://web.whatsapp.com/");

        historico.exibirHistorico();

        String paginaAnterior = historico.voltar();
        System.out.println("Voltou para: " + paginaAnterior);

        String proximaPagina = historico.avancar();
        System.out.println("Avançou para: " + proximaPagina);

        historico.limparHistorico();
        historico.exibirHistorico();
    }
}
