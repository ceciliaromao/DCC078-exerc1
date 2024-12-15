package abstractfactory;

public class ContratoPessoaFisica implements Contrato {
    @Override
    public String gerar() {
         return "Contrato para Pessoa Física criado.";
    }
}
