package patterns.abstractfactory;

public class PessoaFisicaFactory implements DocumentosFactory {
    @Override
    public Contrato criarContrato() {
        return new ContratoPessoaFisica();
    }

    @Override
    public Recibo criarRecibo() {
        return new ReciboPessoaFisica();
    }
}
