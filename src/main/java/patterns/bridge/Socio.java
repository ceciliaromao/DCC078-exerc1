package patterns.bridge;

public class Socio extends Cargo {
    public Socio(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.escolaridade.percentualAumento());
    }

}
