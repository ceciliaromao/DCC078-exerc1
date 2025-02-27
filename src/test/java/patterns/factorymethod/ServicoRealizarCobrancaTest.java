package patterns.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoRealizarCobrancaTest {
    @Test
    void deveExecutarRealizarCobranca() {
        IServico servico = ServicoFactory.obterServico("RealizarCobranca");
        assertEquals("Cobrança efetivada", servico.executar());
    }

    @Test
    void deveCancelarRealizarCobranca() {
        IServico servico = ServicoFactory.obterServico("RealizarCobranca");
        assertEquals("Cobrança cancelada", servico.cancelar());
    }

}