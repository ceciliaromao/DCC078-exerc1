package patterns.abstractfactory;

public class ReciboPessoaFisica implements Recibo {
    @Override
    public String gerar() {
        return "Recibo para Pessoa Física criado.";
    }
}
