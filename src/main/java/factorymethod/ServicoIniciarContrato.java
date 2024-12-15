package factorymethod;

public class ServicoIniciarContrato implements IServico {
    public String executar() {
        return "Novo Contrato efetivado";
    }

    public String cancelar() {
        return "Novo Contrato cancelado";
    }
}