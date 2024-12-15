package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoRecisaoContratoTest {
    @Test
    void deveExecutarRecisaoContrato() {
        IServico servico = ServicoFactory.obterServico("RecisaoContrato");
        assertEquals("Recisao de Contrato efetivada", servico.executar());
    }

    @Test
    void deveCancelarRecisaoContrato() {
        IServico servico = ServicoFactory.obterServico("RecisaoContrato");
        assertEquals("Recisao de Contrato cancelada", servico.cancelar());
    }

}