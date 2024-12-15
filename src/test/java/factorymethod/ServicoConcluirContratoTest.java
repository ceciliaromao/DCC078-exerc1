package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoConcluirContratoTest {
    @Test
    void deveExecutarConcluirContrato() {
        IServico servico = ServicoFactory.obterServico("ConcluirContrato");
        assertEquals("Conclusão de Contrato efetivada", servico.executar());
    }

    @Test
    void deveCancelarConcluirContrato() {
        IServico servico = ServicoFactory.obterServico("ConcluirContrato");
        assertEquals("Conclusão de Contrato cancelada", servico.cancelar());
    }

}