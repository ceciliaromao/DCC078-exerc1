package patterns.factorymethod;

public class ServicoConcluirContrato implements IServico {
    public String executar() {
        return "Conclusão de Contrato efetivada";
    }

    public String cancelar() {
        return "Conclusão de Contrato cancelada";
    }
}