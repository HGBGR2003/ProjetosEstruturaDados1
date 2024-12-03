
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import br.edu.ifgoiano.estudante.henrique.HistoricoNavegacao;

public class HistoricoNavegacaoTest {

    @Test
    public void testAdicionarPagina() {
        HistoricoNavegacao historico = new HistoricoNavegacao();
        historico.adicionarPagina("https://www.instagram.com/");
        assertEquals("Nenhuma página para voltar", historico.voltar());
    }

    @Test
    public void testVoltarParaPaginaAnterior() {
        HistoricoNavegacao historico = new HistoricoNavegacao();
        historico.adicionarPagina("https://www.instagram.com/");
        historico.adicionarPagina("https://x.com/");
        assertEquals("https://www.instagram.com/", historico.voltar());
    }

    @Test
    public void testAvancarParaProximaPagina() {
        HistoricoNavegacao historico = new HistoricoNavegacao();
        historico.adicionarPagina("https://www.instagram.com/");
        historico.adicionarPagina("https://x.com/");
        historico.voltar();
        assertEquals("https://x.com/", historico.avancar());
    }

    @Test
    public void testHistoricoComVariasPaginas() {
        HistoricoNavegacao historico = new HistoricoNavegacao();
        historico.adicionarPagina("https://www.instagram.com/");
        historico.adicionarPagina("https://x.com/");
        historico.adicionarPagina("https://web.whatsapp.com/");

        assertEquals("https://x.com/", historico.voltar());

        assertEquals("https://www.instagram.com/", historico.voltar());

        assertEquals("Nenhuma página para voltar", historico.voltar());
    }

    @Test
    public void testLimparHistorico() {
        HistoricoNavegacao historico = new HistoricoNavegacao();
        historico.adicionarPagina("https://www.instagram.com/");
        historico.adicionarPagina("https://x.com/");
        historico.limparHistorico();
        assertEquals("Nenhuma página para voltar", historico.voltar());
    }

    @Test
    public void testExibirHistorico() {
        HistoricoNavegacao historico = new HistoricoNavegacao();
        historico.adicionarPagina("https://www.instagram.com/");
        historico.adicionarPagina("https://x.com/");
        historico.adicionarPagina("https://web.whatsapp.com/");

        assertDoesNotThrow(() -> historico.exibirHistorico());
    }

    @Test
    public void testVoltarSemPaginas() {
        HistoricoNavegacao historico = new HistoricoNavegacao();
        assertEquals("Nenhuma página para voltar", historico.voltar());
    }

    @Test
    public void testAvancarSemPaginas() {
        HistoricoNavegacao historico = new HistoricoNavegacao();
        assertEquals("Nenhuma página para avançar", historico.avancar());
    }

    @Test
    public void testAvancarAposLimpar() {
        HistoricoNavegacao historico = new HistoricoNavegacao();
        historico.adicionarPagina("https://www.instagram.com/");
        historico.adicionarPagina("https://x.com/");
        historico.voltar();
        historico.limparHistorico();
        assertEquals("Nenhuma página para avançar", historico.avancar());
    }

}
