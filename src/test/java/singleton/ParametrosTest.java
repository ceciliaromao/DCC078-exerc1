package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {
    @Test
    public void deveRetornarNomeEscritorio() {
        Parametros.getInstance().setNomeEscritorio("Escritorio A");
        assertEquals("Escritorio A", Parametros.getInstance().getNomeEscritorio());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        Parametros.getInstance().setUsuarioLogado("Maria");
        assertEquals("Maria", Parametros.getInstance().getUsuarioLogado());
    }
}
