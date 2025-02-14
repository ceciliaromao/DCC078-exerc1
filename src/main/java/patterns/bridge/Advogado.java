package patterns.bridge;

public class Advogado extends Cargo {
    private int numCasos;

    public Advogado(float salarioBase) {
        super(salarioBase);
    }

    public void setNumCasos(int numCasos) {
        this.numCasos = numCasos;
    }

    public float calcularSalario() {
        return this.salarioBase * this.numCasos * (1 + this.escolaridade.percentualAumento());
    }
}