package abstractfactory;

public class PessoaJuridicaFactory implements DocumentosFactory {
    @Override
    public Contrato criarContrato() {
        return new ContratoPessoaJuridica();
    }

    @Override
    public Recibo criarRecibo() {
        return new ReciboPessoaJuridica();
    }
}
