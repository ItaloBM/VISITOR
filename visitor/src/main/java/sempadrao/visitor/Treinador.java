package sempadrao.visitor;

public class Treinador implements MembroClube {
    private double salarioBase;
    public Treinador(double salarioBase) { this.salarioBase = salarioBase; }
    public double getSalarioBase() { return salarioBase; }
}