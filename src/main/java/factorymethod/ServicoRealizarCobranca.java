package factorymethod;

public class ServicoRealizarCobranca implements IServico {

    public String executar() {
        return "Cobrança efetivada";
    }

    public String cancelar() {
        return "Cobrança cancelada";
    }
}
