package sempadrao.visitor;

public class Jogador implements MembroClube {
    private double salarioBase;
    public Jogador(double salarioBase) { this.salarioBase = salarioBase; }
    public double getSalarioBase() { return salarioBase; }
}