
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import br.edu.ifgoiano.estudante.henrique.HistoricoNavegacao;

public class HistoricoNavegacaoTest {

    @Test
    public void testAdicionarPagina() {
        HistoricoNavegacao historico = new HistoricoNavegacao();
        historico.adicionarPagina("www.exemplo1.com");
        assertEquals("Nenhuma página anterior", historico.voltar());
    }

    @Test
    public void testVoltarParaPaginaAnterior() {
        HistoricoNavegacao historico = new HistoricoNavegacao();
        historico.adicionarPagina("www.exemplo1.com");
        historico.adicionarPagina("www.exemplo2.com");
        assertEquals("www.exemplo1.com", historico.voltar());
    }

    @Test
    public void testAvancarParaProximaPagina() {
        HistoricoNavegacao historico = new HistoricoNavegacao();
        historico.adicionarPagina("www.exemplo1.com");
        historico.adicionarPagina("www.exemplo2.com");
        historico.voltar();
        assertEquals("www.exemplo2.com", historico.avancar());
    }

    @Test
    public void testHistoricoComVariasPaginas() {
        HistoricoNavegacao historico = new HistoricoNavegacao(); // Declaração e inicialização
        historico.adicionarPagina("www.exemplo1.com");
        historico.adicionarPagina("www.exemplo2.com");
        historico.adicionarPagina("www.exemplo3.com");

        // Voltar uma vez, deve ir para www.exemplo2.com
        assertEquals("www.exemplo2.com", historico.voltar());

        // Voltar novamente, deve ir para www.exemplo1.com
        assertEquals("www.exemplo1.com", historico.voltar());

        // Tentar voltar novamente, mas não há mais páginas
        assertEquals("Nenhuma página para voltar", historico.voltar());
    }

    @Test
    public void testLimparHistorico() {
        HistoricoNavegacao historico = new HistoricoNavegacao();
        historico.adicionarPagina("www.exemplo1.com");
        historico.adicionarPagina("www.exemplo2.com");
        historico.limparHistorico();
        assertEquals("Nenhuma página para voltar", historico.voltar());
    }

    @Test
    public void testExibirHistorico() {
        HistoricoNavegacao historico = new HistoricoNavegacao();
        historico.adicionarPagina("www.exemplo1.com");
        historico.adicionarPagina("www.exemplo2.com");
        historico.adicionarPagina("www.exemplo3.com");

        assertDoesNotThrow(() -> historico.exibirHistorico());
    }

    //testes negativos
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
        historico.adicionarPagina("www.exemplo1.com");
        historico.adicionarPagina("www.exemplo2.com");
        historico.voltar();
        historico.limparHistorico();
        assertEquals("Nenhuma página para avançar", historico.avancar());
    }

    @Test
    public void testAdicionarPaginaNula() {
        HistoricoNavegacao historico = new HistoricoNavegacao();
        historico.adicionarPagina(null);
        assertEquals("Nenhuma página para voltar", historico.voltar());
    }

}
