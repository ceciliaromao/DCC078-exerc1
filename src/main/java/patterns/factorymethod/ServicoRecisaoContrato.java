package patterns.factorymethod;

public class ServicoRecisaoContrato implements IServico {

    public String executar() {
        return "Recisao de Contrato efetivada";
    }

    public String cancelar() {
        return "Recisao de Contrato cancelada";
    }
}