package patterns.abstractfactory;

public class Cliente {
    private Contrato contrato;
    private Recibo recibo;

    public Cliente (DocumentosFactory factory){
        this.contrato = factory.criarContrato();
        this.recibo = factory.criarRecibo();
    }

    public String gerarContrato(){
        return this.contrato.gerar();
    }

    public String gerarRecibo(){
        return this.recibo.gerar();
    }
}
