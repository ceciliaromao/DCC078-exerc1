package abstractfactory;

public interface DocumentosFactory {
    Contrato criarContrato();
    Recibo criarRecibo();
}
