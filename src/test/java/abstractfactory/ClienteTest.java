package abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveEmitirContatoPessoaFisica() {
        DocumentosFactory factory = new PessoaFisicaFactory();
        Cliente cliente = new Cliente(factory);
        assertEquals("Contrato para Pessoa Física criado.", cliente.gerarContrato());
    }

    @Test
    void deveEmitirContatoPessoaJuridica() {
        DocumentosFactory factory = new PessoaJuridicaFactory();
        Cliente cliente = new Cliente(factory);
        assertEquals("Contrato para Pessoa Jurídica criado.", cliente.gerarContrato());

    }

    @Test
    void deveEmitirReciboPessoaFisica() {
        DocumentosFactory factory = new PessoaFisicaFactory();
        Cliente cliente = new Cliente(factory);
        assertEquals("Recibo para Pessoa Física criado.", cliente.gerarRecibo());
    }

    @Test
    void deveEmitirReciboPessoaJuridica() {
        DocumentosFactory factory = new PessoaJuridicaFactory();
        Cliente cliente = new Cliente(factory);
        assertEquals("Recibo para Pessoa Jurídica criado.", cliente.gerarRecibo());
    }
}
