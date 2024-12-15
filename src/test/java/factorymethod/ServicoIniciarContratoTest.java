package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoIniciarContratoTest {
    @Test
    void deveExecutarIniciarContrato() {
        IServico servico = ServicoFactory.obterServico("IniciarContrato");
        assertEquals("Novo Contrato efetivado", servico.executar());
    }

    @Test
    void deveCancelarIniciarContrato() {
        IServico servico = ServicoFactory.obterServico("IniciarContrato");
        assertEquals("Novo Contrato cancelado", servico.cancelar());
    }

}