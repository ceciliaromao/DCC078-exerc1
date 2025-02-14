package patterns.abstractfactory;

public class ReciboPessoaJuridica implements Recibo {
    @Override
    public String gerar() {
        return "Recibo para Pessoa Jurídica criado.";
    }
}
