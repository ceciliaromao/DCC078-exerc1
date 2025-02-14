package patterns.factorymethod;

public class ServicoReceberPagamento {

    public String executar() {
        return "Pagamento efetivado";
    }

    public String cancelar() {
        return "Pagamento cancelado";
    }
}