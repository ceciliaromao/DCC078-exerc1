package patterns.abstractfactory;

public class ContratoPessoaJuridica implements Contrato {
    @Override
    public String gerar() {
        return "Contrato para Pessoa Jurídica criado.";
    }
}
